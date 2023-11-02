package datastructures.linkedlist;

//https://leetcode.com/problems/remove-duplicates-from-sorted-list/

public class _83 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;

        while(list != null && list.next != null) {
            if (list.val == list.next.val) {
                list.next = list.next.next;
            } else {
                list = list.next;
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
