package Practice.Easy;

import DataStructures.LinkedList.ListNode;

//https://leetcode.com/problems/merge-two-sorted-lists/description/
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
        ListNode<Integer> l1 = new ListNode<>(1, new ListNode(2, new ListNode(4)));
        ListNode<Integer> l2 = new ListNode<>(1, new ListNode(3, new ListNode(4)));
        ListNode.print(mergeTwoLists(l1, l2));

        ListNode<Integer> l3 = new ListNode<>(1, new ListNode(2));
        ListNode<Integer> l4 = new ListNode<>(1, new ListNode(3, new ListNode(4)));
        ListNode.print(mergeTwoLists(l3, l4));

        ListNode<Integer> l5 = new ListNode<>(1);
        ListNode<Integer> l6 = new ListNode<>(1, new ListNode(3, new ListNode(4)));
        ListNode.print(mergeTwoLists(l5, l6));

        ListNode<Integer> l7 = new ListNode<>(1, new ListNode(3, new ListNode(4)));
        ListNode<Integer> l8 = null;
        ListNode.print(mergeTwoLists(l7, l8));

        ListNode<Integer> l9 = null;
        ListNode<Integer> l10 = new ListNode<>();
        ListNode.print(mergeTwoLists(l9, l10));
    }
}
