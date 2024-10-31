package Practice.Easy;

//https://leetcode.com/problems/palindrome-number/description/
public class _9 {

    public static boolean isPalindrome(int x) {
        String strValue = "" + x;
        boolean result = true;
        for (int i = 0, j = strValue.length() - 1; i < strValue.length() && j > - 1 && j >= i; i++, j--) {
            result = result && strValue.charAt(i) == strValue.charAt(j);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121)); //true
        System.out.println(isPalindrome(-121)); //false
        System.out.println(isPalindrome(10)); //false

    }

}
