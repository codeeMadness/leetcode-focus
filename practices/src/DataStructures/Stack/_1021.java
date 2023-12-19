package DataStructures.Stack;

//https://leetcode.com/problems/remove-outermost-parentheses/

import java.util.Stack;

public class _1021 {
    public static String removeOuterParentheses(String s) {
        Stack<Character> bracket = new Stack<>();
        StringBuilder sb = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(bracket.size()>0){
                    sb.append(s.charAt(i));
                }
                bracket.push(s.charAt(i));
            }else{
                bracket.pop();
                if(bracket.size()>0){
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String  s = "(()())(())"; //"()()()"
//        s = "(()())(())(()(()))"; //"()()()()(())"
//        s = "()()"; //""
        System.out.println(removeOuterParentheses(s));
    }
}
