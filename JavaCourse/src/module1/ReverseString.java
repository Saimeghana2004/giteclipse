package module1;

public class ReverseString {
    public static void main(String[] args) {
        String original = "Hello World!";
        String reversed = "";

        // Using for loop to reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }
}



