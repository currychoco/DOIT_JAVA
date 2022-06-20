package chapter4;

public class Q2 {

	public static void main(String[] args) {
		int num;
		int dan;
		for(dan = 2; dan <= 9; dan++) {
			if(dan % 2 != 0) {
				continue;
			}
			for(num = 1; num <= 9 ; num++) {
				System.out.println(dan + "*" + num + "=" + (dan * num));
			}
			System.out.println();
		}

	}

}
