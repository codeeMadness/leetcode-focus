package Algorithm.LineSweep;

//https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/

public class _1893 {
    public static boolean isCovered(int[][] ranges, int left, int right) {
        int[] line = new int[52];
        for (var r : ranges) {
            line[r[0]] += 1;
            line[r[1] + 1] -= 1;
        }
        for (int i = 1, overlaps = 0; i <= right; ++i) {
            overlaps += line[i];
            if (i >= left && overlaps == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] ranges = {{1,2},{3,4},{5,6}};
        System.out.println(isCovered(ranges,2,5));
    }
}
