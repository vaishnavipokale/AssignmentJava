import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class DeleteRecord {

  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/student_db";
    String user = "root";
    String password = "";
    String sql = "delete from student where student_id=1";

    try (Connection conn = DriverManager.getConnection(url, user, password); 
        Statement stmt = conn.createStatement();) {
      
      stmt.executeUpdate(sql);
      System.out.println("Record deleted successfully");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}