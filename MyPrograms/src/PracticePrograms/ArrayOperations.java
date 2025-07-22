package PracticePrograms;
public class ArrayOperations {

    // 1. Traverse (Print elements)
    public static void traverse(int[] arr) {
        System.out.print("Array: ");
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // 2. Insert element at specific index
    public static int[] insert(int[] arr, int element, int index) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < newArr.length; i++) {
            if (i == index) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[j++];
            }
        }
        return newArr;
    }

    // 3. Delete element at index
    public static int[] delete(int[] arr, int index) {
        if (index < 0 || index >= arr.length) return arr;
        int[] newArr = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                newArr[j++] = arr[i];
            }
        }
        return newArr;
    }

    // 4. Search for an element
    public static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) return i;
        }
        return -1; // Not found
    }

    // 5. Update an element at index
    public static void update(int[] arr, int index, int newValue) {
        if (index >= 0 && index < arr.length) {
            arr[index] = newValue;
        }
    }

    // 6. Sort the array
    public static void sort(int[] arr) {
        java.util.Arrays.sort(arr);
    }

    // 7. Find Minimum
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int val : arr) {
            if (val < min) min = val;
        }
        return min;
    }

    // 8. Find Maximum
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
        }
        return max;
    }

    // 9. Reverse the array
    public static void reverse(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // 10. Sum of all elements
    public static int sum(int[] arr) {
        int total = 0;
        for (int val : arr) total += val;
        return total;
    }

    // Main method to call all operations
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 1};

        traverse(arr);

        arr = insert(arr, 10, 2);
        System.out.println("After Insertion:");
        traverse(arr);

        arr = delete(arr, 1);
        System.out.println("After Deletion:");
        traverse(arr);

        int index = search(arr, 8);
        System.out.println("Element 8 found at index: " + index);

        update(arr, 0, 99);
        System.out.println("After Update:");
        traverse(arr);

        sort(arr);
        System.out.println("After Sorting:");
        traverse(arr);

        System.out.println("Min: " + findMin(arr));
        System.out.println("Max: " + findMax(arr));

        reverse(arr);
        System.out.println("After Reversing:");
        traverse(arr);

        System.out.println("Sum: " + sum(arr));
    }
}
