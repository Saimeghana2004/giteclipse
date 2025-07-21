package module1;


	public class VowelConsonantCounter {
	    public static void main(String[] args) {
	        String input = "Hello World";
	        int vowels = 0, consonants = 0;

	        input = input.toLowerCase();  // Convert to lowercase for easier comparison

	        for (char ch : input.toCharArray()) {
	            if (Character.isLetter(ch)) {
	                if (isVowel(ch)) {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            }
	        }

	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	    }

	    public static boolean isVowel(char ch) {
	        return "aeiou".indexOf(ch) != -1;
	    }
	}



