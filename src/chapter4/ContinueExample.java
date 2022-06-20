package chapter4;

public class ContinueExample {

	public static void main(String[] args) {
		int num = 0;
		int i;
		
		for(i = 1; i<=100; i++) {
			if(i % 2 == 0) {
				continue;
			}
			num += i;
		}
		
		
		/*for(i = 1; i<=100; i+=2) {
			num += i;
		}*/
		System.out.println("1부터 100까지의 홀수의 합은 " + num + "입니다.");

	}

}
