package Algorithm.TwoPointers;

//https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/

import java.util.Arrays;

public class _1984 {
    public static int minimumDifference(int[] nums, int k) {
        if(k == 1) return 0;

        Arrays.sort(nums); //asc

        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-k+1; i++) {
            int diff = Math.abs(nums[i] - nums[i+k-1]);
            min = Math.min(diff, min);
        }

        return min;
    }

    public static void main(String[] args) {
        int nums[] = {9,4,1,7}, k = 2;
        System.out.println(minimumDifference(nums, k));
    }
}
