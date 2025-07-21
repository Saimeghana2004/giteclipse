package module1;
import java.util.Scanner;

public class PrimeNumberChecker{


	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Ask the user for a number
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        // Check if the number is prime
	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }

	        scanner.close();
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false; // 0 and 1 are not prime
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false; // divisible by another number
	            }
	        }
	        return true; // number is prime
	    }
}



