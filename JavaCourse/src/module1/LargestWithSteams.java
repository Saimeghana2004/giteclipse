package module1;

import java.util.Arrays;

public class LargestWithSteams {
	
	public static void main(String[] args) {
	        int[] arr = {5, 2, 8, 1, 9, 3};
	        int max = Arrays.stream(arr).max().getAsInt();

	        System.out.println("Largest (Stream): " + max);
	    
	}


}
