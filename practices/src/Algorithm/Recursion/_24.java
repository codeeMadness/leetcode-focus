package Algorithm.Recursion;

//https://leetcode.com/problems/swap-nodes-in-pairs/

import DataStructures.LinkedList.ListNode;

public class _24 {
    public static ListNode<Integer> swapPairs(ListNode<Integer> head) {
        ListNode<Integer> dummy = new ListNode<>(-999);
        dummy.next = head;
        swap(dummy, head);
        return dummy.next;
    }

    private static ListNode<Integer> swap(ListNode<Integer> prev, ListNode<Integer> first) {
        if(first == null || first.next == null) return null;
        ListNode<Integer> temp = first.next;
        first.next = first.next.next;
        temp.next = first;
        first = temp;
        prev.next = first;
        return swap(first.next, first.next.next);
    }

    public static ListNode swapPairs2(ListNode head) {
        if ((head == null)||(head.next == null))
            return head;
        ListNode n = head.next;
        head.next = swapPairs2(head.next.next);
        n.next = head;
        return n;
    }

    public static void main(String[] args) {
        ListNode<Integer> head = ListNode.convert(1,2,3,4,5,6);
//        ListNode<Integer> head = ListNode.convert(1);
        ListNode.print(swapPairs2(head));
    }
}
