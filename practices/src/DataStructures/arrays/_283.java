package DataStructures.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/move-zeroes/
public class _283 {

    public static void attempt() {
        int[] nums = {0,1,0,3,12};
        //output: [1,3,12,0,0]

//        int[] nums = {0,0,0,1,3,12};
//        int[] nums = {1,3,12,0,0,0};
//        int[] nums = {1};

        int i = 0;
        int zeroIndex = 0;
        while(i < nums.length && zeroIndex < nums.length) {

            if(nums[zeroIndex] != 0)
                zeroIndex++;

            if(nums[i] != 0 && i > zeroIndex) {
                nums[zeroIndex] = nums[i];
                nums[i] = 0;
            }
            i++;
        }

        System.out.println(Arrays.toString(nums));

    }
    public static void main(String[] args) {
        attempt();
    }
}
