package datastructures.linkedlist;

//https://leetcode.com/problems/add-two-numbers-ii/description/

import java.util.List;

public class _445 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //reverse
        l1 = ListNode.reverse(l1);
        l2 = ListNode.reverse(l2);

        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val != null ? l1.val : 0 : 0;
            int digit2 = (l2 != null) ? l2.val != null ? l2.val : 0 : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        result = ListNode.reverse(result);

        return result.next;
    }

    public static void main(String[] args) {
        ListNode l1 = ListNode.convert(7,2,4,3);
        ListNode l2 = ListNode.convert(5,6,4);

        ListNode result = addTwoNumbers(l1, l2); //[7,8,0,7]
        ListNode.print(result);
    }
}
