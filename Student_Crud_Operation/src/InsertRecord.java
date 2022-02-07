
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class InsertRecord {

	public static void main(String[] args) {
	Connection conn =  JdbcConnection.createConnection();
		
		
		Student stu = new Student().addstud();
		try {
			PreparedStatement pre_stmnt = conn.prepareStatement("insert into student(student_id, student_name,student_course,student_address) values(?,?,?,?)");
			 pre_stmnt.setInt(1,stu.getstudent_id());
			 pre_stmnt.setString(2,stu.getstudent_name());
			 pre_stmnt.setString(3,stu.getstudent_course());
			 pre_stmnt.setString(4,stu.getstudent_address());
			 
			 //pre_stmnt.setInt(4, emp.getDept().getDept_id());
			 
			  pre_stmnt.execute();
			 System.out.println("Record inserted succesfully");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
