/*
 * Objective:
 * Demonstrate the use of the Ternary Operator in Java for conditional logic.
 *
 * Description:
 * This program evaluates a student's marks and assigns a corresponding grade using nested ternary operators.
 * Based on the marks, the program outputs the grade (A+, A, B, C, or Fail).
 *
 * Contents of the Program:
 * - Declaration and initialization of an integer variable `marks`
 * - Usage of nested ternary operators to determine the grade
 * - Output of the final grade using System.out.println
 *
 * How Achieved using Concepts:
 * - The ternary operator `? :` is used as a concise alternative to if-else statements.
 * - It evaluates multiple conditions in a nested format to determine the appropriate grade.
 * - This improves code readability and demonstrates decision-making in Java.
 * - The concept of conditional expressions is applied to return one of several grade options based on the value of `marks`.
 */


package module3;

public class TernaryOperator {
    public static void main(String[] args) {
        int marks = 76;

        String grade = (marks >= 90) ? "A+" :
                       (marks >= 75) ? "A" :
                       (marks >= 60) ? "B" :
                       (marks >= 50) ? "C" : "Fail";

        System.out.println("Grade: " + grade);
    }
}
