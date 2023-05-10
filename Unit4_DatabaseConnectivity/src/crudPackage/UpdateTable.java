package crudPackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTable {
	Statement statement;
	Connection con;
	ResultSet set;

	public UpdateTable() throws ClassNotFoundException, SQLException {
		
		con=new Database().getcon();//reach at database
		statement = con.createStatement();
		String update="UPDATE Student_tbl SET studentname='Roronoa zoro' where id=1;";
		statement.executeUpdate(update);
		set=statement.executeQuery("SELECT * FROM Student_tbl");
		while(set.next()) {
			System.out.println("Student id:"+set.getInt("id"));
			System.out.println("Student name:"+set.getString("studentname"));
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new UpdateTable();

	}

}
