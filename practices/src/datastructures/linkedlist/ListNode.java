package datastructures.linkedlist;

public class ListNode {
     public Integer val;
     public ListNode next;
     ListNode(Integer x, ListNode next) {
         this.val = x;
         this.next = next;
     }

     ListNode(Integer x) {
         this.val = x;
     }

     ListNode() {
         this.val = null;
     }

     public static void print(ListNode head) {
         ListNode current = head;

         if(current == null)
             System.out.print("No Node");

         while(current != null) {
             System.out.print(current.val);
             System.out.print("\t");
             current = current.next;
         }
         System.out.println();
     }

    public static ListNode reverse(ListNode head) {
        ListNode prev = new ListNode();
        ListNode temp;

        while(head != null) {
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }

        return prev;
    }

    public static ListNode convert(int... values) {
         if(values.length == 0) return null;

         ListNode head = new ListNode(values[0]);
         ListNode current = head;
         for(int i = 1; i < values.length; i++) {
             current.next = new ListNode(values[i]);
             current = current.next;
         }

         return head;
    }
}
