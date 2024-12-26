package Practice.Easy;

//https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

public class _28 {
    public static int strStr(String haystack, String needle) {
        int i = 0, j = 0;
        int startIndex = 0;
        while (i < haystack.length()){
            // as long as the characters are equal, increment needleIndex
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
            } else{
                // start from the next index of previous start index
                startIndex++;
                i = startIndex;
                // needle should start from index 0
                j = 0;
            }
            // check if needleIndex reached needle length
            if(j == needle.length()){
                // return the first index
                return i - needle.length();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        String haystack = "sadbutsad", needle = "sad"; // 0
//        String haystack = "leetcode", needle = "leeto"; // -1
//        String haystack = "coellellode", needle = "ello"; // -1
        String haystack = "mississippi", needle = "issip"; // 4
//        String haystack = "mississippi", needle = "issi"; // 1
        System.out.println(strStr(haystack, needle));
    }
}
