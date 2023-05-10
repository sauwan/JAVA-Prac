package crudPackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTable {
	Statement statement;
	Connection con;
	ResultSet set;

	public InsertTable() throws ClassNotFoundException, SQLException {
		
		con=new Database().getcon();//reach at database
		statement = con.createStatement();
		String insert="INSERT INTO Student_tbl VALUES(3,'Monkey D. Garp')";
		statement.executeUpdate(insert);
		set=statement.executeQuery("SELECT * FROM Student_tbl");
		while(set.next()) {
			System.out.println("Student id:"+set.getInt("id"));
			System.out.println("Student name:"+set.getString("studentname"));
		}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		new InsertTable();
	}

}
