package DataStructures.Arrays;

import java.util.Arrays;

//https://leetcode.com/problems/merge-sorted-array/

public class _88 {

    public static void shiftRight(int[] arr, int index) {
        for(int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i-1];
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int midx = m - 1;
        int nidx = n - 1;
        int right = m + n - 1; //Points to the last index in nums1

        while (nidx >= 0) {
            if (midx >= 0 && nums1[midx] > nums2[nidx]) {
                nums1[right] = nums1[midx];
                midx--;
            } else {
                nums1[right] = nums2[nidx];
                nidx--;
            }
            right--;
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {-1,0,0,3,3,0,0,0}; int m = 5;  int[] nums2 = {1,2,2}; int n = 3;
        merge(nums1, m, nums2, n);
//        attempt2();

    }
}
