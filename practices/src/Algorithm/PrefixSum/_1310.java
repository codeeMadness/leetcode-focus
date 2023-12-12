package Algorithm.PrefixSum;

//https://leetcode.com/problems/xor-queries-of-a-subarray/

import java.util.Arrays;

public class _1310 {
    public static int[] xorQueries(int[] arr, int[][] queries) {
        //prefix XOR
        for (int i = 1; i < arr.length; ++i)
            arr[i] ^= arr[i - 1];

        int[] res = new int[queries.length], query;
        for (int i = 0; i < queries.length; ++i) {
            query = queries[i];
            res[i] = query[0] > 0 ? arr[query[1]] ^ arr[query[0] - 1] : arr[query[1]];
        }
        return res;
    }

    public static void main(String[] args) {
//        int[] arr = {1,3,4,8}, queries[] = {{0,1},{1,2},{0,3},{3,3}}; //[2,7,14,8]
        int[] arr = {4,8,2,10}, queries[] = {{2,3},{1,3},{0,0},{0,3}}; //[8,0,4,4]
        System.out.println(Arrays.toString(xorQueries(arr, queries)));
    }
}
