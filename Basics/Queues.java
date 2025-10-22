import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        // Queue = FIFO data structure. First-In First-Out
        // A collection designed for holding elements prior to processing the linear
        // data structure

        // add = enqueue, offer()
        // remove = dequeue, poll()

        Queue<String> queue = new LinkedList<String>();

        // to add elements
        queue.offer("Karan");
        queue.offer("stuvie");
        queue.offer("karma");
        queue.offer("pan singh tomar");

        // System.out.println(queue.isEmpty());
        // System.out.println(queue.size());
        // System.out.println(queue.contains("Karan"));

        // System.out.println(queue.peek()); print karan

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();

        // System.out.println(queue);

        // where are queues useful?

        //1. keyboard buffer (letters should appear on the screen in the order they're passed)
       //2. printer queue(print jobs should be completed in order)
       //3. used in linkedlists, priority queues
    }
}
