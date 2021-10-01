 package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConn {
	
	public static Connection getMySQLConnection()throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/S210315DB","root","@12345");
		return conn;
	}
}


