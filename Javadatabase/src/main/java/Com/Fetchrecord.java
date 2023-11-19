package Com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Fetchrecord {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
		Statement Statement=Connection.createStatement();
		ResultSet r=Statement.executeQuery("select * from employee");
		while(r.next())
{
	System.out.println(r.getString(1)+" "+r.getString(2)+" "+r.getInt(3));
	
}

		Connection.close();
		
   }
}

