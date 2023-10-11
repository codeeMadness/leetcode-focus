package datastructures.arrays;

//https://leetcode.com/problems/valid-mountain-array/description/

public class _941 {

    public static boolean validMountainArray(int[] arr) {
        int peak = 0;
        for(int i = 0; i < arr.length; i++) {
            if( (i+1) < arr.length
                    && arr[i] == arr[i+1] )
                return false;

            if( (i+1) < arr.length
                    && arr[i] > arr[i+1] ) {
                peak = i;
                break;
            }
        }

        if(peak == 0) return false;

        for(int j = peak; j < arr.length; j++) {

            if( (j+1) < arr.length
                    && arr[j] == arr[j+1] )
                return false;

            if((j+1) < arr.length
                    && arr[j] < arr[j+1])
                return false;
        }

        return peak != 0;
    }

    public static void main(String[] args) {
//        int[] arr = {2,1};
//        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int[] arr = {0,1,2,1,2};
//        int[] arr = {3,5,5};
//        int[] arr = {0,3,2,1};
        System.out.println(validMountainArray(arr));
    }
}
