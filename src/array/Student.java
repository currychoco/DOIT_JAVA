package array;

public class Student {

	private static int serialNum = 1000;
	private int studentID;
	private String name;
	
	public Student() {}
	
	public Student(String name) {
		serialNum++;
		
		studentID = serialNum;
		this.name = name;
	}
	
	public void showInfo() {
		System.out.println(studentID + ", " + name);
	}
}
