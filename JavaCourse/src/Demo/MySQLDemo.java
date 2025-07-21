package Demo;

	//java -cp .:mysql-connector-java-9.3.0.jar MySQLDemo

import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;

	public class MySQLDemo {
		public static void main(String[] args) {
			String url = "jdbc:mysql://localhost:3306/testdb"; // DB name
			String user = "root"; // your mysql username
			String password = "Saimeghana@2004"; // your mysql password

			try {
				// Load MySQL JDBC driver (optional for JDBC 4+)
				Class.forName("com.mysql.cj.jdbc.Driver");//It’s a singl	e line, avoids confusion, and guarantees driver is loaded.

				// Connect
				Connection con = DriverManager.getConnection(url, user, password);
				System.out.println("Connection established!");
				
				// Insert example
				String insert = "INSERT INTO users (name, email) VALUES (?, ?)";
				PreparedStatement ps = con.prepareStatement(insert);
				ps.setString(1, "John Doe");
				ps.setString(2, "john@example.com");
				ps.executeUpdate();

				// Query example
				ResultSet rs = con.createStatement().executeQuery("SELECT * FROM users");
				while(rs.next()) {
					System.out.println(rs.getInt("id") + " " +
							rs.getString("name") + " " +
							rs.getString("email"));
				}

				// Close connection
				con.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}




