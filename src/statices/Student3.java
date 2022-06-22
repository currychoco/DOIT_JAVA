package statices;

public class Student3 {

	public static int serialNum = 1000;
	public static int cardNum;
	public int studentID;
	public String studentName;
	public int grade;
	public String address;

	public Student3() {
		serialNum++;
		studentID = serialNum;
		cardNum = serialNum + 100; 
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentNameString(String name) {
		studentName = name;
	}
	

}
