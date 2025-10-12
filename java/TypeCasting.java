import java.util.Scanner;

public class TypeCasting{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // float num = input.nextFloat();
    //    int num = input.nextInt();
    //    System.out.println(num);
  
        //type casting
        int num = (int)(67.56f);
        // System.out.println(num);
       
        //automatic type promotion in expressions
        // int a = 253;
        // byte b = (byte)(a);

        // byte a =  40;
        // byte b = 50;
        // byte c = 100;
        // int d = a * b / c;

        // System.out.println(d);

        // int number  = 'a';
        // System.out.println(number);//print 97

        // System.out.println(6 *5.4);

        byte b = 42;
        char c = 'c';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.12345;
        double result = (f * b) + (i / c) - (d + s);
        //float + int - double = double
        System.out.println((f * b) + " " + (i / c) + " " + (d + s));
        System.out.println(result);


    }
}