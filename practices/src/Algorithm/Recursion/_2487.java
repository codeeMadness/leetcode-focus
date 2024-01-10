package Algorithm.Recursion;

//https://leetcode.com/problems/remove-nodes-from-linked-list/

import DataStructures.LinkedList.ListNode;

public class _2487 {
    public static ListNode<Integer> removeNodes(ListNode<Integer> head) {
        if(head.next == null) return head;
        head.next = removeNodes(head.next);
        if((Integer)head.next.val > head.val)
            return head.next;
        return head;
    }
    public static void main(String[] args) {
//        ListNode<Integer> head = ListNode.convert(5,2,13,3,8); //[13,8]
        ListNode<Integer> head = ListNode.convert(1,1,1,1); //[1,1,1,1]
//        ListNode<Integer> head = ListNode.convert(1,2,3,4,5); //[5]
        ListNode.print(removeNodes(head));

    }
}
