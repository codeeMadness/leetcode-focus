package DataStructures.Arrays;

//https://leetcode.com/problems/two-sum/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _1 {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];

        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                ans[0] = map.get(target - nums[i]);
                ans[1] = i;
                return ans;
            }
            map.put(nums[i], i);
        }

        return ans;

    }

    public static void main(String[] args) {
//        int nums[] =  {2,7,11,15}, target = 9; //[0,1]
//        int nums[] =  {3,2,4}, target = 6; //[1,2]
        int nums[] =  {3,3}, target = 6; //[0,1]
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
