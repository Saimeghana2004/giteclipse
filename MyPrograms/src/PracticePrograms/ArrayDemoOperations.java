package PracticePrograms;

import java.util.Arrays;

public class ArrayDemoOperations {
	//finding minimum element in the array
	public static int findMin(int[] arr) {
        int min = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
        }
        return min;
    }
	
	//finding maximum element in the array
	public static int findMax(int[] arr) {
		int max=arr[4];
		for (int val : arr) {
			if (val > max ) max = val;
		}
		return max;
		
	}
	 //  Search for an element in the array
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1; // Not found
    }
    
   
   //sorting elements in the array 
    
    static int arrangeArray(int[] arr ) {
    	int[]copy=arr.clone();
    	Arrays.sort(copy);
		return copy[copy.length];
    	
    }
    
    // adding all the elements in the array
    
    
    public static int sum(int[] arr) {
        int total = 0;
        for (int val : arr) total += val;
        return total;
    }

	
	// main method

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {10,20,30,40,50};
		for(int i=0;i<=5;i++) {
			System.out.println(i);
			
			System.out.println("Min: " + findMin(arr));
	        System.out.println("Max: " + findMax(arr));

	        int index = search(arr, 3);
	        System.out.println("Element 3 found at index: " + index);
	        
	        
	       int[] copy = null;
		Arrays.sort(copy);
	        System.out.println("After Sorting:");
	        traverse(arr);



	        System.out.println("Sum: " + sum(arr));
	    }
			
		}

	private static void traverse(int[] arr) {
		// TODO Auto-generated method stub
		
	}
		
		

	}

