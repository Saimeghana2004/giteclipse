package module1;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner scanner = new Scanner(System.in);

		        // Ask the user how many Fibonacci numbers to print
		        System.out.print("How many numbers in the Fibonacci sequence should be printed? ");
		        int n = scanner.nextInt();

		        // Print the Fibonacci sequence
		        System.out.println("Fibonacci sequence up to " + n + " numbers:");
		        printFibonacci(n);

		        scanner.close();
		    }

		    // Method to print the Fibonacci sequence
		    public static void printFibonacci(int count) {
		        int a = 0, b = 1;
		        for (int i = 1; i <= count; i++) {
		            System.out.print(a + " ");
		            int next = a + b;
		            a = b;
		            b = next;
		        }
		    }
		}


                                                                                                                 	

        
	



