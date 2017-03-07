import java.util.Scanner;

public class payroll2Launcher {

	public static void main(String[] args) throws EmptyNameException, InvalidNumberException, InvalidHoursException, InvalidPayRate {
		String name = "Aaron";
		int idNum = 9;
		double hourlyRate = 1;
		int numHours = -80;
		// this makes it to where it can read my keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		// printing out helpful input so Employee knows what to type for there payroll
		Payroll2 employee1 = new Payroll2( name, idNum, hourlyRate, numHours);
		   System.out.println( "Employee Name ");
	        employee1.setName(keyboard.nextLine());
	        System.out.println("Employee ID ");
	        employee1.setId(keyboard.nextInt());
	        System.out.println("Hourly Rate");
	        employee1.setRate(keyboard.nextDouble());
	        System.out.println("Hours Worked");
	        employee1.setHours(keyboard.nextDouble());
	        System.out.println("Your gross pay is:");
	        System.out.println(employee1.getCalculate());
	       
	       keyboard.close();
	        

	       // initialize values at the top to trigger exceptions
	}

}