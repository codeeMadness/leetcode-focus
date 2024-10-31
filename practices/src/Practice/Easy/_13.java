package Practice.Easy;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/roman-to-integer/
public class _13 {
    private static final Map<String, Integer> map = new HashMap<>();
    static {
        map.put("I", 1);
        map.put("V", 5); //not allow to duplicate
        map.put("X", 10);
        map.put("L", 50); //not allow to duplicate
        map.put("C", 100);
        map.put("D", 500); //not allow to duplicate
        map.put("M", 1000);
    }

    public static int romanToInt(String s) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III")); //3
        System.out.println(romanToInt("LVIII")); //58
        System.out.println(romanToInt("LX")); //60
        System.out.println(romanToInt("LXX")); //70
        System.out.println(romanToInt("LXXX")); //80
        System.out.println(romanToInt("CD")); //400
        System.out.println(romanToInt("DLXXVI")); //576
        System.out.println(romanToInt("MCMXCIV")); //1994
        System.out.println(romanToInt("MMMCMXCIX")); //3999
    }
}
