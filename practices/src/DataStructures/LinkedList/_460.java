package DataStructures.LinkedList;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/lfu-cache/
public class _460 {

    static class Node {
        private int key;
        private int val;

        private int cnt;
        private Node next;
        private Node prev;

        public Node(int key, int val) {
            this.key = key;
            this.val = val;
            this.next = null;
            this.prev = null;
            this.cnt = 0;
        }

        public Node(int key, int val, int cnt) {
            this.key = key;
            this.val = val;
            this.next = null;
            this.prev = null;
            this.cnt = cnt;
        }
    }

    static class LFUCache {
        private int capacity;
        private Node dummyHead;
        private Node dummyTail;
        private Map<Integer, Node> map;

        public LFUCache(int capacity) {
            this.capacity = capacity;
            this.dummyHead = new Node(-1, -1);
            this.dummyTail = new Node(-1, -1);
            this.dummyHead.next = dummyTail;
            this.dummyTail.prev = this.dummyHead;
            this.map = new HashMap<>();
        }

        public int get(int key) {
            map.get(key);
            return -1;
        }

        public void put(int key, int value) {
            Node node = new Node(key, value, cnt(key));
            map.put(key, node);
        }

        private int cnt(int key) {
            return 1;
        }

        private void add(Node node) {

        }

        private void remove(Node node) {
            Node prevNode = node.prev;
            Node nextNode = node.next;
            prevNode.next = nextNode;
            nextNode.prev = prevNode;
        }
    }

    public static void main(String[] args) {
        LFUCache lfu = new LFUCache(2);
        lfu.put(1, 1);   // cache=[1,_], cnt(1)=1
        lfu.put(2, 2);   // cache=[2,1], cnt(2)=1, cnt(1)=1
        lfu.get(1);      // return 1
        // cache=[1,2], cnt(2)=1, cnt(1)=2
        lfu.put(3, 3);   // 2 is the LFU key because cnt(2)=1 is the smallest, invalidate 2.
        // cache=[3,1], cnt(3)=1, cnt(1)=2
        lfu.get(2);      // return -1 (not found)
        lfu.get(3);      // return 3
        // cache=[3,1], cnt(3)=2, cnt(1)=2
        lfu.put(4, 4);   // Both 1 and 3 have the same cnt, but 1 is LRU, invalidate 1.
        // cache=[4,3], cnt(4)=1, cnt(3)=2
        lfu.get(1);      // return -1 (not found)
        lfu.get(3);      // return 3
        // cache=[3,4], cnt(4)=1, cnt(3)=3
        lfu.get(4);      // return 4
        // cache=[4,3], cnt(4)=2, cnt(3)=3
    }
}
