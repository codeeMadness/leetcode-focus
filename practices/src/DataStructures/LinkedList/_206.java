package DataStructures.LinkedList;

//https://leetcode.com/problems/reverse-linked-list/

public class _206 {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp;

        while(head != null) {
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        ListNode result = reverseList(head);
        System.out.println();
    }
}
