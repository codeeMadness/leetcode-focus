package datastructures.linkedlist;

public class ListNode {
     public int val;
     public ListNode next;
     ListNode(int x, ListNode next) {
         this.val = x;
         this.next = next;
     }

     public static String toString(ListNode head) {
         ListNode current = head;

         if(current == null) return "No Node";

         String result = "";
         while(current != null) {
             result += current.val + " ";
             current = current.next;
         }

         return result;
     }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp;

        while(head != null) {
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }
}
