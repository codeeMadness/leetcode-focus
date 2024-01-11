package Algorithm.BackTracking;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/subsets/description/
public class _78 {

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> result , List<Integer> path, int [] nums, int start){
        result.add(new ArrayList<>(path));
        for(int i = start; i < nums.length; i++){
            path.add(nums[i]);
            backtrack(result, path, nums, i + 1);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        subsets(nums).forEach(System.out::println);
    }
}
