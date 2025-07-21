package module1;


	import java.util.Arrays;

	public class AnagramChecker {
	    public static void main(String[] args) {
	        String str1 = "listen";
	        String str2 = "silent";

	        if (isAnagram(str1, str2)) {
	            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
	        } else {
	            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are NOT anagrams.");
	        }
	    }

	    public static boolean isAnagram(String s1, String s2) {
	        // Remove spaces and convert to lowercase
	        s1 = s1.replaceAll("\\s", "").toLowerCase();
	        s2 = s2.replaceAll("\\s", "").toLowerCase();

	        // If lengths differ, not anagrams
	        if (s1.length() != s2.length()) {
	            return false;
	        }

	        // Convert to char arrays and sort
	        char[] arr1 = s1.toCharArray();
	        char[] arr2 = s2.toCharArray();
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);

	        // Compare sorted arrays
	        return Arrays.equals(arr1, arr2);
	    }
	}



