package PracticePrograms;

import java.util.Scanner;

public class OddEvenChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number;
		System.out.println("Enter a number:");
		number= sc.nextInt();
		if(number%2==0) {
			System.out.println(number + " " + "is even");
		}
		else {
			System.out.println(number + " " + "is odd");
			
		}
		sc.close();
			


	}

}
