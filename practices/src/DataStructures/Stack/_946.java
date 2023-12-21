package DataStructures.Stack;

//https://leetcode.com/problems/validate-stack-sequences/

import java.util.Stack;

public class _946 {

    public static boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        int i = 0;

        while(i < pushed.length) {
            if(pushed[i] == popped[j]) {
                j++; i++;
            } else {
                if(!stack.isEmpty() && stack.peek() == popped[j]) {
                    stack.pop();
                    j++;
                }
                else {
                    stack.push(pushed[i]);
                    i++;
                }
            }
        }

        while(j < popped.length) {
            if(stack.peek() == popped[j]) {
                stack.pop();
                j++;
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
//        int[] pushed = {1,2,3,4,5}, popped = {4,5,3,2,1}; //true
//        int[] pushed = {1,2,3,4,5}, popped = {4,3,5,1,2}; //false
        int[] pushed = {2,1,0}, popped = {1,2,0}; //true
        System.out.println(validateStackSequences(pushed, popped));

    }
}
