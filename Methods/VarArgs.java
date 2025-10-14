import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        // fun(2, 3, 4, 5, 6, 7, 99, 0);
        // multiple(2,4, "roshan", "dsdsds");
        // demo(4,4,5,67,333,55);
        demo("roshan", "kunal","brijesh");
    }

    static void demo(int ...v) {
         System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v){
         System.out.println(Arrays.toString(v));
    }

   static void multiple(int a, int b, String ...v){

   }

    static void fun(int ...v) {
          System.out.println(Arrays.toString(v));
    }
}
