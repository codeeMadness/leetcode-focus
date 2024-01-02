package DataStructures.Stack;

//https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/

public class _921 {
    public static int minAddToMakeValid(String s) {
        int open = 0, close = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(')
                close++;
            if(s.charAt(i) == ')')
                if(close > 0) close--;
                else open++;
        }

        return open + close;
    }

    public static void main(String[] args) {
//        String s = "())"; //1
        String s = "((("; //3

        System.out.println(minAddToMakeValid(s));
    }
}
