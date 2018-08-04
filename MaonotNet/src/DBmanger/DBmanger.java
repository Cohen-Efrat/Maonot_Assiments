package DBmanger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBmanger {
	static String connectionUrl = "jdbc:sqlserver://localhost;databaseName=Maonot_Net;integratedSecurity=true;" ;  
	static Connection con = null;  
	static Statement stmt = null;  
	static ResultSet rs = null; 

public void init() {

	try {  
		// Establish the connection.  
		System.out.println("Trying to set a connectio  to sql server...");
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
		con = DriverManager.getConnection(connectionUrl);  
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
		System.exit(0);
	} catch (SQLException e) {
		e.printStackTrace();
		System.exit(0);
	}
	System.out.println("connection was set!\n");
	}
	
	public  void close() {
		if (con != null) 
			try { 
				con.close(); 
			} catch(Exception e) {
				e.printStackTrace();
			}  
	}

}





