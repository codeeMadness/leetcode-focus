package datastructures.arrays;

//https://leetcode.com/problems/reverse-words-in-a-string-iii/

public class _557 {

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        s = "";
        for(String word : words) {
            StringBuilder sb = new StringBuilder(word);
            s += sb.reverse().toString() + " ";
        }
        s = s.substring(0, s.length()-1);
        return s;
    }

    public static void main(String[] args) {
//        String s = "Let's take LeetCode contest"; //"s'teL ekat edoCteeL tsetnoc"
        String s = "God Ding"; //"doG gniD"
        System.out.println(reverseWords(s));
    }
}
