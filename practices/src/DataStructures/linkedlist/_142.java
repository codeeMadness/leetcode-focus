package DataStructures.linkedlist;

//https://leetcode.com/problems/linked-list-cycle-ii/

public class _142 {

    public static ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }

        if (fast == null || fast.next == null) return null;

        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4, null)))); //1
//        ListNode head = new ListNode(1, new ListNode(2, null)); //0
//        ListNode head = new ListNode(1, null);

        detectCycle(head);
    }
}
