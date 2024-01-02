package Algorithm.Recursion;

//https://leetcode.com/problems/fibonacci-number/

public class _509 {
    public static int fib(int n) {
        if(n == 0 || n == 1) return n;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
//        int n = 2; //1
//        int n = 3; //2
        int n = 4; //3
        System.out.println(fib(n));
    }
}
