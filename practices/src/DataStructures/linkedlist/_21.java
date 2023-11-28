package DataStructures.linkedlist;

//https://leetcode.com/problems/merge-two-sorted-lists/

public class _21 {
    public static ListNode<Integer> mergeTwoLists(ListNode<Integer> l1, ListNode<Integer> l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));

        ListNode head = mergeTwoLists(list1, list2);
        if(null != head)
            System.out.println(head.val);
        else
            System.out.println("No result");
    }
}
