package module3;

public class CrashDemo {
    public static void main(String[] args) {
        System.out.println("Inside main...");
        int[] values = {1, 2, 3, 4};
        System.out.println("Invoking method1...");
        method1(values);
        System.out.println("*** Back in main ***");
    }

    public static void method1(int[] x) {
        System.out.println("\nInside method1...");
        try {
            method2(x);  // This may throw an exception
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception in method1: " + e.getMessage());
        }
        System.out.println("*** Back in method1 ***");
    }

    public static void method2(int[] y) {
        System.out.println("\nInside method2...");
        System.out.println(y[5]); // Invalid index access
        System.out.println("*** Leaving method2 ***");
    }
}
