package module1;
import java.util.Scanner;
public class SkipMultiplesOf7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner scanner = new Scanner(System.in);

		        // Ask the user for the upper limit
		        System.out.print("Enter the upper limit (N): ");
		        int n = scanner.nextInt();

		        System.out.println("Numbers from 1 to " + n + " excluding multiples of 7 :");

		        for (int i = 1; i <= n; i++) {
		            if (i % 7 == 0 || String.valueOf(i).contains("7")) {
		                continue; // Skip if divisible by 7 or contains the digit 
		            }
		            System.out.print(i + " ");
		        }

		        scanner.close();
		    }
		


	}


