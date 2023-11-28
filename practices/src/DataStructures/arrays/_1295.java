package DataStructures.arrays;

public class _1295 {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};//O(1)
        int count = 0;//O(1)
        for(int num : nums) {//O(n)
            String numStr = num + "";//O(m)
            if(numStr.length() % 2 == 0) count++; //O(1)
        }
        System.out.println(count);
        // O(n.m)
        // n so phan tu trong nums
        // m so ky tu trong moi phan tu
    }
}
