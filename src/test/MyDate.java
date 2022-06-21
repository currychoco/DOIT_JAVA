package test;

public class MyDate {

	private int day;
	private int month;
	private int year;

	private final String MSG_NOT_VALID = "유효하지 않은 날짜입니다";
	private final String MSG_VALID = "유효한 날짜입니다";

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String isValid() {

		if (month < 1 || month > 13) {
			return MSG_NOT_VALID;
		}

		else if (month == 2) {
			if (day < 1 || day > 28) {
				return MSG_NOT_VALID;
			} else {
				return MSG_VALID;
			}

		} else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {

			if (day < 1 || day > 31) {
				return MSG_NOT_VALID;
			} else {
				return MSG_VALID;
			}
		} else {
			if (day < 1 || day > 30) {
				return MSG_NOT_VALID;
			} else {
				return MSG_VALID;
			}
		}

	}

}
