package week3.day1;

public class Students {
	int id;
	String name;
	String email;
	double phNo;
	public void studentInfo(int id) {
		this.id = id;
		System.out.println("Student Id: "+id);
	}
	public void studentInfo(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Student Id: "+id);
		System.out.println("Student Name: "+name);
	}
	public void studentInfo(String email, double phNo) {
		this.email = email;
		this.phNo = phNo;
		System.out.println("Student email: "+email);
		System.out.println("Student Phone Number: "+phNo);
	}
	public static void main(String[] args) {
	    Students students = new  Students();
	    students.studentInfo(1001);
	    students.studentInfo(1002, "Sunitha");
	    students.studentInfo("sdfds@sdfdsf.com", 1234567890);
	    
	}

}
