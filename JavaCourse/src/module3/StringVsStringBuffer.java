

/*
 * Objective:
 * Demonstrate the difference between String and StringBuffer in Java, focusing on mutability and string manipulation.
 *
 * Description:
 * This program illustrates how String and StringBuffer handle modifications differently.
 * Strings in Java are immutable—any modification creates a new object.
 * In contrast, StringBuffer is mutable, allowing changes to the same object with better performance for repeated modifications.
 *
 * Contents of the Program:
 * - Create and modify a String object using concatenation.
 * - Create and modify a StringBuffer object using append(), insert(), replace(), and reverse() methods.
 * - Print the state of the objects after each operation to observe behavior.
 *
 * How Achieved Using Concepts:
 * - Demonstrated immutability of String by modifying it through reassignment.
 * - Demonstrated mutability of StringBuffer by modifying it in-place using its methods.
 * - Used key StringBuffer methods (append, insert, replace, reverse) to show its flexibility.
 * - Reinforced the concept of memory and performance implications between String and StringBuffer.
 */



package module3;

public class StringVsStringBuffer {

	    public static void main(String[] args) {
	        
	        // ----------- Using String -----------
	        String str = "Hello";
	        System.out.println("Original String: " + str);
	        str = str + " World";
	        System.out.println("Modified String: " + str);
	        
	        // ----------- Using StringBuffer -----------
	        StringBuffer sb = new StringBuffer("Hello");
	        System.out.println("\nOriginal StringBuffer: " + sb);
	        sb.append(" World");
	        System.out.println("Modified StringBuffer: " + sb);
	        
	        // ----------- Additional StringBuffer Methods -----------
	        sb.insert(6, "Java ");     
	        System.out.println("After insert: " + sb);

	        sb.replace(6, 10, "C++");
	        System.out.println("After replace: " + sb);

	        sb.reverse();
	        System.out.println("After reverse: " + sb);
	    }
	}



