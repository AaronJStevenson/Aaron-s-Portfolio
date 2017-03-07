import java.util.Scanner;

public class MonthLauncher {

	public static void main(String[] args)throws NotValidMonth {
		Month month1 = new Month();
		int monthNum;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter in a digit for a month. 1 through 12.");
		monthNum = keyboard.nextInt();
		month1.setMonthNumber(monthNum);
		if(monthNum < 1 || monthNum > 12){
			monthNum = 1;
			throw new NotValidMonth();
		}
	
		
		
		System.out.println(month1.toString());

	}

}
