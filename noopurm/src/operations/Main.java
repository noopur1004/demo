package operations;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
	
	static Connection GetConnection() throws Exception {
		Connection con = null;
		
		Class.forName(null);
		
		con=DriverManager.getConnection(null, null, null);
		
		return con;
				
	}
}
