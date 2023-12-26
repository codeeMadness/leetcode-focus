package DataStructures.Stack;
//https://leetcode.com/problems/add-two-numbers-ii/description/

import DataStructures.LinkedList.ListNode;

import java.util.Stack;

public class _445 {

    public static ListNode<Integer> addTwoNumbers(ListNode<Integer> l1, ListNode<Integer> l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while(l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        };
        while(l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        int sum = 0;
        ListNode<Integer> list = new ListNode<>(0);
        while (!s1.empty() || !s2.empty()) {
            if (!s1.empty()) sum += s1.pop();
            if (!s2.empty()) sum += s2.pop();
            list.val = sum % 10;
            ListNode<Integer> head = new ListNode<>(sum / 10);
            head.next = list;
            list = head;
            sum /= 10;
        }

        return list.val == 0 ? list.next : list;
    }

    public static void main(String[] args) {
        ListNode<Integer> l1 = ListNode.convert(7,2,4,3), l2 = ListNode.convert(5,6,4); //7807
//        ListNode<Integer> l1 = ListNode.convert(2,4,3), l2 = ListNode.convert(5,6,4); //807
//        ListNode<Integer> l1 = ListNode.convert(0), l2 = ListNode.convert(0); //0
        ListNode.print(addTwoNumbers(l1, l2));
    }
}
