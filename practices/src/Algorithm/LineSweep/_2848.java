package Algorithm.LineSweep;

//https://leetcode.com/problems/points-that-intersect-with-cars/

import java.util.List;

public class _2848 {

    public static int numberOfPoints(int[][] nums) {

        int[] sweepLine = new int[102];

        int ans = 0, prefixSum = 0;

        for(int[] points: nums){
            sweepLine[points[0]] += 1;
            sweepLine[points[1]+1] -= 1;
        }

        for(int i = 1; i <= 100; ++i){
            prefixSum += sweepLine[i];
            if(prefixSum != 0)
                ans++;
        }

        return ans;
    }


    public static void main(String[] args) {
//        int[][] nums = {{3,6},{1,5},{4,7}};
        int[][] nums = {{1,3},{5,8}};
        System.out.println(numberOfPoints(nums));
    }
}
