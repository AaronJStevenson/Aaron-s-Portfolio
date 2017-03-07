import java.text.DecimalFormat;
import java.util.Scanner;

public class PayArray {
	
// this program stores in an array the hours worked by five employees
	// and they all make the same hourly wage
	
	public static void main(String[] args) {
		// if we wanted to do a userInput for num of employees, we could as the question and take the value 
		// make it equal to num employees then when we used it in the for loop it would be hours.length
		
		/*
		 * int numTests;
		 * int[] tests;
		 * 
		 * test = new int[numTest];
		 * 
		 * for (int index = 0; index < tests.length; index++){
		 * 
		 */
		
		final int NUM_EMPLOYEES = 5;  // number of employees
		double payRate; // hourly pay rate
		double grossPay; // the gross pay of hours * rate
		
		// creating the array for employee hours
		int[] hours = new int[NUM_EMPLOYEES];
		
		//Creating the scanner class input object
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the hours worked by the " + NUM_EMPLOYEES + " employees who " +
		" all earn the same hourly rate.");// asking the question to begin for users input
		
		// getting each employees hours
		for(int i = 0; i < NUM_EMPLOYEES; i++){
			System.out.println("Employees #" + (i + 1) + ": ");
			hours[i] = keyboard.nextInt();
			
		}
		
		// getting the hourly pay rate
		System.out.println("Enter each employees pay rate.");
		payRate = keyboard.nextInt();
		
		// creating decimal format
		DecimalFormat formatter = new DecimalFormat("#,##0.00");
		
		// display each employees gross pay
		System.out.println("The gross pay for the employees is: ");
		for (int i = 0; i < NUM_EMPLOYEES; i++){
			System.out.println("Employee #" + (i + 1) + " makes " + formatter.format(hours[i] * payRate));
		}
		
		

	}

}
