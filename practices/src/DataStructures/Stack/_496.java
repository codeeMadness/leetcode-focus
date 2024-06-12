package DataStructures.Stack;

//https://leetcode.com/problems/next-greater-element-i/description/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _496 {
    public static int[] findGreaterElement(int[] arr) {
        Stack<Integer> indexes = new Stack<>();
        int[] ans = new int[arr.length];
        Arrays.fill(ans, -1);

        for(int i = 0; i < arr.length; ++i) {
            int num = arr[i];
            while(!indexes.isEmpty() && arr[indexes.peek()] < num) {
                ans[indexes.pop()] = num;
            }
            indexes.push(i);
        }

        return ans;
    }

    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // map from x to next greater element of x
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                map.put(stack.pop(), num);
            stack.push(num);
        }
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = map.getOrDefault(findNums[i], -1);
        return findNums;
    }

    public static void main(String[] args) {
//        int[] arr = {6,5,4,3,2,1,7}; //[7,7,7,7,7,7,-1]
//        int[] arr = {1,3,4,2}; //[3,4,-1,-1]
//        int[] arr = {3,3,3,3}; //[-1,-1,-1,-1]
        int[] arr = {1,2,3,4}; //[2,3,4,-1]
        System.out.println(Arrays.toString(findGreaterElement(arr)));
    }
}
