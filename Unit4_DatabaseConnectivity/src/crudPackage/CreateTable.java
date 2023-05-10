package crudPackage;


import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateTable {
	Statement statement;
	Connection con;

	public CreateTable() throws ClassNotFoundException, SQLException {
		
		con=new Database().getcon();
		statement = con.createStatement();
		String create ="CREATE TABLE Student_tbl("+"id int,studentname varchar(100)"+");";
		statement.executeUpdate(create);
		System.out.println("Table created");
		
	}
public static void main(String []args) throws ClassNotFoundException, SQLException
{
	new CreateTable();
	}
}
