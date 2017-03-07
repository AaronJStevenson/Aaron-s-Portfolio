import java.text.DecimalFormat;
import java.util.Scanner;

public class SupervisorLauncher {

	public static void main(String[] args) {
		String ename; // holds the place of the name variable
		int eNum = 0; // holds the value of the employee's number
		String hDate; // holds the value of the employee's hire date
		double annualSalary = 0; // holds the value of the employee's annual salary
		double annualProdBonus = 0; // holds the value of the employee's annual production bonus

		Scanner keyboard = new Scanner(System.in);// creating the keyboard object
		DecimalFormat formatter = new DecimalFormat("$###,##0.00"); // creating the decimal object
		
		System.out.println("What is the employee's name?");// asking a question
		ename = keyboard.nextLine();// setting the the name equal to the next line typed
		
		
		System.out.println("When were they hired?");// asking a question
		hDate = keyboard.nextLine();// the next line typed is the hire date
		
		
		
		// this is the object to the Production worker class
		ShiftSuperviser viser = new ShiftSuperviser( ename, eNum, hDate, annualSalary, annualProdBonus);
		
		// display the output
		System.out.print("The employee's name: " + viser.getName() + "\n");
		
		System.out.print("The employee's number: " + viser.getEmpNum() + "\n");
		
		System.out.print("The employee's hire date: " + viser.getHireDate() + "\n");
		
		System.out.print(viser.getName() + "'s employee number is " + viser.getEmpNum() + ". " + 
				viser.getName() + " was hired on " + viser.getHireDate() + ". He makes " + formatter.format(viser.getAnnualSalary()) + 
				" annually and " + formatter.format(viser.getAnnualProdBonus()) + " annually as a production bonus.");
		
	}
	
}
