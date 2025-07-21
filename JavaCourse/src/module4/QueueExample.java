package module4;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        // Adding elements
        queue.add("Alice");
        queue.add("Bob");
        queue.add("Charlie");

        // Viewing the front element
        System.out.println("Front: " + queue.peek());

        // Removing elements
        System.out.println("Removed: " + queue.poll());
        System.out.println("Removed: " + queue.poll());

        // Printing remaining queue
        System.out.println("Remaining Queue: " + queue);
    }
}



