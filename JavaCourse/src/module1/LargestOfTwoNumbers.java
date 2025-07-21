package module1;
import java.util.Scanner;
public class LargestOfTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number1: ");
        int number1 = scanner.nextInt();
        
        System.out.print("Enter a number2: ");
        int number2 = scanner.nextInt();
        
        int largest ;
        if (number1>number2) 
        		System.out.println("The largest number is: " + number1);
        else
        	System.out.println("The largest number is:" +number2);
        scanner.close();

	}

}
