package DataStructures.Stack;

//https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/

import java.util.Stack;

public class _1249 {
    public static String minRemoveToMakeValid(String s) {
        String[] arr = s.split("");
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i <arr.length; i++) {
            if(arr[i].equals(")")) {
                if(!stack.isEmpty()) stack.pop();
                else arr[i] = "";
            }
            if(arr[i].equals("("))
                stack.push(i);
        }

        while(!stack.isEmpty()) {
            arr[stack.pop()] = "";
        }

        return String.join("",arr);
    }

    public static void main(String[] args) {
//        String s = "lee(t(c)o)de)"; //"lee(t(c)o)de"
//        String s = "a)b(c)d"; //"ab(c)d"
        String s = "))(("; //""
        System.out.println(minRemoveToMakeValid(s));
    }
}
