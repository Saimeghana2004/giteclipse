package module1;
import java.util.Scanner;
public class PalindromeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scanner = new Scanner(System.in);

		        // Ask the user for input (word or number)
		        System.out.print("Enter a word or number: ");
		        String input = scanner.nextLine();

		        // Check if the input is a palindrome
		        if (isPalindrome(input)) {
		            System.out.println(input + " is a palindrome.");
		        } else {
		            System.out.println(input + " is not a palindrome.");
		        }

		        scanner.close();
		    }

		    // Method to check if a string is a palindrome
		    public static boolean isPalindrome(String input) {
		        String reversed = new StringBuilder(input).reverse().toString();
		        return input.equals(reversed);
		    }
		


	}


