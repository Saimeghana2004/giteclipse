package module3;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        // 1. ArithmeticException
        try {
            int result = 10 / 0; // Division by zero
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

        // 2. NullPointerException
        try {
            String str = null;
            System.out.println(str.length()); // Accessing method on null
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }

        // 3. ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]); // Invalid index
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }

        // 4. NumberFormatException
        try {
            String invalidNumber = "abc";
            int num = Integer.parseInt(invalidNumber); // Invalid number string
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }

        // 5. IllegalArgumentException
        try {
            printAge(-5); // Negative age is not allowed
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }

        // 6. ClassCastException
        try {
            Object obj = "This is a string";
            Integer num = (Integer) obj; // Invalid cast
        } catch (ClassCastException e) {
            System.out.println("Caught ClassCastException: " + e.getMessage());
        }
    }

    // Method that throws IllegalArgumentException
    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative!");
        } else {
            System.out.println("Age is: " + age);
        }
    }
}



