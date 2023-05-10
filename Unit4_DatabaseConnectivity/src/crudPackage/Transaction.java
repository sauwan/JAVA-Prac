package crudPackage;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction   {
	Statement statement;
	Connection con;
	ResultSet set;
	
	public Transaction() throws ClassNotFoundException, SQLException
	{
		System.out.println("Name:Sauwan Thapa\nLab no:23\n");
		con = new Database().getcon();
		statement = con.createStatement();
		con.setAutoCommit(false); 
		
		String s1="UPDATE Ram_tbl SET Balance=Balance-1000  WHERE Acc_Name='Ram'"; 
		String s2="UPDATE Ram_tbl SET Balance=Balance+1000  WHERE Acc_Name='Hari'"; 
		
		statement.executeUpdate(s1); 
		statement.executeUpdate(s2);
		con.commit();
		
		set = statement.executeQuery("SELECT * FROM Ram_tbl");
		while (set.next()) {
			System.out.println("Account id:" +set.getInt("id"));
			System.out.println("Account Name:" +set.getString("Acc_Name"));
			System.out.println("Account Balance:" +set.getBigDecimal("Balance"));
		}
	}

	
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException   {
       new Transaction();		

	}

}
