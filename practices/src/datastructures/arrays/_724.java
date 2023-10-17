package datastructures.arrays;

//https://leetcode.com/problems/find-pivot-index/description/

public class _724 {
    public static void main(String[] args) {
//        int[] nums = {1,7,3,6,5,6}; //3
//        int[] nums = {1,2,3}; //-1
//        int[] nums = {2,1,-1}; //0
        int[] nums = {-1,-1,-1,-1,-1,0}; //2

        int start = 0, end = nums.length-1;
        int sumL = 0, sumR= 0;

        while (start < end) {

            if(sumL == sumR) {
                sumR += nums[end];
                end--;
            } else if(sumL < sumR) {
                sumL += nums[start];
                start++;
            } else {
                sumR += nums[end];
                end--;
            }

        }

        if(start == end && sumL == sumR)  {
            System.out.println(start);
            return;
        }


        System.out.println(-1);
    }
}
