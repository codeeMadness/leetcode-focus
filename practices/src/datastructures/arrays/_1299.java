package datastructures.arrays;

//https://leetcode.com/explore/learn/card/fun-with-arrays/523/conclusion/3228/

//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/

import java.util.Arrays;

public class _1299 {

    public static int[] replaceElements(int[] arr) {

        int max = -1;
        int i = arr.length - 1;

        int[] result = new int[arr.length];
        result[i] = -1;

        while(i-1 >= 0) {
            if(arr[i] > max) {
                max = arr[i];
            }
            result[i-1] = max;
            i--;
        }


        return result;
    }

    public static void main(String[] args) {
//        int[] arr = {17,18,5,4,6,1};
        int[] arr = {400};
        System.out.println(Arrays.toString(replaceElements(arr)));

    }
}
