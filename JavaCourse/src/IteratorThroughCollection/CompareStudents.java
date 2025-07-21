package IteratorThroughCollection;

class P_Address {
    int houseNumber;
    String name;
    String streetName;
    String area;
    String district;
    String city;
    String state;
    int pincode;

    public P_Address(int houseNumber, String name, String streetName, String area,
                     String district, String city, String state, int pincode) {
        this.houseNumber = houseNumber;
        this.name = name;
        this.streetName = streetName;
        this.area = area;
        this.district = district;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
}

// Now we make P_Student a concrete class (not abstract)
class P_Student implements Comparable<P_Student> {
    int id;
    String dob;
    P_Address resAddress;
    P_Address permAddress;

    public P_Student(int id, String dob, P_Address resAddress, P_Address permAddress) {
        this.id = id;
        this.dob = dob;
        this.resAddress = resAddress;
        this.permAddress = permAddress;
    }

    @Override
    public int compareTo(P_Student student2) {
        // First compare by ID
        if (this.id != student2.id) {
            return Integer.compare(this.id, student2.id);
        }

        // Then compare by city from resAddress
        return this.resAddress.city.compareTo(student2.resAddress.city);
    }

    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("DOB: " + dob);
        System.out.println("City: " + resAddress.city);
        System.out.println("------------------------");
    }
}

public class CompareStudents {
    public static void main(String[] args) {
        P_Address addr1 = new P_Address(101, "John", "Street A", "Area1", "Dist1", "Hyderabad", "Telangana", 10000);
        P_Address addr2 = new P_Address(102, "Alex", "Street B", "Area2", "Dist2", "Hyderabad", "Telangana", 10000);

        P_Student student1 = new P_Student(101, "1998-06-21", addr1, addr1);
        P_Student student2 = new P_Student(102, "1999-08-15", addr2, addr2);

        student1.printDetails();
        student2.printDetails();

        int comparison = student1.compareTo(student2);

        
            System.out.println("Both students are compared and equal"+comparison);
        }
   }

