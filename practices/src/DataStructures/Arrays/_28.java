package DataStructures.Arrays;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

public class _28 {

    public static int strStr(String haystack, String needle) {
        int result = 0;
        if (haystack.length() <= 0 && needle.length() > 0) return -1;
        if (haystack.length() != 0) {
            int occurence = haystack.indexOf(needle);
            if (occurence == -1)
                return occurence;
            result = occurence;
        }
        return result;
    }

    public static void main(String[] args) {
//        String haystack = "sadbutsad", needle = "sad"; //0
//        String haystack = "leetcode", needle = "leeto"; //-1
//        String haystack = "a", needle = "a"; //0
        String haystack = "mississippi", needle = "issip"; //-1
        System.out.println(strStr(haystack, needle));
    }
}
