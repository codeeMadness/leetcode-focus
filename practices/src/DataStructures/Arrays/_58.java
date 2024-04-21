package DataStructures.Arrays;

//https://leetcode.com/problems/length-of-last-word/

public class _58 {

    public static int lengthOfLastWord(String s) {
        int count = 0;
        boolean meetWord = false;

        for(int i = s.length() - 1; i >= 0; i--) {

            if(Character.isWhitespace(s.charAt(i)) && meetWord) {
                break;
            }

            if(!Character.isWhitespace(s.charAt(i)) && ((s.charAt(i) >= 'a') || (s.charAt(i) <= 'z'))) {
                count++;
                meetWord = true;
            }
        }


        return count;
    }

    public static void main(String[] args) {
//        String s = "Hello World"; //5
//        String s = "   fly me   to   the moon  "; //4
        String s = "luffy is still joyboy"; //6
        System.out.println(lengthOfLastWord(s));
    }
}
