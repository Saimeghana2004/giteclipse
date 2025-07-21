

/*
 * Objective: Demonstrate Encapsulation
 * Contents: Class: Bank Account And Bank App(contains main function)
 *   Bank Account contains Construnctor, getBalance(), Deposit(),Witdraw() and variable balance.
 * Example Taken: Bank App to perform Deposit, Withdraw and Check Balance
 * Objective Achieved using:
 * balance is declared private, so it cannot be accessed or modified directly from outside the class.
 * Access is provided through public methods (deposit(), withdraw(), and getBalance()), 
 * which control how the data is accessed or modified.
 * This protects the integrity of the data and allows validation logic (like checking for negative amounts).
 * 
 */
package ModuleOOPs;

// Base class Person
class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details — can be overridden
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Subclass Student extending Person
class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    // Overriding displayInfo
    @Override
    public void displayInfo() {
        System.out.println("Student Information:");
        super.displayInfo();
        System.out.println("Major: " + major);
    }
}

// Subclass Professor extending Person
class Professor extends Person {
    private String department;

    public Professor(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    // Overriding displayInfo
    @Override
    public void displayInfo() {
        System.out.println("Professor Information:");
        super.displayInfo();
        System.out.println("Department: " + department);
    }
}

// Main class to run the University Member System
public class UniversitySystem {
    public static void main(String[] args) {
        // Create objects
        Person student = new Student("Alice", 20, "Computer Science");
        Person professor = new Professor("Dr. Smith", 50, "Physics");

        // Display information
        student.displayInfo();
        System.out.println();
        professor.displayInfo();
    }
}




