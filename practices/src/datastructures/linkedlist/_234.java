package datastructures.linkedlist;

//https://leetcode.com/problems/palindrome-linked-list/

public class _234 {
    public static boolean isPalindrome(ListNode head) {
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1, null))));
//        head = new ListNode(1, new ListNode(2, null));
        System.out.println(isPalindrome(head));
    }
}
