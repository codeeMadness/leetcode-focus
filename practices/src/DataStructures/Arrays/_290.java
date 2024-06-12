package DataStructures.Arrays;

//https://leetcode.com/problems/word-pattern/description/

import java.util.*;

public class _290 {
    public static boolean wordPattern(String pattern, String s) {

        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;

        Map<Character, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>();

        for(int i = 0; i < pattern.length(); i++) {
            if(map.containsKey(pattern.charAt(i))) {
                if(!words[i].equals(words[map.get(pattern.charAt(i))])) return false;
            }
            map.put(pattern.charAt(i), i);
            set.add(words[i]);
        }

        return set.size() == map.size();
    }

    public static boolean wordPattern2(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length())
            return false;
        Map index = new HashMap();
        for (Integer i=0; i<words.length; ++i)
            if (index.put(pattern.charAt(i), i) != index.put(words[i], i))
                return false;
        return true;
    }

    public static void main(String[] args) {
//        String pattern = "abba", s = "dog dog dog dog"; //true
//        String pattern = "abba", s = "dog cat cat fish"; //false
//        String pattern = "abba", s = "dog dog dog dog"; //false
        String pattern = "abc", s = "dog cat dog"; //false
        System.out.println(wordPattern2(pattern, s));
    }
}
