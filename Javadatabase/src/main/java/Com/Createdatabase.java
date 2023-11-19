package Com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Createdatabase {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement Statement=Connection.createStatement();
		Statement.execute("create database employee");
		Connection.close();
		System.out.println("DATABASE CREATED SUCCEFULLY");
		}
	}
 