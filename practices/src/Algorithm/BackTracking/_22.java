package Algorithm.BackTracking;

//https://leetcode.com/problems/generate-parentheses/description/

import java.util.ArrayList;
import java.util.List;

public class _22 {

    public static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        backtrack(list, "", 0, 0, n);
        return list;
    }

    public static void backtrack(List<String> list, String str, int open, int close, int n){

        if(str.length() == n*2){
            list.add(str);
            return;
        }

        if(open < n)
            backtrack(list, str+"(", open+1, close, n);

        if(close < open)
            backtrack(list, str+")", open, close+1, n);
    }

    public static void main(String[] args) {
//        int n = 3;
        int n = 2;
//        int n = 1;
        generateParenthesis(n).forEach(System.out::println);
    }
}
