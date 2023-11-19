package CSE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Table {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_details","root","root");
		Statement Statement=Connection.createStatement();
		Statement.execute("Create table student1(usn varchar(10),name varchar(50),Phone_number bigint,branch varchar(50),Per varchar(10))");
		Connection.close();
		System.out.println("TABLE CREATED SUCCEFULLY");


}
}
