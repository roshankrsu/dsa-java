//Take name as input and print a greeting message for that particular name.
import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Hello "+ name);
    }
}
