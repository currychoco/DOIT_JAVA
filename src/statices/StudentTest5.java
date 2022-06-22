package statices;

public class StudentTest5 {

	public static void main(String[] args) {
		Student3 studentLee = new Student3();
		studentLee.setStudentNameString("이지원");
		System.out.println(Student3.serialNum);
		System.out.println(studentLee.studentName + " 학번: " + studentLee.studentID + "카드번호 : " + Student3.cardNum);
		
		Student3 studentSon = new Student3();
		studentSon.setStudentNameString("손수경");
		System.out.println(Student3.serialNum);
		System.out.println(studentSon.studentName + " 학번: " + studentSon.studentID+ "카드번호 : " + Student3.cardNum);

	}

}
