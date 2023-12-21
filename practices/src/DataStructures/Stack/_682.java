package DataStructures.Stack;

//https://leetcode.com/problems/baseball-game/

import java.util.Stack;

public class _682 {

    public static int calPoints(String[] operations) {
        Stack<Integer> scores = new Stack<>();

        int sum = 0;
        for(String operation : operations) {

        }



        return sum;
    }

    public static Integer[] isNumeric(String strNum) {
        Integer[] res = new Integer[]{null, 0};
        if (strNum == null) {
            return res;
        }
        try {
            Integer d = Integer.parseInt(strNum);
            res[1] = 1;
        } catch (NumberFormatException nfe) {
            return res;
        }
        return res;
    }

    public static void main(String[] args) {

    }
}
