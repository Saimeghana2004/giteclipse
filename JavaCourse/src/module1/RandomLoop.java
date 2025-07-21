package module1;
import java.util.Random;
public class RandomLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        Random rand = new Random();
		        int number = rand.nextInt(10); // generate the first random number

		        while (number != 0) {
		            System.out.println("Generated number: " + number);
		            number = rand.nextInt(10); // generate the next random number
		        }

		        // Print 0 after exiting the loop
		        System.out.println("Generated number: 0 (loop terminated)");
		    }
		


	}


