package chapter5;

public class Shop2 {

	public static void main(String[] args) {
		Shop cos1 = new Shop();
		
		cos1.num = "201803120001";
		cos1.id = "abc123";
		cos1.day = "2018년 3월 12일";
		cos1.num2 = "PD0345-12";
		cos1.address = "서울시 영등포구 여의도동 20번지";
		cos1.name = "홍길동";
		
		System.out.println("주문 번호 : " + cos1.num + "\n주문자 아이디 : " + cos1.id + 
				"\n주문 날짜 : " + cos1.day + "\n주문자 이름 : " + cos1.name + "\n주문 상품 번호 : " + cos1.num2 +
				"\n배송 주소 : " + cos1.address);
		
	
	}

}
