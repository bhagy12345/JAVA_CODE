package Com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Dynamicsdelete {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		PreparedStatement pt=con.prepareStatement("delete from employee where Name=?");
		System.out.println("Enter Name");
		pt.setString(1, sc.next());
		int e = pt.executeUpdate();
		con.close();
		System.out.println(e);
		}


}
