package DataStructures.Arrays;

//https://leetcode.com/problems/height-checker/

import java.util.Arrays;

public class _1051 {

    public static int heightChecker(int[] heights) {
        int[] expected = Arrays.copyOf(heights, heights.length);
        Arrays.sort(expected);

        int count = 0;
        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != expected[i]) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] heights = {1,1,4,2,1,3};
        System.out.println(heightChecker(heights));
    }
}
