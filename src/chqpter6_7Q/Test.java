package chqpter6_7Q;

public class Test {

	public static void main(String[] args) {
		CardCompany myCard1 = CardCompany.getInstance();
		CardCompany myCard2 = CardCompany.getInstance();
		CardCompany myCard3 = CardCompany.getInstance();
		
		System.out.println(myCard1 == myCard2);
		System.out.println(myCard2 == myCard3);

	}

}
