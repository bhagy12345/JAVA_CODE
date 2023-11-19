package Com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Createtable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement Statement=Connection.createStatement();
		Statement.execute("create table employee(id varchar(40),Name varchar(50),Salary int");
		Connection.close();
		System.out.println("TABLE CREATED SUCCEFULLY");
		}
	}
