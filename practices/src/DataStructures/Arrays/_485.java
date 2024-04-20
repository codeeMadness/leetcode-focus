package DataStructures.Arrays;

//https://leetcode.com/problems/max-consecutive-ones/description/
public class _485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int step = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                step++;
                result = Math.max(result, step);
            } else {
                step = 0;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1}; //3
//        int[] nums = {1,0,1,1,0,1}; //2
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
