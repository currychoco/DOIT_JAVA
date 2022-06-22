package chqpter6_7Q;

public class CardCompany {
	
	private static CardCompany instance = new CardCompany();
	private CardCompany() {}
	
	public static CardCompany getInstance() {
		if(instance == null) {
			instance = new CardCompany();
		}
		return instance;
	}
}
