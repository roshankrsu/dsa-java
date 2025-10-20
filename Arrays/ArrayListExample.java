import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        
        // list.add(65);
        // list.add(615);
        // list.add(625);
        // list.add(635);
        // list.add(6145);
 
        // System.out.println(list.contains(615));


        // System.out.println(list);
        // list.set(0,99);
    
        // list.remove(2);

        // System.out.println(list);


        //input
      for (int i = 0; i < 5 ; i++) {
        list.add(in.nextInt());
      }

      // get items at any index
      for (int i = 0 ; i < 5; i++) {
        System.out.print(list.get(i) ); // pass index here, list[index] syntax will not work here
      }

      System.out.println(list);
}
}