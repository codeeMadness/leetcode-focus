package DataStructures.hashtable;

//https://leetcode.com/problems/first-unique-character-in-a-string/

import java.util.HashMap;
import java.util.Map;

public class _387 {
    public static int firstUniqChar(String s) {

        Map<String, Integer> counter = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            String key = s.charAt(i) + "";
            if(counter.containsKey(key)) {
                int value = counter.get(key);
                counter.put(key, ++value);
            }else {
                counter.put(key, 1);
            }
        }

        for(int i = 0; i < s.length(); i++) {
            if(counter.get(s.charAt(i) + "") == 1)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {
//        String s = "leetcode";
//        String s = "loveleetcode";
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }
}
