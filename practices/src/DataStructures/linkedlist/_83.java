package DataStructures.linkedlist;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class _83 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while(current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, null)))));
        ListNode result = deleteDuplicates(head);

        ListNode.print(result);
    }
}
