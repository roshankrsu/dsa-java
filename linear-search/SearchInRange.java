public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {12,34,26,62,43,6,88};
        int target = 6;
        System.out.println(linearSearch(arr, target, 1, 4)); 
    }
    
    static int linearSearch(int[] arr, int target, int start , int end) {
        // checks if the array length is zero
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int i = start; i <= end; i++) {
            // check for element at every index if it is = target
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        // if element not found
        return -1;
    }
}
