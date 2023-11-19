package Com;

    import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class Insert {

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection Connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root");
			Statement Statement=Connection.createStatement();
			Statement.execute("Insert into employee values('Sg20Cse','Ankuu',3000)");
			Connection.close();
			System.out.println("DATABASE INSERTED SUCCEFULLY");
	}

}
