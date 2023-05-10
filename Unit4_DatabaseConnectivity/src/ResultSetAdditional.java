import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import crudPackage.Database;



public class ResultSetAdditional {

	Connection con;
	ResultSet set;
	Statement statement;
	
	public ResultSetAdditional() throws ClassNotFoundException, SQLException {
		con= new Database().getConnectionn();
		statement = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		set= statement.executeQuery("SELECT * FROM student_tbl");
		set.absolute(2);//it moves to the second row data
		set.updateString("studentname","Sauwan Thapa");//second row
		set.updateRow();//execute the updation
		set.last();
		set.deleteRow();
		
		
		set=statement.executeQuery("SELECT * FROM Student_tbl");
		while(set.next()) {
			System.out.println("Student id:"+set.getInt("id"));
			System.out.println("Student name:"+set.getString("studentname"));
	}
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	new	ResultSetAdditional();
	}
	
}
