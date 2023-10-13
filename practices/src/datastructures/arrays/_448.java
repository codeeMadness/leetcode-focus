package datastructures.arrays;

//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.*;

public class _448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();

        Map items = new HashMap();
        for(int num : nums) {
            items.put(num, true);
        }

        for(int i = 1; i <= nums.length; i++) {
            if(!items.containsKey(i)) {
                result.add(i);
            }
        }

        return result;
    }

    public static List<Integer> findDisappearedNumbers1(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] arr = new int[nums.length];
        arr = Arrays.stream(arr).map(x -> 0).toArray();

        for(int num : nums) {
            int index = num % nums.length;
            arr[index] = 1;
        }

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == 0 && i == 0) result.add(arr.length);
            if(arr[i] == 0 && i != 0) result.add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
//        int[] nums = {1,1};
//        List<Integer> result = findDisappearedNumbers(nums);
        List<Integer> result = findDisappearedNumbers1(nums);
        result.forEach(System.out::println);
    }
}
