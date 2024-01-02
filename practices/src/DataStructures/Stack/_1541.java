package DataStructures.Stack;

//https://leetcode.com/problems/minimum-insertions-to-balance-a-parentheses-string/

import java.util.Stack;

public class _1541 {
    public static int minInsertions(String s) {
        int open = 0, close = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(')
                open++;  // found a '(', push

            if (s.charAt(i) == ')') {
                if (open == 0) {
                    close++;  // need insert a '(';
                    open++;
                }

                if (i + 1 < s.length() && s.charAt(i + 1) == ')') {
                    i++; //next loop start from i + 2;
                } else
                    close++;

                open--;  // found a match, pop;
            }
        }

        return close + open*2;   // every unmatched '(', need two ')';
    }
    public static void main(String[] args) {
//        String s = "(()))"; //1
//        String s = "())"; //0
//        String s = "))())("; //3
        String s = "))()("; //4
//        String s = "(())"; //2
        System.out.println(minInsertions(s));
    }
}
