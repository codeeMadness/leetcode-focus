package DataStructures.Stack;

//https://leetcode.com/problems/crawler-log-folder/

import java.util.Stack;

public class _1598 {
    public static int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        int step = 0;
        for(String log : logs) {
            if(!stack.isEmpty() && log.equals("../"))
                stack.pop();
            if(!log.equals("./") && !log.equals("../"))
                stack.push(log);
        }

        while(!stack.isEmpty()){
            step++;
            stack.pop();
        }

        return step;
    }

    public static void main(String[] args) {
//        String[] logs = {"d1/","d2/","../","d21/","./"}; //2
//        String[] logs = {"d1/","d2/","./","d3/","../","d31/"}; //3
//        String[] logs = {"d1/","../","../","../"}; //0
        String[] logs = {"./","../","./"}; //0
        System.out.println(minOperations(logs));
    }
}
