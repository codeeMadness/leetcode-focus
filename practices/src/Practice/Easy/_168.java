package Practice.Easy;

//https://leetcode.com/problems/excel-sheet-column-title/description/

import java.util.HashMap;
import java.util.Map;

public class _168 {
    public static Map<Integer, String> alphabets;
    static {
        alphabets = new HashMap<>();
        alphabets.put(1, "A");
        alphabets.put(2, "B");
        alphabets.put(3, "C");
        alphabets.put(4, "D");
        alphabets.put(5, "E");
        alphabets.put(6, "F");
        alphabets.put(7, "G");
        alphabets.put(8, "H");
        alphabets.put(9, "I");
        alphabets.put(10, "J");
        alphabets.put(11, "K");
        alphabets.put(12, "L");
        alphabets.put(13, "M");
        alphabets.put(14, "N");
        alphabets.put(15, "O");
        alphabets.put(16, "P");
        alphabets.put(17, "Q");
        alphabets.put(18, "R");
        alphabets.put(19, "S");
        alphabets.put(20, "T");
        alphabets.put(21, "U");
        alphabets.put(22, "V");
        alphabets.put(23, "W");
        alphabets.put(24, "X");
        alphabets.put(25, "Y");
        alphabets.put(26, "Z");
    }

    public static String convertToTitle(int columnNumber) {
        if(columnNumber <= 26) {
            return alphabets.get(columnNumber);
        }

        String[] res = new String[] {"", "", ""};
        Integer current;

        for(Integer i : alphabets.keySet()) {
            if((columnNumber - i) % 26 == 0) {
                res[2] = alphabets.get(i);
                current = i;
                columnNumber = (columnNumber - current) / 26;
                break;
            }
        }

        for(Integer j : alphabets.keySet()) {
            if((columnNumber - j) % 26 == 0) {
                res[1] = alphabets.get(j);
                columnNumber = (columnNumber - j) / 26;
                if(columnNumber > 0) {
                    res[0] = alphabets.get(columnNumber);
                }
                break;
            }
        }

        return String.join("", res);
    }

    public static void main(String[] args) {
        System.out.println(convertToTitle(1)); //A
        System.out.println(convertToTitle(28)); //AB
        System.out.println(convertToTitle(701)); //ZY
        System.out.println(convertToTitle(16384)); //XFD
        System.out.println(convertToTitle(2147483647)); //FXSHRXW
    }
}
