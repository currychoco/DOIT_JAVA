package chqpter6_6Q;

public class Card {

	static int serialNum = 10000;
	int num;
	
	public Card() {
		serialNum++;
		num = serialNum;
	}	
}
