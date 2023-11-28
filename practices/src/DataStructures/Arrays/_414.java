package DataStructures.Arrays;

//https://leetcode.com/problems/third-maximum-number/

import java.util.Arrays;

public class _414 {

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int result = nums[n-1];

        int k = 2;
        for(int i = n-2 ; i >= 0; i--) {
            if(k > 0 && nums[i] < result) {
                result = nums[i];
                k--;
            }
        }
        return k > 0 ? nums[n-1] : result;
    }

    public static void main(String[] args) {
//        int[] nums = {2,2,3,1};
//        int[] nums = {1,2};
//        int[] nums = {3,2,1};
        int[] nums = {1,1,2};
        System.out.println(thirdMax(nums));
    }
}
