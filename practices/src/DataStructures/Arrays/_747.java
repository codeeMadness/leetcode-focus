package DataStructures.Arrays;

//https://leetcode.com/problems/largest-number-at-least-twice-of-others/description/

public class _747 {
    public static int dominantIndex(int[] nums) {
        int max = -1;
        int maxIndex = 0;

        for(int i = 0; i < nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }

        for(int i = 0; i < nums.length; i++) {
            if(maxIndex != i && nums[i] * 2 > max) {
                return -1;
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {
//        int[] nums = {3,6,1,0};//1
        int[] nums = {1,2,3,4};//-1
        System.out.println(dominantIndex(nums));
    }
}
