 package datastructures.arrays;

 import java.util.Arrays;

 //https://leetcode.com/problems/duplicate-zeros/solutions/322576/python-3-real-in-place-solution/
 public class _1089 {

    public static void shiftRight(int[] arr, int index) {
        for(int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i-1];
        }
    }

    public static int[] attempt() {
        int[] arr = {1,0,2,3,0,4,5,0}; //O(1)
        //output: [1,0,0,2,3,0,0,4]

        int index = 0; //O(1)
        while(index < arr.length) {//O(n)
            if(arr[index] != 0 ){
                index++;
            }else if(arr[index] == 0) {
                shiftRight(arr, index);
                index +=2;
            }
        }

        return arr;
    }

//     def duplicateZeros(self, arr: List[int]) -> None:
//         zeroes = arr.count(0)
//         n = len(arr)
//        for i in range(n-1, -1, -1):
//             if i + zeroes < n:
//                 arr[i + zeroes] = arr[i]
//             if arr[i] == 0:
//                 zeroes -= 1
//                 if i + zeroes < n:
//                     arr[i + zeroes] = 0

     public static int[] attempt2() {
         int[] arr = {1,0,2,3,0,4,5,0};

         int zeroes = 0;
         for(int i : arr) {
             if(i == 0) zeroes++;
         }

         int n = arr.length;
         for(int i = n-1; i >= 0; i--) {
             if((i + zeroes) < n) {
                 arr[i+zeroes] = arr[i];
             }
             if(arr[i] == 0) {
                 zeroes--;
                 if((i+zeroes) < n) {
                     arr[i+zeroes] = 0;
                 }
             }
         }

         return arr;
     }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(attempt2()));
    }
}
