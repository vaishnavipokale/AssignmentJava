import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
	
	
	public static Connection createConnection() {
		String url = "jdbc:mysql://localhost:3306/student_db";
		String user = "root";
	    String password = "";
		//public static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";	
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(url,user,password);
			//System.out.println("record inserted successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			 
			 
		 }
		return connection;
		 
	
	 }
}



