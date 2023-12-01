package Algorithm.PrefixSum;

//https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/

public class _1413 {
    public static int minStartValue(int[] nums) {
        int startValue = 1, sum = startValue;
        for(int num : nums) {
            sum += num;
            if(sum < 1) {
                int addValue = 1-sum;
                startValue += addValue;
                sum += addValue;
            }
        }
        return startValue;
    }

    public static void main(String[] args) {
//        int[] nums = {-3,2,-3,4,2};//5
//        int[] nums = {1,2};//1
        int[] nums = {1,-2,-3};//5
        System.out.println(minStartValue(nums));
    }
}
