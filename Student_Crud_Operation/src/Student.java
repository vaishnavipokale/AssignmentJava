import java.util.Scanner;

public class Student {
   int student_id;
   String student_name;
   String student_course;
   String student_address;
   
  
   
public int getstudent_id() {
	return student_id;
}
public void setstudent_id(int student_id) {
	this.student_id = student_id;
}
public String getstudent_name() {
	return student_name;
}
public void setstudent_name(String student_name) {
	this.student_name = student_name;
}
public String getstudent_course() {
	return student_course;
}
public void setstudent_course(String student_course) {
	this.student_course = student_course;
}
public String getstudent_address() {
	return student_address;
}
public void setstudent_address(String student_address) {
	this.student_address = student_address;
}


@Override
public String toString() {
	return "Student [student_id=" + student_id + ", student_name=" + student_name + ",student_course="+student_course+",student_address="+student_address+" ]";
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int student_id, String student_name,String student_course,String student_address ) {
	super();
	this.student_id = student_id;
	this.student_name = student_name;
	this.student_course = student_course;
	this.student_address = student_address;
	
	//this.dept = dept;
}
  
Student addstud() {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter student_id");
	int student_id = scanner.nextInt();
	System.out.println("enter student name");
	String student_name = scanner.next();
	System.out.println("enter student course");
	String student_course = scanner.next();
	System.out.println("enter student address");
	String student_address = scanner.next();
	
    scanner.close();    
	return new Student(student_id,student_name, student_course,student_address);
	
	
}
   
   
}
