package datastructures.arrays;

//https://leetcode.com/problems/find-pivot-index/description/

public class _724 {

    public static int attemp(int[] nums) {
        int sumL = 0;
        int sum = 0;
        int pivot = -1;

        for (int num : nums) {
            sum += num;
        }

        for(int i = nums.length - 1; i >= 0; i--) {
            if((sum - sumL - nums[i]) == sumL) {
                pivot = i;
            }
            sumL += nums[i];
        }
        return pivot;
    }

    public static void main(String[] args) {
//        int[] nums = {1,7,3,6,5,6}; //3
//        int[] nums = {1,2,3}; //-1
//        int[] nums = {2,1,-1}; //0
//        int[] nums = {-1,-1,-1,-1,-1,0}; //2
        int[] nums = {-1,-1,0,0,-1,-1}; //2
        System.out.println(attemp(nums));
    }
}
