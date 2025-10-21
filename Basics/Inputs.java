import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        System.out.print("Enter your roll number : ");
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("Your roll number is " + rollno);
    }
}
