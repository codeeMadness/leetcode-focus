package Algorithm.Recursion;

//https://leetcode.com/problems/power-of-four/
public class _342 {
    public static boolean isPowerOfFour(int n) {
        if(n == 1) return true;
        if(n == 0) return false;
        if(n % 4 == 0)
            return isPowerOfFour(n/4);
        return false;
    }
    public static void main(String[] args) {
//        int n = 16; //true
//        int n = 5; //false
        int n = 1; //true
        System.out.println(isPowerOfFour(n));
    }
}
