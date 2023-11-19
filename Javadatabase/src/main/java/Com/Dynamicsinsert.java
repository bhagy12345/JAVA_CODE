package Com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Dynamicsinsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		PreparedStatement pt=con.prepareStatement("insert into employee values(?,?,?)");
		System.out.println("Enter id");
		pt.setString(1, sc.next());
		System.out.println("Enter Name");
		pt.setString(2, sc.next());
		System.out.println("Enter Salary");
		pt.setInt(3, sc.nextInt());
		int e = pt.executeUpdate();
		con.close();
		System.out.println(e);
		}
	}
