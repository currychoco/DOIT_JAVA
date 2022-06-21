package chapter5;

public class Student {
	private int studentID;
	private String studentName;
	private int grade;
	private String address;
	
	
	public int getStudentID() {
		return studentID;
	}



	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public int getGrade() {
		return grade;
	}



	public void setGrade(int grade) {
		if(grade <= 0) {
			System.out.println("0학년 이하는 없습니다. 자동으로 1학년으로 설정합니다.");
			grade = 1;
		} else {
			this.grade = grade;
		}
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName = "안연수";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}

}
