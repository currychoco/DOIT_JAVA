package object;

class Student{
	int studentID;
	String studentName;
	
	Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
	}
	
	public String toString() {
		return studentID + ", " + studentName;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
		Student std = (Student)obj;
		
			if(this.studentID == std.studentID) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
}
public class EqualsTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100, "이상원");
		
		if(studentLee == studentLee2) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		}
		else {
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		}
		
		if(studentLee.equals(studentLee2)) {
			System.out.println("studentLee와 studentLee2은 동일합니다.");
		}
		else {
			System.out.println("studentLee와 studentLee2은 동일하지 않습니다");
		}
		
		if(studentLee == studentSang) {
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		}
		else {
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		}
		
		if(studentLee.equals(studentSang)) {
			System.out.println("studentLee와 studentLee2은 동일합니다.");
		}
		else {
			System.out.println("studentLee와 studentLee2은 동일하지 않습니다");
		}

	}

}
