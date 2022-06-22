package Q5;

public class Test {

	public static void main(String[] args) {
		Person kim = new Person("김씨", 20000);
		Person lee = new Person("이씨", 15000);
		
		Cafe cafe1 = new Cafe("아이스아메리카노");
		Cafe cafe2 = new Cafe("카페라떼");
		
		kim.takeCoffee(cafe1);
		lee.takeLatte(cafe2);
		
		cafe1.showInfo();
		cafe2.showInfo();

	}

}
