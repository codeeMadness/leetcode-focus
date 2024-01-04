package DataStructures.LinkedList;

//https://leetcode.com/problems/palindrome-linked-list/

public class _234 {
    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head, prev, temp;
        //find middle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //reverse half start
        prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        //compare value
        fast = head;
        slow = prev;
        while (slow != null) {
            if (fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1, null))));
//        head = new ListNode(1, new ListNode(2, null));
        System.out.println(isPalindrome(head));
    }
}
