package inheritance;

public class Customer {
	
	protected int customerID;
	protected String customeraName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade= "SILVER";
		bonusRatio = 0.01;
		System.out.println("Customer() 생성자 호출");
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customeraName = customerName;
		customerGrade= "SILVER";
		bonusRatio = 0.01;
		//System.out.println("Customer() 생성자 호출");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customeraName + "님의 등급은 " + customerGrade + "이며, 보너스 포인트는 " + bonusPoint + "입니다.";
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(int customerID) {
		this.customerID = customerID;		
	}
	
	public String getCustomerName() {
		return customeraName;
	}
	
	public void setCustomerName(String customerName) {
		this.customeraName = customerName;
	}
	
	public String getCustomerGrade() {
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
}
