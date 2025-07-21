package module1;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number1: ");
		int number1 = scanner.nextInt();

		System.out.println("Enter a number2: ");
		int number2 = scanner.nextInt();

		System.out.println("Enter a number3:");
		int number3 = scanner.nextInt();



		if(number1 >= number2 && number1 >= number3)
			System.out.println("The largest number is:" + number1);

		else if (number2 >= number1 && number2 >= number3)
			System.out.println("The largest number is:" +number2);

		else
			System.out.println("The largest number is" +number3);
		 scanner.close();
	}


}
