package DataStructures.Arrays;

//https://leetcode.com/problems/concatenation-of-array/

import java.util.Arrays;

public class _1929 {

    public static int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length * 2];
        Arrays.fill(ans, 0);

        for(int i = 0; i < nums.length; i++) {
            int j = i + nums.length;
            ans[i] = nums[i];
            ans[j] = nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,1};
        int[] nums = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
}
