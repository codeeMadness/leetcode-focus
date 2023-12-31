package DataStructures.Stack;
//https://leetcode.com/problems/next-greater-element-ii/description/

import java.util.Arrays;
import java.util.Stack;

public class _503 {

    public static  int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int res[] = new int[n];

        Arrays.fill(res, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n * 2; i++) {

            while (!stack.isEmpty() && nums[stack.peek()] < nums[i % n])
                res[stack.pop()] = nums[i % n];

            stack.push(i % n);

        }

        return res;
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,1}; //[2,-1,2]
        int[] nums = {1,2,3,4,3}; //[2,3,4,-1,4]
        System.out.println(Arrays.toString(nextGreaterElements(nums)));
    }
}
