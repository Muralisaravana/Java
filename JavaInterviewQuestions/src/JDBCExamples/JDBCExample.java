package JDBCExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/testdb";  // DB URL
        String user = "root";      // Username
        String pass = "root";      // Password
        
        try {
            // 1. Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create a connection
            Connection con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected successfully!");

            // 3. Create a statement
            Statement stmt = con.createStatement();

            // 4. Execute a query
            ResultSet rs = stmt.executeQuery("SELECT * FROM employees");

            // 5. Process the result
            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " + rs.getString("name"));
            }

            // 6. Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

	}

}
