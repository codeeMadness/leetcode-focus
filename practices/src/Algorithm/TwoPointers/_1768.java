package Algorithm.TwoPointers;

public class _1768 {

    public static String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        StringBuffer result = new StringBuffer();

        while(i < word1.length() || j < word2.length()) {

            if(i < word1.length()) {
                result.append(word1.charAt(i));
                i++;

            }

            if(j < word2.length()) {
                result.append(word2.charAt(j));
                j++;

            }
        }


        return result.toString();
    }

    public static void main(String[] args) {
//        String word1 = "abc", word2 = "pqr"; //"apbqcr"
//        String word1 = "ab", word2 = "pqrs"; //"apbqrs"
        String word1 = "abcd", word2 = "pq"; //"apbqcd"
        System.out.println(mergeAlternately(word1, word2));
    }
}
