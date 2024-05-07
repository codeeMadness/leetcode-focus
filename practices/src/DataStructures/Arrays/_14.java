package DataStructures.Arrays;

//https://leetcode.com/problems/longest-common-prefix/description/

public class _14 {

    public static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for(int i = 1 ; i < strs.length ; i++){

            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }

        }
        return prefix;
    }

    public static void main(String[] args) {

        System.out.println("flow".indexOf("flower"));
        System.out.println("flower".substring(0, "flower".length()-1));

        String[] strs = {"flower","flow","flight"}; //fl
//        String[] strs = {"dog","racecar","car"}; //
        System.out.println(longestCommonPrefix(strs));
    }
}
