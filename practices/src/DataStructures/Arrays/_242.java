package DataStructures.Arrays;

//https://leetcode.com/problems/valid-anagram/description/

import java.util.HashMap;
import java.util.Map;

public class _242 {

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> alphabet = new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ++ch) {
            alphabet.put(ch, 0);

        }
        for(int i = 0; i < s.length(); i++) {
            Integer count = alphabet.getOrDefault(s.charAt(i), 0);
            alphabet.put(s.charAt(i), ++count);
        }

        for(int i = 0; i < t.length(); i++) {
            Integer count = alphabet.getOrDefault(t.charAt(i), 0);
            alphabet.put(t.charAt(i), --count);
        }

        for(Map.Entry<Character, Integer> entry : alphabet.entrySet()) {
            if(entry.getValue() > 0 || entry.getValue() < 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
//        String s = "anagram", t = "nagaram"; //true
//        String s = "rat", t = "car"; //false
//        String s = "aa", t = "bb"; //false
        String s = "aa", t = "a"; //false
        System.out.println(isAnagram(s,t));
    }

}
