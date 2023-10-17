package datastructures.arrays;

import java.util.Arrays;

public class _344 {
    public static void main(String[] args) {
//        char[] s = {'h','e','l','l','o'};
        char[] s = {'H','a','n','n','a','h'};

        int i = 0;
        int n = s.length;

        while(i < n/2) {
            char temp = s[i];
            s[i] = s[n-i-1];
            s[n-i-1] = temp;
            i++;
        }

        System.out.println(Arrays.toString(s));
    }
}
