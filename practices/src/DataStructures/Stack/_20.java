package DataStructures.Stack;

//https://leetcode.com/problems/valid-parentheses/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _20 {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> map = new HashMap<>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');

        // Traverse the string
        for (int i = 0; i < s.length(); i++) {
            Character current = s.charAt(i);
            if(Arrays.asList('[','{','(').contains(current)) {
                stack.push(current);
            }else {
                if(stack.isEmpty()) return false;
                Character last = stack.pop();
                if(last != map.get(current))
                    return false;
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()"; //true
//        s = "()[]{}"; //true
        s = "(]"; //false
        System.out.println(isValid(s));
    }
}
