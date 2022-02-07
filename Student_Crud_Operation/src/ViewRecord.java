import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ViewRecord {

	
	public static void main (String[] args) {
		Connection conn = JdbcConnection.createConnection();
		
		
		ResultSet rset = null;
		
		try {
			Statement stmnt = conn.createStatement();
		
			rset = stmnt.executeQuery("SELECT* FROM student");
			while(rset.next()) {
				System.out.println(rset.getInt(1));
				System.out.println(rset.getString(2));
				System.out.println(rset.getString(3));
				System.out.println(rset.getString(4));
				
				

				System.out.println("=======================");
			}
		}
		catch (SQLException e ) {
			e.printStackTrace();
			
		}
	}
}