package datastructures.linkedlist;

//https://leetcode.com/problems/lru-cache/

import java.util.HashMap;
import java.util.Map;

public class _146 {

    static class LRUCache {
        private int capacity = 0;
        private int currentSize = 0;
        private ListNode<Integer> head = new ListNode<>();
        private ListNode<Integer> tail = head;

        private final Map<Integer, Integer> data = new HashMap<>();

        public LRUCache(int capacity) {
            this.capacity = capacity;
        }

        public int get(int key) {
            ListNode<Integer> pointer = head;
            while(pointer != null) {
                if(pointer.val == key) {
                    tail.next = pointer;
                    tail = tail.next;
                }
                pointer = pointer.next;
            }
            return data.getOrDefault(key, -1);
        }

        public void put(int key, int value) {
            if(currentSize == capacity) {
                data.remove(head.val);
                head = head.next;
                currentSize--;
            }

            data.put(key, value);

            ListNode<Integer> newNode = new ListNode<>(key);
            if(currentSize == 0)
                head = newNode;
            else {
                tail.next = newNode;
                tail = tail.next;
            }

            currentSize++;
        }
    }

    public static void main(String[] args) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        lRUCache.get(1);    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        lRUCache.get(2);    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        lRUCache.get(1);    // return -1 (not found)
        lRUCache.get(3);    // return 3
        lRUCache.get(4);    // return 4
    }

}
