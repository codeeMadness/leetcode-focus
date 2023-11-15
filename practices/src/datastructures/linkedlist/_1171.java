package datastructures.linkedlist;

//https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/

import java.util.HashMap;
import java.util.Map;

public class _1171 {
    public static ListNode<Integer> removeZeroSumSublists(ListNode<Integer> head) {
        ListNode<Integer> dummy = new ListNode(0); //trick
        ListNode<Integer> current = dummy;
        dummy.next = head;

        int prefix = 0;

        Map<Integer, ListNode> map = new HashMap<>();

        while (current != null) {
            prefix += current.val;

            if (map.containsKey(prefix)) {
                current =  map.get(prefix).next;
                int sum = prefix + current.val;
                while (sum != prefix) {
                    map.remove(sum);
                    current = current.next;
                    sum += current.val;
                }
                map.get(prefix).next = current.next;

            } else {
                map.put(prefix, current);
            }

            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
//        ListNode<Integer> head = ListNode.convert(1,2,-3,3,1); //[3,1]
//        ListNode<Integer> head = ListNode.convert(1,2,3,-3,4); //[1,2,4]
        ListNode<Integer> head = ListNode.convert(1,2,3,-3,-2); //[1]
        ListNode.print(removeZeroSumSublists(head));
    }
}
