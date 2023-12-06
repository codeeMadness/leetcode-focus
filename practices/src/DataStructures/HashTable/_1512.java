package DataStructures.HashTable;

import java.util.HashMap;
import java.util.Map;

public class _1512 {

    public static int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i = 0; i < nums.length; i++) {
           Integer val =  map.getOrDefault(nums[i],0);
           map.put(nums[i], ++val);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer occurrences = entry.getValue();
            if(occurrences > 1) {
                count += occurrences*(occurrences - 1)/2;
            }
        }

        return count;
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,3,1,1,3}; //4
//        int[] nums = {1,1,1,1}; //6
        int[] nums = {1,2,3}; //0
        System.out.println(numIdenticalPairs(nums));
    }
}
