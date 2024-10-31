package Algorithm.TwoPointers;

import java.util.Arrays;

public class _455 {
    public static int findContentChildren(int[] children, int[] cookies) {
        Arrays.sort(children);
        Arrays.sort(cookies);

        int child = 0;
        for (int cookie = 0; child < children.length && cookie < cookies.length; cookie ++) {
            if (cookies[cookie] >= children[child]) {
                child ++;
            }
        }

        return child;
    }

    public static void main(String[] args) {
        int[] g = {1,2,3}, s = {1,1}; //1
        System.out.println(findContentChildren(g,s));
    }
}
