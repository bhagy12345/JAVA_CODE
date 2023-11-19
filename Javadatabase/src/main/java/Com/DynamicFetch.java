package Com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicFetch {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		PreparedStatement pt=con.prepareStatement("Select * from employee where id=?");
		System.out.println("Enter id");
		pt.setString(1, sc.next());
		ResultSet e = pt.executeQuery();
		while(e.next())
		{
			System.out.println("id : "+e.getString(1));
			System.out.println("Name : "+e.getString(2));
			System.out.println("Salary : "+e.getInt(3));
		}
		con.close();
		System.out.println(e);
		}
}
