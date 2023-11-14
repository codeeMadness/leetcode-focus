package datastructures.linkedlist;

//https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/

public class _1171 {
    public static ListNode<Integer> removeZeroSumSublists(ListNode head) {
        return head;
    }

    public static void main(String[] args) {
        ListNode<Integer> head = ListNode.convert(1,2,-3,3,1);
        ListNode.print(removeZeroSumSublists(head));
    }
}
