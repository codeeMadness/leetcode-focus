package DataStructures.Stack;

//https://leetcode.com/problems/baseball-game/

import java.util.Stack;

public class _682 {

    public static int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<>();

        for(String operation : operations) {
            if(operation.equals("C")) {
                scores.pop();
            }
            else if(operation.equals("D")) {
                int score = scores.peek();
                scores.push(score * 2);
            }
            else if(operation.equals("+")) {
                int score = scores.pop();
                int sum = score + scores.peek();
                scores.push(score);
                scores.push(sum);
            }
            else {
                int score = Integer.parseInt(operation);
                scores.push(score);
            }
        }

        int sum = 0;
        while(!scores.isEmpty()) {
            sum += scores.pop();
        }

        return sum;
    }

    public static void main(String[] args) {
        String[] ops = {"5","2","C","D","+"}; //30
//        String[] ops = {"5","-2","4","C","D","9","+","+"}; //27
//        String[] ops = {"1","C"}; //0
        System.out.println(calPoints(ops));
    }
}
