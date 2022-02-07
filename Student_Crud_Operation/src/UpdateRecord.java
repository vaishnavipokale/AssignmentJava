import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class UpdateRecord {

  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/student_db";
    String user = "root";
    String password = "";
    String sql = "update student set student_name='Samiksha' where student_id=10";

    try (Connection conn = DriverManager.getConnection(url, user, password); 
        Statement stmt = conn.createStatement();) {
      
      stmt.executeUpdate(sql);
      System.out.println("Database updated successfully ");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}