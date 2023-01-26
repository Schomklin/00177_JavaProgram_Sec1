public class Date {
	private int dMonth; // variable to store the month
	private int dDay; // variable to store the day
	private int dYear; // variable to store the year

	// Default Constructor
	// The instance variables dMonth,dDay, and dYear are set to the default values.
	// Postcondition : dMonth = 1; dDay = 1; dYear = 1900;
	public Date() {
		dMonth = 1;
		dDay = 1;
		dYear = 1900;
	}

	// Constructor to set the date
	public Date(int month, int day, int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}

	// Method to set the date
	public void setDate(int month, int day, int year) {
		dMonth = month;
		dDay = day;
		dYear = year;
	}

	// Method to return the month
	public int getMonth() {
		return dMonth;
	}

	// Method to return the day
	public int getDay() {
		return dDay;
	}

	// Method to return the year
	public int gerYear() {
		return dYear;
	}

	// Method to return the date in the form mm-dd-yyyy
	public String toString() {
		return getMonth() + "-" + getDay() + "-" + gerYear();
	}

}
