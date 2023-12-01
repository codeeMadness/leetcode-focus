package Algorithm.LineSweep;

//https://leetcode.com/problems/maximum-population-year/

public class _1854 {
    public static int maximumPopulation(int[][] logs) {
        int[] year = new int[2051];

        // O(n) -> n is log.length

        for(int[] log : logs){

            year[log[0]] += 1;
            year[log[1]] -= 1;
        }

        int maxNum = year[1950], maxYear = 1950;

        // O(100) -> 2050 - 1950 = 100

        for(int i = 1951; i < year.length; i++){
            year[i] += year[i - 1];  // Generating Prefix Sum

            if(year[i] > maxNum){
                maxNum = year[i];
                maxYear = i;
            }
        }

        return maxYear;
    }

    public static void main(String[] args) {
//        int[][] logs = { {1993,1999} , {2000,2010} };
        int[][] logs = { {1950,1961},{1960,1971},{1970,1981} };
        System.out.println(maximumPopulation(logs));
    }
}
