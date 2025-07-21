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

public class AssociationExample {

    public static void main(String[] args) {
        Author a = new Author("J.K. Rowling");
        Publisher c = new Publisher("Bloomsbury");
        Book b = new Book("Harry Potter", a, c);
        b.printDetails();
    }
}

class Author {
    String name;

    Author(String name) {
        this.name = name;
    }
}

class Publisher {
    String name;

    Publisher(String name) {
        this.name = name;
    }
}

class Book {
    String title;
    Author author; 
    Publisher publisher;

    Book(String title, Author author, Publisher publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    void printDetails() {
        System.out.println(title + " written by " + author.name + " published by " + publisher.name);
    }
}
