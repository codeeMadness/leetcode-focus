package DataStructures.Stack;

//https://leetcode.com/problems/next-greater-node-in-linked-list/description/

import DataStructures.LinkedList.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class _1019 {
    public static int[] nextLargerNodes(ListNode<Integer> head) {
        List<Integer> list = new ArrayList<>();
        while(null != head) {
            list.add(head.val);
            head = head.next;
        }

        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[list.size()];
        Arrays.fill(arr, 0);

        for(int i = 0; i < list.size(); i++) {
            while(!stack.isEmpty() && list.get(stack.peek()) < list.get(i)) {
                arr[stack.pop()] = list.get(i);
            }
            stack.push(i);
        }

        return arr;
    }

    public static void main(String[] args) {
//        ListNode<Integer> head = ListNode.convert(2,1,5); //5,5,0
        ListNode<Integer> head = ListNode.convert(2,7,4,3,5); //7,0,5,5,0
        System.out.println(Arrays.toString(nextLargerNodes(head)));
    }
}
