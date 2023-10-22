package datastructures.arrays;

//https://leetcode.com/problems/valid-palindrome-ii/

public class _680 {
    public static boolean isPalindrome(String s, int i, int j){
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }

    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }
            else return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);
        }
        return true;
    }

    public static void main(String[] args) {
//        String s = "aba"; //true
//        String s = "abca"; //true
        String s = "abc"; //false
//        String s = "cbbcc"; //true
        System.out.println(validPalindrome(s));
    }
}
