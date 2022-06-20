package chapter4;

public class BreakExample2 {

	public static void main(String[] args) {
		
		int sum = 0;
		int num;
		
		for(num = 0; ; num++) {
			sum += num;
			if(sum >= 100) {
				break;
			}
		}
		System.out.println("100이 넘는 번호" + num  + "합" + sum);
		
	}

}
