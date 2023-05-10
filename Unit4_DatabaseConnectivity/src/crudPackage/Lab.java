package crudPackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Lab {
	Statement statement;
	Connection con;
	ResultSet set;
	
	public Lab() throws ClassNotFoundException, SQLException
	{
		con=new Database().getcon();//reach at database
		statement = con.createStatement();
		String insert="INSERT INTO Labb_tbl VALUES('Zoro','Roronoa',985021885)";
		statement.executeUpdate(insert);
		set=statement.executeQuery("SELECT * FROM Labb_tbl");
		while(set.next()) {
			System.out.println("Student firstname:"+set.getString("FirstName"));
			System.out.println("Student lastname:"+set.getString("LastName"));
			System.out.println("Contact number:"+set.getInt("Contact"));
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new Lab();

	}

}
