package DataStructures.Arrays;

//https://leetcode.com/problems/contains-duplicate/description/

import java.util.HashMap;
import java.util.Map;

public class _217 {

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            if(map.containsKey(num)) return true;
            map.put(num, 0);
        }

        return false;
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,3,1}; //true
//        int[] nums = {1,2,3,4}; //false
        int[] nums = {1,1,1,3,3,4,3,2,4,2}; //true
        System.out.println(containsDuplicate(nums));
    }

}
