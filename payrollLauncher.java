import java.util.Scanner;

public class payrollLauncher {

	public static void main(String[] args) {
		
		// this makes it to where it can read my keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		// printing out helpful input so Employee knows what to type for there payroll
		Payroll employee1 = new Payroll();
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
	        

	}

}
