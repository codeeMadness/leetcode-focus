package Algorithm.PrefixSum;

//https://leetcode.com/problems/range-sum-query-immutable/

import java.util.Arrays;

public class _303 {
    static class NumArray {
        private int[] ps;

        public NumArray(int[] nums) {
            this.ps = new int[nums.length + 1];
            Arrays.fill(ps, 0, ps.length, 0);

            int sum = 0;
            for(int i = 1; i < ps.length; i++) {
                sum += nums[i-1];
                ps[i] = sum;
            }
            System.out.println(Arrays.toString(ps));
        }

        public int sumRange(int left, int right) {
            return ps[right + 1] - ps[left];
        }
    }


    public static void main(String[] args) {
        int[] nums = {-2, 0, 3, -5, 2, -1}; //0, -2, -2, 1, -4, -2, -3
        NumArray numArray = new NumArray(nums);
        System.out.println(numArray.sumRange(0, 2)); // return (-2) + 0 + 3 = 1
        System.out.println(numArray.sumRange(2, 5)); // return 3 + (-5) + 2 + (-1) = -1
        System.out.println(numArray.sumRange(0, 5)); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
    }
}
