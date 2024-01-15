package Algorithm.BackTracking;

//https://leetcode.com/problems/combination-sum/description/

import java.util.*;

public class _39 {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int remain, int start){
        if(remain < 0) return;

        if(remain == 0)
            list.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i < nums.length; i++){
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, remain - nums[i], i); // not i + 1 because we can reuse same elements
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
//        int candidates[] = {2,3,6,7}, target = 7; //[[2,2,3],[7]]
//        int candidates[] = {2,3,5}, target = 8; //[[2,2,2,2],[2,3,3],[3,5]]
//        int candidates[] = {2}, target = 1; //[]
//        int candidates[] = {8,7,4,3}, target = 11; //[[8,3],[7,4],[4,4,3]]
        int candidates[] = {7,3,2}, target = 18; //[[7,7,2,2],[7,3,3,3,2],[7,3,2,2,2,2],     [3,3,3,3,3,3],[3,3,3,3,2,2,2],[3,3,2,2,2,2,2,2],[2,2,2,2,2,2,2,2,2]]
        combinationSum(candidates, target).forEach(System.out::println);
    }
}
