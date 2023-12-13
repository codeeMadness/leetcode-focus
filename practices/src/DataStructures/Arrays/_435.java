package DataStructures.Arrays;

//https://leetcode.com/problems/non-overlapping-intervals/description/

import java.util.Arrays;
import java.util.Comparator;

public class _435 {
    public static int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));

        int end = intervals[0][1];
        int count = 1;

        for (int i = 1; i < n; i++) {
            int start = intervals[i][0];
            if (start >= end) {
                end = intervals[i][1];
                count++;
            }
        }
        return n - count;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        System.out.println(eraseOverlapIntervals(intervals));
    }
}
