package datastructures.arrays;

//https://leetcode.com/problems/is-subsequence/

public class _392 {

    public static boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (j < t.length()) {
            if(i < s.length() && s.charAt(i) == t.charAt(j))
                i++;
            j++;

        }

        return i == s.length();
    }

    public static void main(String[] args) {
//        String s = "abc", t = "ahbgdc";//true
        String s = "axc", t = "ahbgdc";//false
        System.out.println(isSubsequence(s,t));
    }
}
