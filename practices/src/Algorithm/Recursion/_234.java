package Algorithm.Recursion;

//https://leetcode.com/problems/palindrome-linked-list/

import DataStructures.LinkedList.ListNode;

public class _234 {

    ListNode ref;
    public boolean isPalindrome(ListNode<Integer> head) {
        ref = head;
        return check(head);
    }

    public boolean check(ListNode node){
        if(node == null) return true;
        boolean ans = check(node.next);
        boolean isEqual = (ref.val == node.val)? true : false;
        ref = ref.next;
        return ans && isEqual;
    }
    public static void main(String[] args) {
        _234 solution = new _234();
        ListNode<Integer> head = ListNode.convert(1,2,2,1); //true
//        ListNode<Integer> head = ListNode.convert(1,2); //false
        System.out.println(solution.isPalindrome(head));
    }
}
