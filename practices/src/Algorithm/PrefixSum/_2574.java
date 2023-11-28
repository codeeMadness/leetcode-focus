package Algorithm.PrefixSum;

//https://leetcode.com/problems/left-and-right-sum-differences/

import java.util.Arrays;

public class _2574 {
    public static int[] leftRightDifference(int[] nums) {
        int[] ps = new int[nums.length + 1];
        Arrays.fill(ps, 0 , ps.length, 0);
        int sum = 0;
        for(int i = 1; i < ps.length; i++) {
            sum += nums[i-1];
            ps[i] = sum;
        }

        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++) {
            ans[i] = Math.abs(ps[i] - ps[ps.length-1] + ps[i+1]);
        }
        return ans;
    }
    public static void main(String[] args) {
//        int[] nums = {10,4,8,3}; //[15, 1, 11, 22]
        int[] nums = {0}; //[15, 1, 11, 22]
        System.out.println(Arrays.toString(leftRightDifference(nums)));
    }
}
