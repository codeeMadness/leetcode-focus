package DataStructures.hashtable;

//https://leetcode.com/problems/isomorphic-strings/

import java.util.HashMap;
import java.util.Map;

public class _205 {
    public static boolean isIsomorphic(String s, String t) {

        Map<String, String> mapS = new HashMap<>();
        Map<String, String> mapT = new HashMap<>();

        int i = 0;
        while (i < s.length()) {
            String charS = s.charAt(i)+"";
            String charT = t.charAt(i)+"";

            if(mapS.containsKey(charS)) {
                if(!mapS.get(charS).equals(charT)) return false;
            } else {
                mapS.put(charS, charT);
            }

            if(mapT.containsKey(charT)) {
                if(!mapT.get(charT).equals(charS)) return false;
            } else {
                mapT.put(charT, charS);
            }

            i++;
        }

        return true;
    }
    public static void main(String[] args) {
//        String s = "egg", t = "add";
//        String s = "foo", t = "bar";
//        String s = "paper", t = "title";
        String s = "badc", t = "baba";

        System.out.println(isIsomorphic(s, t));
    }
}
