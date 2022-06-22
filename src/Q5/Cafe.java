package Q5;

public class Cafe {
	
	int money;
	String menu;
	
	public Cafe(String menu) {
		this.menu = menu;
	}
	
	public void take(int money) {
		this.money += money;
	}

	public void showInfo() {
		System.out.println(menu + "에 대한 카페의 수입은 " + money + "원입니다.");
	}

}
