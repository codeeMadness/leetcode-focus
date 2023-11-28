package DataStructures.LinkedList;

//https://leetcode.com/problems/lru-cache/

import java.util.HashMap;
import java.util.Map;

public class _146 {

    static class Node {
        private int key;
        private int val;
        private Node next;
        private Node prev;
        public Node(int key, int val, Node next, Node prev) {
            this.key = key;
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    static class LRUCache {
        private int capacity;
        private Node dummyHead;
        private Node dummyTail;
        private Map<Integer, Node> map;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            this.dummyHead = new Node(-1, -1);
            this.dummyTail = new Node(-1, -1);
            this.dummyHead.next = dummyTail;
            this.dummyTail.prev = this.dummyHead;
            this.map = new HashMap<>();
        }

        public int get(int key) {
            if(map.containsKey(key)) {
                Node node = map.get(key);
                remove(node);
                add(node);
                return node.val;
            }
            return -1;
        }

        public void put(int key, int value) {
            //remove current node if exists
            if(map.containsKey(key))
                remove(map.get(key));

            //add node at front
            Node node = new Node(key, value);
            add(node);
            map.put(key, node);

            //remove last node if capacity is full
            if(capacity < 0) {
                Node lastNode = this.dummyTail.prev;
                int theKey = lastNode.key;
                map.remove(theKey);
                remove(lastNode);
            }
        }

        private void add(Node node) {
            Node firstNode = this.dummyHead.next;
            this.dummyHead.next = node;
            firstNode.prev = node;
            node.next = firstNode;
            node.prev = this.dummyHead;
            this.capacity -= 1;
        }

        private void remove(Node node) {
            Node prevNode = node.prev;
            Node nextNode = node.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
            this.capacity += 1;
        }
    }

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        System.out.println(lRUCache.get(1));    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println(lRUCache.get(2));    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println(lRUCache.get(1));    // return -1 (not found)
        System.out.println(lRUCache.get(3));    // return 3
        System.out.println(lRUCache.get(4));    // return 4
    }

}
