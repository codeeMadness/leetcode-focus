package datastructures.arrays;

//Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
//Input: nums = [-4,-1,0,3,10]
//Output: [0,1,9,16,100]

import java.util.Arrays;

public class _977 {

    public static void draft() {
        //O(1)
        int[] nums = {-4,-1,0,3,10};
        int sqrtNums[] = new int[nums.length];
        Arrays.fill(sqrtNums, 0);

        int l = 0;
        int r = nums.length - 1;
        int index = r;


        while(l <= r) {//O(n)
            int start = nums[l] * nums[l];//O(1)
            int end = nums[r] * nums[r];//O(1)
            if(start < end) {
                sqrtNums[index] = end;
                r--;
            }
            else {
                sqrtNums[index] = start;
                l++;
            }
            index--;

        }

        System.out.println(Arrays.toString(sqrtNums));

    }

    public static void main(String[] args) {
//        int[] nums = {-4,-1,0,3,10};//O(1)
//
//        for(int i = 0; i < nums.length; i++) {//O(n)
//            nums[i] = nums[i] * nums[i];//O(1)
//        }
//
//        Arrays.sort(nums);//O(nlogn)
//        System.out.println(nums);
        //O(nlogn)
        draft();

    }
}
