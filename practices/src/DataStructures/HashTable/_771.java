package DataStructures.HashTable;

import java.util.HashMap;
import java.util.Map;

public class _771 {
    public static int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> jewelsMap = new HashMap<>();
        for(int i = 0; i < jewels.length(); i++) {
            jewelsMap.put(jewels.charAt(i), 0);
        }

        int count = 0;
        for(int i = 0; i < stones.length(); i++) {
            if(jewelsMap.containsKey(stones.charAt(i)))
                count++;
        }

        return count;
    }

    public static void main(String[] args) {
//        String jewels = "aA", stones = "aAAbbbb";//3
        String jewels = "z", stones = "ZZ";//0
        System.out.println(numJewelsInStones(jewels, stones));
    }
}
