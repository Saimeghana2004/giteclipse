package module4;
import java.util.HashMap;
import java.util.Map;

public class StudentGrades {
    public static void main(String[] args) {
        // Create a Map to store student names and their grades
        Map<String, Integer> studentGrades = new HashMap<>();

        // Add entries to the Map
        studentGrades.put("Alice", 85);
        studentGrades.put("Bob", 92);
        studentGrades.put("Charlie", 78);
        studentGrades.put("Diana", 90);

        // Print all entries in the Map
        System.out.println("Student Grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Access a specific student's grade
        String student = "Bob";
        if (studentGrades.containsKey(student)) {
            System.out.println("\n" + student + "'s grade: " + studentGrades.get(student));
        } else {
            System.out.println("\nStudent not found.");
        }
    }
}




