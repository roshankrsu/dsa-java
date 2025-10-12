//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double P = input.nextDouble();
        System.out.print("Enter the rate: ");
        double R = input.nextDouble();
        System.out.print("Enter the time: ");
        double T = input.nextDouble();


        double SI = ( P * R * T) / 100;
        double TotalAmount = P + SI;
        System.out.println("Interest will be: " + SI);
        System.out.println("Total Amount : "+ TotalAmount);
    }
}
