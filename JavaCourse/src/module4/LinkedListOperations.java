package module4;

public class LinkedListOperations {// Node class representing each element of the LinkedList
	class Node {
	    int data;
	    Node next;

	    public Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	// LinkedList class with basic operations
	public class LinkedList {
	    private Node head;

	    // Add node at the end
	    public void add(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            return;
	        }

	        Node current = head;
	        while (current.next != null) {
	            current = current.next;
	        }
	        current.next = newNode;
	    }

	    // Remove node by value
	    public boolean remove(int data) {
	        Node current = head;
	        Node previous = null;

	        while (current != null) {
	            if (current.data == data) {
	                if (previous == null) {
	                    head = current.next;  // Removed head
	                } else {
	                    previous.next = current.next;  // Removed middle or last
	                }
	                return true;
	            }
	            previous = current;
	            current = current.next;
	        }
	        return false;  // Not found
	    }

	    // Search for a node by value
	    public boolean search(int data) {
	        Node current = head;
	        while (current != null) {
	            if (current.data == data) {
	                return true;
	            }
	            current = current.next;
	        }
	        return false;
	    }

	    // Display the list (iterate)
	    public void display() {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data + " -> ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }

	    // Main method to test the LinkedList
	    public void main(String[] args) {
	        LinkedList ll = new LinkedList();

	        // Adding nodes
	        ll.add(10);
	        ll.add(20);
	        ll.add(30);

	        System.out.println("Linked List:");
	        ll.display();

	        // Searching
	        System.out.println("Search 20: " + ll.search(20));
	        System.out.println("Search 40: " + ll.search(40));

	        // Removing
	        System.out.println("Remove 20: " + ll.remove(20));
	        System.out.println("After removal:");
	        ll.display();

	        // Iteration via display
	        System.out.println("Iterating the list:");
	        ll.display();
	    }
	}
}
