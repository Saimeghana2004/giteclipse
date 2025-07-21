package module1;

public class LargestIterative {
	
	    public static void main(String[] args) {
	        int[] arr = {5, 2, 8, 1, 9, 3};
	        int max = arr[0];

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        System.out.println("Largest (Iterative): " + max);
	    }
	}



