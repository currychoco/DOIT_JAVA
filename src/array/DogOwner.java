package array;

import java.util.ArrayList;

public class DogOwner {
	
	private String name;  //썼는데 왜 안 썼다고 구라침
	ArrayList<Dog> dogList;
	
	public DogOwner(String name) {
		this.name = name; //여기 썼잖아
		dogList = new ArrayList<Dog>(); //DogOwner객체가 생성될 때 ArrayList도 생성되게 해야함
	}
	
	public void addDog(String name, String type) {
		Dog dog = new Dog();
		dog.setName(name);
		dog.setType(type);
		dogList.add(dog);		
	}
	
	public void showInfo() {
		for(Dog dog : dogList) {
			System.out.println(dog.getName() + " ," + dog.getType());
		}
	}

}
