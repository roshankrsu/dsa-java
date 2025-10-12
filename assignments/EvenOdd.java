//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if(num%2==0){
            System.out.println(num +" is even number");
        }else{
            System.out.println(num + " is odd number");
        }
    }
}