package Practice.Easy;

//https://leetcode.com/problems/valid-palindrome/description

public class _125 {
    public static boolean isPalindrome(String s) {
        String processed = "";

        for(int i = 0; i < s.length(); i++) {
            if(Character.isLetterOrDigit(s.charAt(i))) {
                processed += Character.toLowerCase(s.charAt(i));
            }
        }

        if(processed.length() == 0 || processed.length() == 1) return true;

        int i = 0, j = processed.length() - 1;
        while(i <= j) {
            if(processed.charAt(i) != processed.charAt(j)) return false;
            i++;
            j--;
        }


        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama")); //true
        System.out.println(isPalindrome("race a car")); //false
        System.out.println(isPalindrome("aa")); //true
        System.out.println(isPalindrome("0P")); //false
        System.out.println(isPalindrome(" ")); //true
    }
}
