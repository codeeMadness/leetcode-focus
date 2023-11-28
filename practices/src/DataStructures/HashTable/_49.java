package DataStructures.HashTable;

//https://leetcode.com/problems/group-anagrams/

import java.util.*;
import java.util.stream.Collectors;

public class _49 {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            List<String> words = new ArrayList<>();
            String key = getKey(str);
            System.out.println(key);
            if(map.containsKey(key)) {
                words = map.get(key);
                words.add(str);
            } else {
                words.add(str);
                map.put(key, words);
            }

        }

        return map.values().stream().collect(Collectors.toList());
    }

    private static String getKey(String str) {
        int[] key = new int[26];
        for(int i = 0; i < 26; i++) {
            key[i] = 0;
        }

        // using simple for-loop
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            key[(int) c - (int) 'a'] += 1;
        }

        String[] strArr = Arrays.stream(key).mapToObj(String::valueOf).toArray(String[]::new);
        return String.join("-", strArr);
    }

    public static void main(String[] args) {
//        String[] strs = {"eat","tea","tan","ate","nat","bat"};
//        String[] strs = {""};
//        String[] strs = {"a"};
        String[] strs = {"bdddddddddd", "bbbbbbbbbbc"};
        for(List<String> group : groupAnagrams(strs)) {
            System.out.println(" ");
            group.stream().forEach(s -> {
                System.out.println(s + "    ");
            });
        }
    }
}
