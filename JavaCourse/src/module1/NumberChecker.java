package module1;

import java.util.Scanner;

public class NumberChecker {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();


		if (number >= 0) 
			System.out.println(number + " is positive.");
		else 
			System.out.println(number + " is negative.");
		scanner.close();

	}


}


