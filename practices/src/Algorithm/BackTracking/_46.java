package Algorithm.BackTracking;

//https://leetcode.com/problems/permutations/

import java.util.*;

public class _46 {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ret = new ArrayList<>();
        dfs(ret, new LinkedHashSet<>(), nums);
        return ret;
    }

    private static void dfs(List<List<Integer>> ret, Set<Integer> path, int[] nums) {
        if (path.size() == nums.length) {
            ret.add(new ArrayList<>(path));
            return;
        }
        for (int num : nums) {
            if (path.add(num)) {
                dfs(ret, path, nums);
                path.remove(num);
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3}; //[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
//        int[] nums = {0,1}; //[[0,1],[1,0]]
//        int[] nums = {1}; //[[1]]
        permute(nums).forEach(System.out::println);
    }
}
