package module1;
import java.util.Scanner;
public class SimpleInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter principal amount: ");
		        double principal = scanner.nextDouble();

		        System.out.print("Enter rate of interest (per year, as a decimal): ");
		        double rate = scanner.nextDouble();

		        System.out.print("Enter time (in years): ");
		        double time = scanner.nextDouble();

		        double simpleInterest = (principal * rate * time);

		        System.out.println("Simple interest: " + simpleInterest);

		        scanner.close();
		    }
		

	}


