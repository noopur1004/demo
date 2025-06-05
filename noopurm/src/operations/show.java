package operations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class show {
	
	public static  void main(String[] args) throws Exception {
		
		Connection con= Main.GetConnection();
		Statement st = con.createStatement();
		ResultSet rs =st.executeQuery();
		
		con.close();
	}
}
