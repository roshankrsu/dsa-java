import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // String fruit = input.nextLine();
        // switch(fruit){
        //     case "mango" -> System.out.println("King of fruits");
        //     case "apple" -> System.out.println("a sweet little red fruit");
        //     case "banana" -> System.out.println("monkey favorite food");
        //     default -> System.out.println("please enter a valid fruit");
        // }
        int day  = input.nextInt();
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friay");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
    }
}
