package constructor;

public class Person {
	
	String name;
	float height;
	float weight;
	
	public Person () {
		System.out.println("기본 생성자");
	}
	
	public Person(String pname, float pheight, float pweight) {
		name = pname;
		height = pheight;
		weight = pweight;
		
		System.out.println(name + height + weight);
	}	

}
