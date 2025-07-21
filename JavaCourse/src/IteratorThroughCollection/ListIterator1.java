package IteratorThroughCollection;
import java.util.*;

public class ListIterator1 {
    public static void main(String[] args) {
        // Initial list
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("Original List: " + list);

        // Get ListIterator
        ListIterator<String> iterator = list.listIterator();

        // Forward traversal
        System.out.println("\nForward Traversal:");
        while (iterator.hasNext()) {
            System.out.println("Index: " + iterator.nextIndex() + " | Element: " + iterator.next());
        }

        // Backward traversal
        System.out.println("\nBackward Traversal:");
        while (iterator.hasPrevious()) {
            System.out.println("Index: " + iterator.previousIndex() + " | Element: " + iterator.previous());
        }

        // Add an element while iterating
        System.out.println("\nAdding 'Go' after 'Java':");
        iterator = list.listIterator(); // Reset iterator
        while (iterator.hasNext()) {
            if (iterator.next().equals("Java")) {
                iterator.add("Go"); // Adds after Java
                break;
            }
        }
        System.out.println("List after adding: " + list);

        // Modify an element
        System.out.println("\nModifying 'Python' to 'Python 3':");
        iterator = list.listIterator(); // Reset
        while (iterator.hasNext()) {
            String lang = iterator.next();
            if (lang.equals("Python")) {
                iterator.set("Python 3");
            }
        }
        System.out.println("List after modification: " + list);

        // Application: Remove elements containing '+'
        System.out.println("\nRemoving languages with '+':");
        iterator = list.listIterator();
        while (iterator.hasNext()) {
            String lang = iterator.next();
            if (lang.contains("+")) {
                iterator.remove(); // Safe removal
            }
        }
        System.out.println("Final List: " + list);
    }
}
