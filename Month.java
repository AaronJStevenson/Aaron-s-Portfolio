
public class Month {

	int monthNum; // the number designated for a certain month
	
	public Month() {
		monthNum = 1;
	}

	// if month is less than 1 or greater than 12 it will throw an exception
	public Month(int monthNum) throws NotValidMonth {
		
		this.monthNum = monthNum;
		if(monthNum < 1 || monthNum > 12){
			throw new NotValidMonth();
		}
	}
	// stating that for monthnum is equal to month num to set the name of month
	public Month(Month month){
		this.monthNum = month.monthNum; 
	}
	
	// switch statement for the month name 
	public Month(String name) throws NotValidMonth{
		
			switch(name){
		case("January"):
		case("january"):
			this.monthNum = 1;
			break;
		case("February"):
		case("february"):
			this.monthNum = 2;
			break;
		case("March"):
		case("march"):
			this.monthNum = 3;
			break;
		case("April"):
		case("april"):
			this.monthNum = 4;
			break;
		case("May"):
		case("may"):
			this.monthNum = 5;
			break;
		case("June"):
		case("june"):
			this.monthNum = 6;
			break;
		case("July"):
		case("july"):
			this.monthNum = 7;
			break;
		case("August"):
		case("august"):
			this.monthNum = 8;
			break;
		case("September"):
		case("september"):
			this.monthNum = 9;
			break;
		case("October"):
		case("october"):
			this.monthNum = 10;
			break;
		case("November"):
		case("november"):
			this.monthNum = 11;
			break;
		case("December"):
		case("december"):
			this.monthNum = 12;
			break;
		default:
			throw new NotValidMonth();
			
		}
	}

	// getters and setters
	public int getMonthNumber() {
		return monthNum; // returning the monthNum
	}

	// setting the month num
	public void setMonthNumber(int monthNum) {
		
		this.monthNum = monthNum;
		if(this.monthNum < 1 || this.monthNum > 12){
			this.monthNum = 1;
		}
	}
	
	public String getMonthName(){
		
		String name = "";
		switch(this.monthNum){
		case(1):
			name = "January";
		break;
		case(2):
			name = "February";
		break;
		case(3):
			name = "March";
		break;
		case(4):
			name = "April";
		break;
		case(5):
			name = "May";
		break;
		case(6):
			name = "June";
		break;
		case(7):
			name = "July";
		break;
		case(8):
			name = "August";
		break;
		case(9):
			name = "September";
		break;
		case(10):
			name = "October";
		break;
		case(11):
			name = "November";
		break;
		case(12):
			name = "Deecember";
		break;
		}
		return name;
	}
	
	// to string method
	public String toString(){
		
		String outString;
		outString = "" + this.getMonthName();
		
		return outString;
	}
	// equals method 
	public boolean equals(Month month){
		
		boolean isEqual = false;
		if(this.monthNum == month.monthNum){
			isEqual = true;
		}
		return isEqual;
	}
	// greater than method to decipher if month number is greater than number 
	public boolean greaterThan(Month month2){
		
		boolean isGreaterThan = false;
		if(this.monthNum > month2.monthNum){
			isGreaterThan = true;
		}
		return isGreaterThan;
	}
	// same as the greater than method only deciphering if its less than instead
	public boolean lessThan(Month month){
		
		boolean isLessThan = false;
		if(this.monthNum < month.monthNum){
			isLessThan = true;
		}
		return isLessThan;
	}

	
	
}
