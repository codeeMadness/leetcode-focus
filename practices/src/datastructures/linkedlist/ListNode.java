package datastructures.linkedlist;

public class ListNode {
     public int val;
     public ListNode next;
     ListNode(int x, ListNode next) {
         this.val = x;
         this.next = next;
     }

     public String toString() {
         ListNode current = this;

         if(current == null) return "No Node";

         String result = "";
         while(current != null) {
             result += current.val + " ";
             current = current.next;
         }

         return result;
     }
}
