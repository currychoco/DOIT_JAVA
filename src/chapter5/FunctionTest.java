package chapter5;

public class FunctionTest {
	
	public static void main(String[]args) {
		
		int num1 = 10;
		int num2 = 20;
		
		add(num1, num2);
		sub(num1, num2);
		mul(num1, num2);
		div(num1, num2);
	}
	public static void add(int n1, int n2) {
		int result = n1 + n2;
		System.out.println(n1 + "+" + n2 + "=" + result + "입니다.");
	}
	
	public static void sub(int n1, int n2) {
		int result = n1 - n2;
		System.out.println(n1 + "-" + n2 + "=" + result + "입니다.");
	}
	
	public static void mul(int n1, int n2) {
		int result = n1 * n2;
		System.out.println(n1 + "*" + n2 + "=" + result + "입니다.");
	}
	
	public static void div(int n1, int n2) {
		int result = n1 / n2;
		System.out.println(n1 + "/" + n2 + "=" + result + "입니다.");
	}
	
	
}
