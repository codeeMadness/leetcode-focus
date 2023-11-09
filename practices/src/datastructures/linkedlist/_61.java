package datastructures.linkedlist;

//https://leetcode.com/problems/rotate-list/description/

public class _61 {
    public static ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0) {
            return head;
        }

        ListNode tail = head;
        int len = 1;
        while(tail.next != null) {
            tail = tail.next;
            len++;
        }

        tail.next = head;
        k %= len;
        for(int i = 0; i < len - k; i++) {
            tail = tail.next;
        }

        head = tail.next;
        tail.next = null;
        return head;
    }

    public static void main(String[] args) {
//        ListNode head = ListNode.convert(1,2,3,4,5); //[4,5,1,2,3]
//        ListNode result = rotateRight(head, 2);

//        ListNode head = ListNode.convert(0,1,2); //[2,0,1]
//        ListNode result = rotateRight(head, 4);

//        ListNode head = ListNode.convert(); //[0]
//        ListNode result = rotateRight(head, 0);

        ListNode head = ListNode.convert(1,2); //[0]
        ListNode result = rotateRight(head, 1);

        ListNode.print(result);
    }
}
