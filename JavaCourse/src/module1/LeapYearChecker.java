package module1;

	import java.util.Scanner;

	public class LeapYearChecker {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a 4-digit year: ");
	        String input = scanner.nextLine();

	        // Check if the input is a 4-digit number
	        if (input.matches("\\d{4}")) {
	            int year = Integer.parseInt(input);

	            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	                System.out.println(year + " is a leap year.");
	            } else {
	                System.out.println(year + " is not a leap year.");
	            }
	        } else {
	            System.out.println("Invalid Input.");
	        }

	        scanner.close();
	    }
	}

	

