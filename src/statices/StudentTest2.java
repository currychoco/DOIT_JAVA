package statices;

public class StudentTest2 {

	public static void main(String[] args) {
		Student1 studentLee = new Student1();
		studentLee.setStudentNameString("이지원");
		System.out.println(studentLee.serialNum);
		System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID);
		
		Student1 studentSon = new Student1();
		studentSon.setStudentNameString("손수경");
		System.out.println(studentSon.serialNum);
		System.out.println(studentSon.studentName + " 학번: " + studentSon.studentID);

	}

}
