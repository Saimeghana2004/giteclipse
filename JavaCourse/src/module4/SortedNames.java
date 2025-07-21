package module4;


	import java.util.Set;
	import java.util.TreeSet;

	public class SortedNames {
	    public static void main(String[] args) {
	        // Create a TreeSet to store unique names in sorted order
	        Set<String> names = new TreeSet<>();

	        // Add names to the TreeSet
	        names.add("Zara");
	        names.add("Alice");
	        names.add("John");
	        names.add("Bob");
	        names.add("Alice"); // Duplicate, will be ignored

	        // Display the names in sorted order
	        System.out.println("Names in sorted order:");
	        for (String name : names) {
	            System.out.println(name);
	        }

	        // Check if a specific name is present
	        String searchName = "John";
	        if (names.contains(searchName)) {
	            System.out.println("\n" + searchName + " is in the set.");
	        } else {
	            System.out.println("\n" + searchName + " is not in the set.");
	        }
	    }
	}



