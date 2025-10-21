import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empId = input.nextInt();
        String department = input.next();

        switch (empId) {
            case 1:
                System.out.println("Roshan");
                break;
            case 2:
                 System.out.println("raghav");
                 break;
            case 3:
            System.out.println("Emp number 3");
                 switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management": 
                        System.out.println("Management Department");
                        break;
                    default:
                        System.out.println("No department entered");
                 };
                 break;
            default:
                System.out.println("Enter correct EmpID");     
        }
    }
}
