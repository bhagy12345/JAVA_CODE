package CSE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Sample1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_details","root","root");
        Scanner sc=new Scanner(System.in);
        boolean f=true;
		while(f) 
		{
			System.out.println("1.Add Student\n2.Fetch\n3.Update\n4.Remove\n5.Fetch All\n6.Exit");
			System.out.println("Enter valid option");
		   switch (sc.nextInt()) {
		case 1:
		{
			PreparedStatement pt=Connection.prepareStatement("insert into student1 values(?,?,?,?,?)");
			System.out.println("Enter USN");
			pt.setString(1, sc.next());
			System.out.println("Enter Name");
			pt.setString(2, sc.next());
			System.out.println("Enter Phone Number");
			pt.setLong(3, sc.nextLong());
			System.out.println("Enter Branch");
			pt.setString(4, sc.next());
			System.out.println("Enter Per%");
			pt.setString(5, sc.next());
			int e=pt.executeUpdate();
			System.out.println(e + " Done");	
		}
		   case 2:{
			PreparedStatement pt=Connection.prepareStatement("select * feom student_details where usn=?");
			System.out.println("Enter USN");
			pt.setString(1, sc.next());
			ResultSet r=pt.executeQuery();
			while(r.next()) {
				System.out.println("USN : +r.getString(1)");
				System.out.println("Name : +r.getString(2)");
				System.out.println("Phone Number : +r.getString(3)");
				System.out.println("Branch : +r.getString(4)");
				System.out.println("Percentage : +r.getString(5)");
			}
		}
		break;
		   case 3:{
			   PreparedStatement pt=Connection.prepareStatement("update from student1 where usn=?");
				System.out.println("Enter USN");
				pt.setString(2, sc.next());
				System.out.println("Enter Name");
				pt.setString(1, sc.next());
				int e=pt.executeUpdate();
				System.out.println(e + " Done");	
		   }
		   break;
		   case 4:{
			   PreparedStatement pt=Connection.prepareStatement("update from student1 where usn=?");
				System.out.println("Enter USN");
				pt.setString(1, sc.next());
				int e=pt.executeUpdate();
				System.out.println(e + " Done");	 
		   }
		   break;
		   case 5:{
			   PreparedStatement pt=Connection.prepareStatement("select * from student1");
			   ResultSet r=pt.executeQuery();
				while(r.next()) {
					System.out.println("USN : +r.getString(1)");
					System.out.println("Name : +r.getString(2)");
					System.out.println("Phone Number : +r.getString(3)");
					System.out.println("Branch : +r.getString(4)");
					System.out.println("Percentage : +r.getString(5)"); 
					System.out.println("............................");
		   }
		   }
		   break;
		   case 6:{
			   f=false;
			   System.out.println("thank you ......");
		   }
		   break;
		   default:{
			   System.out.println("invalid  option....");
}
		   break;
		   }
		}
		Connection.close();
	}
}

		
