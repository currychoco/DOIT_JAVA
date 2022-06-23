package array;

import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("James"));
		students.add(new Student("Tomas"));
		students.add(new Student("Edward"));
		
		for(Student student : students) {
			student.showInfo();
		}
	
	}

}
