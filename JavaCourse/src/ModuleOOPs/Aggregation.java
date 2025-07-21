
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

import java.util.ArrayList;
import java.util.List;


public class Aggregation {
	public static void main(String[] args) {
		Department cs = new Department("Computer Science");
		Department ee = new Department("Electrical Engineering");
		Department ec = new Department("Electronics Engineering");

		List<Department> deptList = new ArrayList<>();
		deptList.add(cs);
		deptList.add(ee);
		deptList.add(ec);

		University uni = new University("JNTU ", deptList);
		uni.showDepartments();

		// TODO: Create another university with different set of department list.
	}
}

class Department {
	String name;

	Department(String name) {
		this.name = name;
	}
}

class University {
	String uniName;
	List<Department> departments;  // Aggregation: University "has" Departments

	University(String uniName, List<Department> departments) {
		this.uniName = uniName;
		this.departments = departments;
	}
	void showDepartments() {
		System.out.println("Departments in " + uniName + ":");
		for (Department d : departments) {
			System.out.println(d.name);
		}
	}
}

	
