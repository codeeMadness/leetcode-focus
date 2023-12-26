package DataStructures.Stack;

import java.util.Arrays;
import java.util.Stack;

//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
public class _1475 {
    public static int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i])
                prices[stack.pop()] -= prices[i];
            stack.push(i);
        }
        return prices;
    }
    public static void main(String[] args) {
        int[] prices = {8,4,6,2,3}; //[4,2,4,2,3]
//        int[] prices = {1,2,3,4,5}; //[1,2,3,4,5]
//        int[] prices = {10,1,1,6}; //[9,0,1,6]
        System.out.println(Arrays.toString(finalPrices(prices)));

    }
}
