package statices;

public class StudentTest1 {

	public static void main(String[] args) {
		
		Student studentLee = new Student();
		studentLee.setStudentNameString("이지원");
		System.out.println(studentLee.serialNum);
		studentLee.serialNum++;
		
		Student studentSon = new Student();
		studentSon.setStudentNameString("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentLee.serialNum);
	
	}

}
