package datastructures.linkedlist;

//https://leetcode.com/problems/reverse-linked-list-ii/

public class _92 {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0); // created dummy node
        dummy.next = head;
        ListNode prev = dummy; // initialising prev pointer on dummy node

        for(int i = 0; i < left - 1; i++)
            prev = prev.next; // adjusting the prev pointer on its actual index

        ListNode curr = prev.next; // curr pointer will be just after prev
        // reversing
        for(int i = 0; i < right - left; i++){
            ListNode forward = curr.next; // forward pointer will be after curr
            curr.next = forward.next;
            forward.next = prev.next;
            prev.next = forward;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = reverseBetween(head, 2, 4);
        ListNode.print(result);

        //dummy = 0>1>2>3>4>5>null
        //prev = 0>1>2>3>4>5>null

        //prev = 1>2>3>4>5>null

        //curr = 2>3>4>5>null

        //forward = 3>4>5>null
        //curr = 2>4>5>null (prev = 1>2>4>5>null)
        //forward = 3>2>4>5>null
        //prev = 1>3>2>4>5>null

        //forward = 4>5>null
        //curr = 2>5>null (prev = 1>3>2>5>null)
        //forward = 4>3>2>5>null
        //prev = 1>4>3>2>5>null
    }
}
