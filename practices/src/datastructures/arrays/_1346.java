package datastructures.arrays;

//https://leetcode.com/problems/check-if-n-and-its-double-exist/

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class _1346 {
    public static boolean checkIfExist(int[] arr) {
        Map map = new HashMap();

        int zeroes = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) zeroes++;
            if(zeroes >= 2) return true;
            map.put(arr[i], i);
        }

        for(int num : arr) {
            if(map.containsKey(num*2)) {
                int i = (int) map.get(num);
                int j = (int) map.get(num*2);
                if(i != j) return true;
            }

        }
        return false;
    }
    public static void main(String[] args) {
//        int[] arr = {10,2,5,3};
//        int[] arr = {3,1,7,11};
//        int[] arr = {7,1,14,11};
        int[] arr = {0,0};
//        int[] arr = {-2,0,10,-19,4,6,-8};

        System.out.println(checkIfExist(arr));
    }
}
