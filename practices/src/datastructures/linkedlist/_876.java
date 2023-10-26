package datastructures.linkedlist;

//https://leetcode.com/problems/middle-of-the-linked-list/description/

public class _876 {
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, null))))));

        ListNode result = middleNode(head);

        if(null != result)
            System.out.println(result.val);
        else
            System.out.println("No Middle");
    }
}
