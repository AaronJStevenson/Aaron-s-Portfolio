import java.util.Scanner;

public class WorkerLauncher {

	public static void main(String[] args) {
		String ename; // holds the place of the name variable
		int eNum = 0; // holds the value of the employee's number
		String hDate; // holds the value of the employee's hire date
		int eshift = 0; // holds the value of the shift the employee works
		double erate; // holds the value of the employee's hourly rate

		Scanner keyboard = new Scanner(System.in);// creating the keyboard object
		
		System.out.println("What is the employee's name?");// asking a question
		ename = keyboard.nextLine();// setting the the name equal to the next line typed
		
		//System.out.println("What is the employee's number?");
		//eNum = keyboard.nextLine();
		
		System.out.println("When were they hired?");// asking a question
		hDate = keyboard.nextLine();// the next line typed is the hire date
		
		
		
	
			System.out.println("Do they work day shift ( integer 1 )or night shift ( integer 2 )?");// asking a question
			 eshift = keyboard.nextInt();// the next line typed is the shift value

			 // this will not allow you to enter a value other than 1 or 2
			 if(eshift != 1 || eshift != 2){
				 while(eshift <= 0 || eshift > 2){
					 System.out.println("Do they work day shift ( integer 1 )or night shift ( integer 2 )?");
					 eshift = keyboard.nextInt();
				 }
			 }
	
		
	
		
		System.out.println("What is their hourly rate of pay?");// asking a question
		erate = keyboard.nextDouble();// the next line typed is the rate of pay
		
		// this is the object to the Production worker class
		ProductioinWorker emp = new ProductioinWorker(eshift, hDate, ename, eNum, erate);
		
		// display the output
		System.out.print("The employee's name: " + emp.getName() + "\n");
		
		System.out.print("The employee's number: " + emp.getEmpNum() + "\n");
		
		System.out.print("The employee's hire date: " + emp.getHireDate() + "\n");
		
		System.out.print("The employee's rate of pay: " + emp.getRate() + " dollars per hour. \n");
		
		System.out.print(emp.getName() + "'s employee number is " + emp.getEmpNum() + ". " + 
		emp.getName() + " was hired on " + emp.getHireDate() + ". He works the " + emp.getShift() + " shift at " +
			emp.getRate() + " dollars per hour.");
		
	}
	
}
