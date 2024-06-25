package Algorithm.TwoPointers;

//https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class _26 {
    public static int removeDuplicates(int[] nums) {
        int swap = 1;

        for(int i=1; i<nums.length; i++) {
            if(nums[i] != nums[i-1]) {
                nums[swap] = nums[i];
                swap++;
            }
        }

        return swap;
    }

    public static void main(String[] args) {
//        int[] nums = {1,1,2}; //2, nums = [1,2,_]
        int[] nums = {0,0,1,1,1,2,2,2,3,3,4}; //5, nums = [0,1,2,3,4,_,_,_,_,_]
        System.out.println(removeDuplicates(nums));
    }
}
