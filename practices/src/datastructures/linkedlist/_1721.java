package datastructures.linkedlist;

//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/

import java.util.List;

public class _1721 {

    public static ListNode swapNodes(ListNode head, int k) {
        int n = 0;

        //find length
        ListNode current = head;
        while(current != null) {
            current = current.next;
            n++;
        }
//        System.out.println(n);

        int left = k-1;
        int right = n - k;
        ListNode leftNode = new ListNode();
        ListNode rightNode = new ListNode();
        current = head;

        for(int i = 0; i < n; i++) {
            if(i == left)
                leftNode = current;
            if(i == right)
                rightNode = current;
            current = current.next;
        }

//        System.out.println(leftNode.val);
//        System.out.println(rightNode.val);

        int temp = leftNode.val;
        leftNode.val = rightNode.val;
        rightNode.val = temp;


        return head;
    }

    public static ListNode swapNodes2(ListNode head, int k) {
        ListNode n1 = null, n2 = null;

        for (var current = head; current != null; current = current.next) {

            if (n2 != null)
                n2 = n2.next;

            if (--k == 0) {
                n1 = current;
                n2 = head;
            }
        }

        // The problem description specifically asks to swap values, not nodes themselves.
        var tmp = n1.val;
        n1.val = n2.val;
        n2.val = tmp;
        return head;
    }


    public static void main(String[] args) {
        ListNode head = ListNode.convert(new int[] {1,2,3,4,5});
//        ListNode head = ListNode.convert(new int[] {7,9,6,6,7,8,3,0,9,5});

//        ListNode head = new ListNode(1, new ListNode(2));
        ListNode result = swapNodes2(head, 2);
        ListNode.print(result);

    }
}
