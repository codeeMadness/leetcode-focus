package DataStructures.Arrays;

//https://leetcode.com/problems/sign-of-the-product-of-an-array/description/

public class _1822 {
    public static int arraySign(int[] nums) {
        int sign = 1;
        for (int i : nums) {
            if (i == 0) return 0;
            if (i < 0) sign *= -1;
        }
        return sign;
    }

    public static void main(String[] args) {
//        int[] nums = {-1,-2,-3,-4,3,2,1}; //1
//        int[] nums = {1,5,0,2,-3}; //0
        int[] nums = {-1,1,-1,1,-1}; //-1

        System.out.println(arraySign(nums));
    }
}
