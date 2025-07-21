package IteratorThroughCollection;

class Student implements Cloneable {
    int id;
    String name;
    int DOB;
    String Res_Address;
    String Per_Address;

    public Student(int id, String name, int DOB, String Res_Address, String Per_Address) {
        this.id = id;
        this.name = name;
        this.DOB = DOB;
        this.Res_Address = Res_Address;
        this.Per_Address = Per_Address;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", DOB=" + DOB +
               ", Res_Address=" + Res_Address + ", Per_Address=" + Per_Address + "]";
    }

	public void printDetails() {
		// TODO Auto-generated method stub
		
	}
}

public class CloneDemo {
    public static void main(String[] args) {// throws CloneNotSupportedException {
        try {
            Student s1 = new Student(101, "raju", 8734, "hyderabad", "hyderabad");
            Student s2 = (Student) s1.clone();

            System.out.println("Original: " + s1);
            System.out.println("Cloned: " + s2);
       } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
