package Algorithm.BackTracking;

//https://leetcode.com/problems/generate-parentheses/description/

import java.util.ArrayList;
import java.util.List;

public class _22 {

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(res, "", n, 0);
        return res;
    }

    private static void generate(List<String> res, String s, int n, int l) {
        if(s.length() == n * 2) {
            res.add(s);
            return;
        }

        if(l < n)
            generate(res, s + "(", n, l+1);
        if(l > (s.length() / 2))
            generate(res, s + ")", n, l);

    }

    public static void main(String[] args) {
        int n = 3;
//        int n = 2;
//        int n = 1;
        generateParenthesis(n).forEach(System.out::println);
    }
}
