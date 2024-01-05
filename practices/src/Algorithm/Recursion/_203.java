package Algorithm.Recursion;

import DataStructures.LinkedList.ListNode;

//https://leetcode.com/problems/remove-linked-list-elements/
public class _203 {
    public static ListNode<Integer> removeElements(ListNode<Integer> head, int val) {
        ListNode<Integer> dummy = new ListNode<>(-1);
        dummy.next = head;
        return remove(dummy, head, val);
    }

    public static ListNode<Integer> remove(ListNode<Integer> prev, ListNode<Integer> curr, int val) {
        if(curr == null) return null;
        if(curr.val == val) {
            prev.next = curr.next;
            return remove(prev, prev.next, val);
        }
        return remove(curr, curr.next, val);

    }

    public static void main(String[] args) {
//        ListNode<Integer> head = ListNode.convert(1,2,6,3,4,5,6); int val = 6;
//        ListNode<Integer> head = null; int val = 1;
        ListNode<Integer> head = ListNode.convert(7,7,7,7); int val = 7;
        removeElements(head, val);
        ListNode.print(head);
    }
}
