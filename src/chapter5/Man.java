package chapter5;

public class Man {
	
	int age;
	String name;
	boolean married;
	int son;

	public static void main(String[] args) {
		
		Man man1 = new Man();
		man1.age = 27;
		man1.name = "Jhon";
		man1.married = true;
		man1.son = 3;
		
		System.out.println(man1.age + " " + man1.name + " " + man1.married + " " + man1.son);

	}

}
