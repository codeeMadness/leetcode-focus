package Practice.Easy;

//https://leetcode.com/problems/reverse-vowels-of-a-string/description/

import java.util.List;

public class _345 {
    private static String VOWELS = "aeiouAEIOU";

    public static String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;


        while(i < j) {
            if(isVowel(s.charAt(i)) && isVowel(s.charAt(j))) {
                s = swap(s, i, j);
                i++;
                j--;
            }
            else if(!isVowel(s.charAt(i)) && !isVowel(s.charAt(j))) {
                i++;
                j--;
            }
            else if(isVowel(s.charAt(i)) && !isVowel(s.charAt(j))) {
                j--;
            }
            else if(!isVowel(s.charAt(i)) && isVowel(s.charAt(j))) {
                i++;
            }

        }

        return s;
    }

    private static boolean isVowel(Character c) {
        return VOWELS.indexOf(c) != -1;
    }

    private static String swap(String str, int i, int j)
    {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("IceCreAm")); //AceCreIm
        System.out.println(reverseVowels("leetcode")); //leotcede
        System.out.println(reverseVowels("lt")); //lt
        System.out.println(reverseVowels("oe")); //eo
        System.out.println(reverseVowels("o")); //eo
        System.out.println(reverseVowels("ete")); //ete
        System.out.println(reverseVowels("")); //
    }
}
