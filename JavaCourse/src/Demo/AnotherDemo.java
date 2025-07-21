package Demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class AnotherDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "Saimeghana@2004";

        try {
            // Load MySQL JDBC driver explicitly
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected!");

            // ... your DB code

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
