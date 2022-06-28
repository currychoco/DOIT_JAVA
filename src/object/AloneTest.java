package object;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate myd = (MyDate)obj;
			if((this.day == myd.day) && (this.month == myd.month) && (this.year == myd.year)) {
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
	
		return day * 10 + month * 101 + year * 102;
	}
}

public class AloneTest {

	public static void main(String[] args) {
		
		MyDate myd1 = new MyDate(27, 6, 2022);
		MyDate myd2 = new MyDate(27, 6, 2022);
		MyDate myd3 = new MyDate(27, 6, 2024);
		
		System.out.println(myd1.equals(myd2));
		System.out.println(myd1.equals(myd3));
		
		System.out.println(myd1.hashCode());
		System.out.println(myd2.hashCode());
		System.out.println(myd3.hashCode());

	}

}
