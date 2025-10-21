import java.util.Arrays;

public class SearchIn2DArrray {
    public static void main(String[] args) {
        int[][] arr = {
           {1,4,5},
           {66,88,44,21},
           {2,467,11},
           {81,18}
        };
        int target = 18;
        int[] ans = search(arr, target); // format of return value {row, col}
        // System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
    }

    //
    static int[] search(int[][] arr, int target){
     for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            if(arr[row][col] == target) {
                return new int[]{row, col};
            }
        }
     }
        return new int[]{-1, -1};
    } 

     static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
     for (int row = 0; row < arr.length; row++) {
        for (int col = 0; col < arr[row].length; col++) {
            if(arr[row][col] > max) {
               max = arr[row][col];
            }
        }
     }
        return max;
    } 
}

