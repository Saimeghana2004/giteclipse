

/*
 * Objective:
 * To determine whether a person is eligible to vote using conditional logic (ternary operator).
 *
 * Description:
 * This program prompts the user to enter their age. It then checks if the age is 18 or above using a ternary operator.
 * Based on the input, it outputs whether the person is eligible to vote or not.
 *
 * Contents of the Program:
 * - Importing Scanner for user input
 * - Reading age input from the user
 * - Using the ternary operator to evaluate voting eligibility
 * - Displaying the result to the user
 *
 * How Achieved Using Concepts:
 * - Utilized the Scanner class for reading input from the user.
 * - Applied the ternary operator (? :) for decision-making in a concise manner.
 * - Demonstrated basic conditional logic and user interaction in Java.
 */
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        
        String result = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(result);
        
        sc.close();
    }
}
