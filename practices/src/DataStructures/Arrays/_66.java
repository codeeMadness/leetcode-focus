package DataStructures.Arrays;

//https://leetcode.com/problems/plus-one/description/

import java.util.Arrays;

public class _66 {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
//        int[] digits = {1,2,3}; //[1,2,4]
        int[] digits = {1,0,9,9}; //[1,1,0,0]
//        int[] digits = {1,8,9}; //[1,9,0]
//        int[] digits = {4,3,2,1}; //[4,3,2,2]
//        int[] digits = {9}; //[1,0]
//        int[] digits = {9,9,9}; //[1,0,0,0]
//        int[] digits = {9,8,7,6,5,4,3,2,1,0}; //[9,8,7,6,5,4,3,2,1,1]
//        int[] digits = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        //[7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,7]
        System.out.println(Arrays.toString(plusOne(digits)));

    }
}
