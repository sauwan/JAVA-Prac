package crudPackage;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class Database {	
	Connection con;
	public Database() throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String server = "//DESKTOP-1EGLGBH";
		int port = 1433;
		String database="Ambition_db";
		String connectionStr = "jdbc:sqlserver:"+server+":"+port+";databaseName="+database+";integratedSecurity=true; encrypt = true;trustServerCertificate=true";
		con = DriverManager.getConnection(connectionStr);
		System.out.println("Connection Established");
		
		
	}
public Connection getcon()
{
	return con;
	}
public Connection getConnectionn() {
	// TODO Auto-generated method stub
	return con;
}
}
