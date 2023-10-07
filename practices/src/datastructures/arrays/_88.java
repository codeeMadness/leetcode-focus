package datastructures.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/

public class _88 {

    public static void shiftRight(int[] arr, int index) {
        for(int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i-1];
        }
    }

    public static void attempt() {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[]  nums2 = {2,5,6};
        int n = 3;
        //output: {1,2,2,3,5,6}

        if(n == 0) return;
        int i = 0, j= 0;
        while(i < nums1.length) {
            if(nums1[i] >= nums2[j]) {
                shiftRight(nums1, i);
                nums1[i+1] = nums2[j];
                i++;
                j++;
            }
            else if(nums1[i] == 0) {
                nums1[i] = nums2[j];
                j++;
            }
            i++;
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static void attempt2() {
        int[] nums1 = {1,3,3,0,0,0};
        int m = 3;
        int[]  nums2 = {2,5,6};
        int n = 3;

        //variables to work as pointers
        int i=m-1; // will point at m-1 index of nums1 array
        int j=n-1; // will point at n-1 index of nums2 array
        int k=nums1.length-1; //will point at the last position of the nums1 array

        // Now traversing the nums2 array
        while(j>=0){

            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }else{

                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
//        attempt();
        attempt2();

    }
}
