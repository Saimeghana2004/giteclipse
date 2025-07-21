package module1;

import java.util.Arrays;

public class LargestWithSorting {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 9, 3};
        Arrays.sort(arr);  // Sorts in ascending order

        int max = arr[arr.length - 1];  // Last element is the largest
        System.out.println("Largest (Sorting): " + max);
    }
}

