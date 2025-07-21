
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

public class Aggregation2 {
    public static void main(String[] args) {
        Branches hs = new Branches("Health Science");
        Branches cs = new Branches("Computer Science");
        Branches arc = new Branches("Architecture");

        List<Branches> BranchList = new ArrayList<>();
        BranchList.add(hs);
        BranchList.add(cs);
        BranchList.add(arc);

        College clg = new College("My College", BranchList);

        clg.showBranches();  // or clg.showDepartments();
    }
}

class Branches {
    String name;

    Branches(String name) {
        this.name = name;
    }
}

class College {
    String clgName;
    List<Branches> Branches;

    College(String clgName, List<Branches> Branches) {
        this.clgName = clgName;
        this.Branches = Branches;
    }

    public void showBranches() {
        System.out.println("Branches in " + clgName + ":");
        for (Branches d : Branches) {
            System.out.println(d.name);
        }
    }
}
