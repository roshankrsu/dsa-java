public class Main {

    public static void main(String[] args) {
        int[] nums = {23,343,66,78,1,23,-22,343,69};
        int target = 66;
        System.out.println(linearSearch(nums, target));
        System.out.println(linearSearch2(nums, target));
        System.out.println(linearSearch3(nums, target));
    }

    // search the target and return true or false

    static boolean linearSearch3(int[] arr, int target) {
        // checks if the array length is zero
        if (arr.length == 0) {
            return false;
        }

        // run a for loop
        for (int i = 0; i < arr.length; i++) {
            // check for element at every index if it is = target
            int element = arr[i];
            if (element == target) {
                return true;
            }
        }
        // if element not found
        return false;
    }

   //search the target and return the element
   
   static int linearSearch2(int[] arr, int target) {
       // checks if the array length is zero
       if (arr.length == 0) {
           return -1;
       }

       // run a for loop
       for (int i = 0; i < arr.length; i++) {
           // check for element at every index if it is = target
           int element = arr[i];
           if (element == target) {
               return element;
           }
       }
       // if element not found
       return Integer.MAX_VALUE;
   }

    //search in the array: return the index if the target found 
    //otherwise if item not found return -1
    static  int linearSearch(int[] arr, int target) {
        //checks if the array length is zero
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int i = 0; i < arr.length; i++) {
            //check for element at every index if it is = target
            int element = arr[i];
            if(element == target) {
                return i;
            }
        }
        // if element not found
        return -1;
    }
}