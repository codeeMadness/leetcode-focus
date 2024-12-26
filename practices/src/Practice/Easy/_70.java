package Practice.Easy;

//https://leetcode.com/problems/climbing-stairs/

import java.util.HashMap;
import java.util.Map;

public class _70 {

    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return climbStairs(n, memo);
    }

    private int climbStairs(int n, Map<Integer, Integer> memo) {
        if (n == 0 || n == 1) {
            return 1;
        }
        if (!memo.containsKey(n)) {
            memo.put(n, climbStairs(n-1, memo) + climbStairs(n-2, memo));
        }
        return memo.get(n);
    }


    public static void main(String[] args) {
        _70 solution = new _70();
        System.out.println(solution.climbStairs(2)); //2
//        System.out.println(solution.climbStairs(3)); //3
    }
}
