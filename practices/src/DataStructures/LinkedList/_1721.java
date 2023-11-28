package DataStructures.LinkedList;

//https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/

public class _1721 {

    public static ListNode<Integer> swapNodes(ListNode<Integer> head, int k) {
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
        ListNode<Integer> leftNode = new ListNode();
        ListNode<Integer> rightNode = new ListNode();
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

    // Swapping Nodes instead of values
    // Two Pointers Swap Nodes time: O(n) space: O(1)
    public static ListNode swapNodes3(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode preLeft = dummy;
        ListNode left = head;
        ListNode preRight = dummy;
        ListNode right = head;

        // find the k-th node
        for (int i = 1; i < k; i++) {
            preLeft = preLeft.next;
            left = left.next;
        }

        // find the k-th last node
        ListNode current = left;
        while (current.next != null) {
            current = current.next;
            preRight = preRight.next;
            right = right.next;
        }

        ListNode temp = left.next;
        // if right is the left neighbor of left
        if (preLeft == right) {
            preRight.next = left;
            left.next = right;
            right.next = temp;
        } else if (left == preRight) { // if left is the right neighbor of left
            left.next = right.next;
            preLeft.next = right;
            right.next = left;
        } else { // common cases.
            preLeft.next = right;
            left.next = right.next;
            preRight.next = left;
            right.next = temp;
        }

        return dummy.next;
    }


    public static void main(String[] args) {
//        ListNode head = ListNode.convert(1,2,3,4,5);
//        ListNode head = ListNode.convert(7,9,6,6,7,8,3,0,9,5);

        ListNode head = ListNode.convert(1,2);
//        ListNode result = swapNodes2(head, 2);
        ListNode result = swapNodes3(head, 1);
//        ListNode result = swapNodes3(head, 2);
        ListNode.print(result);

    }
}
