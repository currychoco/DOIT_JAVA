package chapter4;

public class Q1 {

	public static void main(String[] args) {
		int num = 10;
		int num2 = 2;
		char operator = '*';
		
		switch (operator) {
		case '+' :
			System.out.println(num + "+" + num2 + "=" + (num + num2));
			break;
		case '-' :
			System.out.println(num + "-" + num2 + "=" + (num - num2));
			break;
		case '*' :
			System.out.println(num + "*" + num2 + "=" + (num * num2));
			break;
		case '/' :
			System.out.println(num + "/" + num2 + "=" + (num / num2));
			break;
		default:
			System.out.println("지원하지 않는 연산입니다.");
			break;
		}
		
		/*if(operator == '+') {
			System.out.println(num + "+" + num2 + "=" + (num + num2));
		}
		else if(operator == '-') {
			System.out.println(num + "-" + num2 + "=" + (num - num2));
		}
		else if(operator == '*') {
			System.out.println(num + "*" + num2 + "=" + (num * num2));
		}
		else if(operator == '/') {
			System.out.println(num + "/" + num2 + "=" + (num / num2));
		}
		else {
			System.out.println("지원하지 않는 연산입니다.");
		}*/
	}

}
