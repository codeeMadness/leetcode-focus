package Practice.Easy;

//https://leetcode.com/problems/excel-sheet-column-number/description/

import java.util.HashMap;
import java.util.Map;

public class _171 {

    public static Map<Character, Integer> alphabets;
    static {
        alphabets = new HashMap<>();
        alphabets.put('A',1);
        alphabets.put('B',2);
        alphabets.put('C',3);
        alphabets.put('D',4);
        alphabets.put('E',5);
        alphabets.put('F',6);
        alphabets.put('G',7);
        alphabets.put('H',8);
        alphabets.put('I',9);
        alphabets.put('J',10);
        alphabets.put('K',11);
        alphabets.put('L',12);
        alphabets.put('M',13);
        alphabets.put('N',14);
        alphabets.put('O',15);
        alphabets.put('P',16);
        alphabets.put('Q',17);
        alphabets.put('R',18);
        alphabets.put('S',19);
        alphabets.put('T',20);
        alphabets.put('U',21);
        alphabets.put('V',22);
        alphabets.put('W',23);
        alphabets.put('X',24);
        alphabets.put('Y',25);
        alphabets.put('Z',26);
    }

    public static int titleToNumber(String columnTitle) {
        int res = alphabets.get(columnTitle.charAt(0));
        // Traverse the string
        for (int i = 1; i < columnTitle.length(); i++) {
            res = alphabets.get(columnTitle.charAt(i)) + 26 * res;
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("A")); //1
        System.out.println(titleToNumber("AB")); //28
        System.out.println(titleToNumber("ZY")); //701
        System.out.println(titleToNumber("FXSHRXW")); //2147483647
    }
}
