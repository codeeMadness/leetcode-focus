package DataStructures.Stack;

//https://leetcode.com/problems/next-greater-element-i/description/

import java.util.Arrays;
import java.util.Stack;

public class _496 {
    public static int[] findGreaterElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[arr.length];
        Arrays.fill(ans, -1);

        for(int i = 0; i < arr.length; ++i) {
            int num = arr[i];
            while(!stack.isEmpty() && arr[stack.peek()] < num) {
                ans[stack.pop()] = num;
            }
            stack.add(i);
        }

        return ans;
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        return null;
    }

    public static void main(String[] args) {
//        int[] arr = {6,5,4,3,2,1,7}; //[7,7,7,7,7,7,-1]
//        int[] arr = {1,3,4,2}; //[3,4,-1,-1]
//        int[] arr = {3,3,3,3}; //[-1,-1,-1,-1]
        int[] arr = {1,2,3,4}; //[2,3,4,-1]
        System.out.println(Arrays.toString(findGreaterElement(arr)));
    }
}
