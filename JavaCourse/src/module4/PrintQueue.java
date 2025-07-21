package module4;


import java.util.LinkedList;
import java.util.Queue;

public class PrintQueue {
    public static void main(String[] args) {
        // Create a Queue to represent the print queue
        Queue<String> printQueue = new LinkedList<>();

        // Add print jobs to the queue
        printQueue.add("Document1.pdf");
        printQueue.add("Image2.png");
        printQueue.add("Report3.docx");
        printQueue.add("Slides4.pptx");

        // Display the print queue
        System.out.println("Current print queue: " + printQueue);

        // Process the print jobs in FIFO order
        System.out.println("\nProcessing print jobs...");
        while (!printQueue.isEmpty()) {
            String currentJob = printQueue.poll(); // Removes and returns the head of the queue
            System.out.println("Printing: " + currentJob);
        }

        // Queue should now be empty
        System.out.println("\nAll jobs processed. Queue empty: " + printQueue.isEmpty());
    }
}

