package module1;

public class StringMethodsDemo {
    public static void main(String[] args) {
        String text = "Hello, welcome to Java programming!";

        // 1. length()
        System.out.println("Length of the string: " + text.length());

        // 2. substring()
        String sub = text.substring(7, 14);
        System.out.println("Substring (from index 7 to 14): " + sub);

        // 3. replace()
        String replaced = text.replace("Java", "Python");
        System.out.println("After replace: " + replaced);

        // 4. indexOf() (similar to find())
        int index = text.indexOf("Java");
        System.out.println("Index of 'Java': " + index);

        // 5. split()
        String[] words = text.split(" ");
        System.out.println("Split the string by spaces:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}



