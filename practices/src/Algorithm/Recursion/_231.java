package Algorithm.Recursion;

//https://leetcode.com/problems/power-of-two/
public class _231 {

    public static boolean isPowerOfTwo(int n) {
        if(n == 1) return true;
        if(n == 0) return false;
        if(n % 2 == 0)
            return isPowerOfTwo(n/2);
        return false;
    }
    public static void main(String[] args) {
//        int n = 1;
//        int n = 16;
        int n = 3;
        System.out.println(isPowerOfTwo(n));
    }
}
