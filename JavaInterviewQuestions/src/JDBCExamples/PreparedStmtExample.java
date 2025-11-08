package JDBCExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStmtExample {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/testdb";    
		String user = "root";
	    String pass = "root";

	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con = DriverManager.getConnection(url, user, pass);

	            String query = "INSERT INTO employees(name, age) VALUES(?, ?)";
	            PreparedStatement ps = con.prepareStatement(query);

	            ps.setString(1, "Murali");
	            ps.setInt(2, 28);

	            int rows = ps.executeUpdate();
	            System.out.println(rows + " record(s) inserted.");

	            con.close();
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	}

}
