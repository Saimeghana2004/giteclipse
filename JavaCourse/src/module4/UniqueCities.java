package module4;


	import java.util.HashSet;
	import java.util.Set;

	public class UniqueCities {
	    public static void main(String[] args) {
	        // Create a Set to store unique city names
	        Set<String> citiesVisited = new HashSet<>();

	        // Add cities to the Set (duplicates will be ignored)
	        citiesVisited.add("New York");
	        citiesVisited.add("Paris");
	        citiesVisited.add("Tokyo");
	        citiesVisited.add("New York"); // Duplicate
	        citiesVisited.add("Berlin");

	        // Display the cities
	        System.out.println("Cities visited:");
	        for (String city : citiesVisited) {
	            System.out.println(city);
	        }

	        // Check if a city was visited
	        String checkCity = "Paris";
	        if (citiesVisited.contains(checkCity)) {
	        	System.out.println("\nYes, " + checkCity + " was visited.");
	        } else {
	         
	        System.out.println("\nNo, " + checkCity + " was not visited.");
	        }
	    
	    }
	}
	