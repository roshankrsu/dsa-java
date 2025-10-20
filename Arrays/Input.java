import java.util.Arrays;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 11;
        arr[2] = 23;
        arr[3] = 14;
        arr[4] = 15;
      //[1,11,23,14,15]
        // System.out.println(arr[2]);

        //input using for loops
        // for (int i = 0; i < arr.length; i++) {
        //          arr[i] = in.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));
        
        //arrays of objects
        String[] str = new String[5];
        for (int i = 0; i<str.length; i++){
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
