package DataStructures.Stack;

import java.util.Arrays;
import java.util.Stack;

//https://leetcode.com/problems/daily-temperatures/
public class _739 {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int days = i - stack.peek();
                temperatures[stack.pop()] = days;
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            temperatures[stack.pop()] = 0;
        }

        return temperatures;
    }
    public static void main(String[] args) {
//        int[] temperatures = {73,74,75,71,69,72,76,73}; //[1,1,4,2,1,1,0,0]
//        int[] temperatures = {30,40,50,60}; //[1,1,1,0]
        int[] temperatures = {30,60,90}; //[1,1,0]
        System.out.println(Arrays.toString(dailyTemperatures(temperatures)));

    }
}
