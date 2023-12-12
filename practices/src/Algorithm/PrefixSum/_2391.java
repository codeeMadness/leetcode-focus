package Algorithm.PrefixSum;

//https://leetcode.com/problems/minimum-amount-of-time-to-collect-garbage/

public class _2391 {
    public static int garbageCollection(String[] garbage, int[] travel) {
        int last[] = new int[128], res = 0;
        for (int i = 0; i < garbage.length; ++i) {
            res += garbage[i].length();
            for (int j = 0; j < garbage[i].length(); ++j)
                last[garbage[i].charAt(j)] = i;
        }

        //prefix sum for travel time
        for (int j = 1; j < travel.length; ++j)
            travel[j] += travel[j - 1];

        for (int c : "PGM".toCharArray())
            if (last[c] > 0)
                res += travel[last[c] - 1];
        return res;
    }
    public static void main(String[] args) {
//        String[] garbage = {"G","P","GP","GG"}; //21
//        int[] travel = {2,4,3};

        String[] garbage = {"MMM","PGM","GP"}; //37
        int[] travel = {3,10};
        System.out.println(garbageCollection(garbage, travel));
    }
}
