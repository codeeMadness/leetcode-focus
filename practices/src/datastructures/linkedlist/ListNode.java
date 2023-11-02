package datastructures.linkedlist;

public class ListNode {
     public int val;
     public ListNode next;
     ListNode(int x, ListNode next) {
         this.val = x;
         this.next = next;
     }

     public static void print(ListNode head) {
         ListNode current = head;

         if(current == null)
             System.out.println("No Node");

         while(current != null) {
             System.out.println(current.val);
             current = current.next;
         }
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
