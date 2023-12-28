package DataStructures.Stack;

//https://leetcode.com/problems/remove-nodes-from-linked-list/

import DataStructures.LinkedList.ListNode;

import java.util.Stack;

public class _2487 {
    public static ListNode<Integer> removeNodes(ListNode<Integer> head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode<Integer> currentNode = head;

        while(null != currentNode) {

            while(!stack.isEmpty()) {
                ListNode<Integer> lastElement = stack.peek();
                if(lastElement.val < currentNode.val)
                    stack.pop();
                else
                    break;
            }

            if(!stack.isEmpty()) {
                stack.peek().next = currentNode;
            } else {
                head = currentNode;
            }

            stack.push(currentNode);
            currentNode = currentNode.next;

        }

        return head;
    }

    public static void main(String[] args) {
//        ListNode<Integer> head = ListNode.convert(5,2,13,3,8); //[13,8]
        ListNode<Integer> head = ListNode.convert(1,1,1,1); //[1,1,1,1]
        ListNode.print(removeNodes(head));

    }
}
