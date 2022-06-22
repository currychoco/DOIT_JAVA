package statices;

public class Student {

	public static int serialNum = 1000;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentNameString(String name) {
		studentName = name;
	}
}
