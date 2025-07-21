package module1;


	public class RemoveDuplicatesSortedArray {
	    public static int removeDuplicates(int[] arr) {
	        if (arr.length == 0) return 0;

	        int j = 0;  // Pointer for the unique elements

	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] != arr[j]) {
	                j++;
	                arr[j] = arr[i];
	            }
	        }

	        return j + 1;  // New length of array with unique elements
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
	        int newLength = removeDuplicates(arr);

	        System.out.print("Array after removing duplicates: ");
	        for (int i = 0; i < newLength; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}



