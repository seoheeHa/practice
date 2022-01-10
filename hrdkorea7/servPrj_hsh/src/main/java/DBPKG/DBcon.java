package DBPKG;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBcon {

	public static Connection getConnection() throws Exception{
		
		Connection conn =null;
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe", "system", "oracle");
		
		return conn;
	}
}
