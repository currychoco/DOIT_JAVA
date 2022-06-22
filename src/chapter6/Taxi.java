package chapter6;

public class Taxi {
	
	String taxiNum;
	int money;
	
	public Taxi(String taxiNum) {
		this.taxiNum = taxiNum;
	}
	
	public void take(int money) {
		this.money += money;
	}
	public void showInfo() {
		System.out.println(taxiNum + "의 택시의 비용은 " + money + "원입니다.");
	}

}
