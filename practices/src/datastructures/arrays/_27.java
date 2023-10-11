package datastructures.arrays;

//https://leetcode.com/problems/remove-element/

import java.util.Arrays;

public class _27 {

    public static int removeElement(int[] nums, int val) {
        int k = 0;

        for(int num : nums) {
            if(num != val) k++;
        }

        int indexVal = 0;
        int i = 0;

        while(i < nums.length && indexVal < nums.length) {
            if(nums[indexVal] != val)
                indexVal++;

            if(nums[i] != val && i > indexVal) {
                nums[indexVal] = nums[i];
                nums[i] = val;
            }
            i++;
        }

        return k;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val =  3;

        int k = removeElement(nums, val);

        nums = Arrays.copyOfRange(nums, 0, k);
        System.out.println(Arrays.toString(nums));
    }
}
