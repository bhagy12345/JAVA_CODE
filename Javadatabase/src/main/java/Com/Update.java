package Com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement Statement=Connection.createStatement();
		Statement.executeUpdate("Update employee set Name='Shree' where id='4'");
		Connection.close();
		System.out.println("UPDATED SUCCEFULLY");
}
}
