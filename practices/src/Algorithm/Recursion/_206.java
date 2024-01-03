package Algorithm.Recursion;

//https://leetcode.com/problems/reverse-linked-list/

import DataStructures.LinkedList.ListNode;

public class _206 {
    public static ListNode<Integer> reverseList(ListNode<Integer> head) {
        return null;
    }

    public static void main(String[] args) {
        ListNode<Integer> head = ListNode.convert(1,2,3,4,5); //5,4,3,2,1
//        head = ListNode.convert(1,2); //2,1
//        head = ListNode.convert(); //
        ListNode.print(reverseList(head));

    }



}
