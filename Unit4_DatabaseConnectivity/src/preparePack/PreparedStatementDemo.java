package preparePack;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import crudPackage.Database;

public class PreparedStatementDemo {
	Connection con;
	PreparedStatement ps;
	ResultSet set;
	Statement statement;
	
	public PreparedStatementDemo() throws ClassNotFoundException, SQLException {
		Database db = new Database();
		con = db.getcon();
//	    String insert ="INSERT INTO Student_tbl VALUES(?,?);";	
//	    ps = con.prepareStatement(insert);
//        ps.setInt(1,4);
//	    ps.setString(2,"Ojasbi");
//	    ps.execute();
//	    
//	    ps = con.prepareStatement(insert);
//	    ps.setInt(1, 5);
//	    ps.setString(2,"Monkey D. Luffy");
//	    ps.execute();
	    
		String update = "UPDATE Student_tbl SET studentname=? WHERE id=?";
		ps = con.prepareStatement(update);
		ps.setString(1,"Sauwan Thapa");
		ps.setInt(2, 89);
		ps.executeUpdate();
		ps.close();

	    
	    String delete = "DELETE FROM Student_tbl where id=?";
	    ps = con.prepareStatement(delete);
	    ps.setInt(1, 5);
	    ps.execute();
	    

	    statement=con.createStatement();
	    set=statement.executeQuery("SELECT * FROM Student_tbl");
		while(set.next()) {
			System.out.println("Student id:"+set.getInt("id"));
			System.out.println("Student name:"+set.getString("studentname"));
		}
		
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	new PreparedStatementDemo();	
	}

}
