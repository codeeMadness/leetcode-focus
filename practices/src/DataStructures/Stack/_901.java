package DataStructures.Stack;

//https://leetcode.com/problems/online-stock-span/description/

import java.util.Stack;

public class _901 {

    static class StockSpanner {

        private Stack<int[]> stack;

        public StockSpanner() {
            this.stack = new Stack<>();
        }

        public int next(int price) {
            int res = 1;
            while (!stack.isEmpty() && stack.peek()[0] <= price)
                res += stack.pop()[1];
            stack.push(new int[]{price, res});
            return res;
        }
    }

    public static void main(String[] args) {
        StockSpanner stockSpanner = new StockSpanner();
//        stockSpanner.next(100); // return 1
//        stockSpanner.next(80);  // return 1
//        stockSpanner.next(60);  // return 1
//        stockSpanner.next(70);  // return 2
//        stockSpanner.next(60);  // return 1
//        stockSpanner.next(75);  // return 4, because the last 4 prices (including today's price of 75) were less than or equal to today's price.
//        stockSpanner.next(85);  // return 6

//        stockSpanner.next(31); //1
//        stockSpanner.next(41); //2
//        stockSpanner.next(48); //3
//        stockSpanner.next(59); //4
//        stockSpanner.next(79); //5

        stockSpanner.next(28); //1
        stockSpanner.next(14); //1
        stockSpanner.next(28); //3
        stockSpanner.next(35); //4
        stockSpanner.next(46); //5
        stockSpanner.next(53); //6
        stockSpanner.next(66); //7
        stockSpanner.next(80); //8
        stockSpanner.next(87); //9
        stockSpanner.next(88); //10
    }

}
