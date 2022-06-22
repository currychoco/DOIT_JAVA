package Q5;

public class Person {

	String name;
	int money;
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public void takeCoffee(Cafe cafe) {
		cafe.take(4000);
		money -= 4000;
	}
	
	public void takeLatte(Cafe cafe) {
		cafe.take(4500);
		money -= 4500;
	}
}
