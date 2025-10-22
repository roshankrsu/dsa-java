import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Stack<String> stack =  new Stack<String>();
    
    // Stack = LIFO data structure. Last_In First-OUT
    //         stores objects into a sort of "vertical tower"
    //        push() to add to the top
    //        pop() to remove from the top
    //        peek() to see the element from the top



    stack.push("Valorant");
    stack.push("Minecraft");
    stack.push("GTA");
    stack.push("COD");
  
    // String myFavGame = stack.pop(); // removes the COD 
    // System.out.println(stack.peek());
    // System.out.println(stack.search("COD"));
    // System.out.println(stack);
 
  //   for (int i = 0; i < 10; i++) {
  //        stack.push("skate.");
  //   }
  //   System.out.println(stack);

  // }
  //use of stacks?
  //1. undo/redo features in text editor
  //2. moving back/forward through browser history
  //3. backtracking algorithms (maze, file directions)
  //4. calling function(call stack)
  
}
}