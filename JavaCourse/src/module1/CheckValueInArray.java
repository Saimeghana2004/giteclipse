package module1;

public class CheckValueInArray {
	
	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 30, 40, 50};
	        int valueToFind = 30;
	        
	        boolean found = false;

	        for (int number : numbers) {
	            if (number == valueToFind) {
	                found = true;
	                break;
	            }
	        }

	        if (found) {
	            System.out.println(valueToFind + " is present in the array.");
	        } else {
	            System.out.println(valueToFind + " is not present in the array.");
	        }
	    }
	}



