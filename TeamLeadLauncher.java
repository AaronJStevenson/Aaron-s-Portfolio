import java.util.Scanner;

public class TeamLeadLauncher {

	public static void main(String[] args) {
		String ename; // holds the place of the name variable
		int eNum = 0; // holds the value of the employee's number
		String hDate; // holds the value of the employee's hire date
		int eshift = 0; // holds the value of the shift the employee works
		double erate; // holds the value of the employee's hourly rate
		double monthlyBonus = 0; // this is the bonus handed out each month
		int requiredTrain = 0; // this is the amount of required training hours
		int trainHours; // these are the hours trained

		Scanner keyboard = new Scanner(System.in);// creating the keyboard object
		
		System.out.println("What is the employee's name?");// asking a question
		ename = keyboard.nextLine();// setting the the name equal to the next line typed
		
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
		
		System.out.println("How many hours have they trained?");// asking a question
		trainHours = keyboard.nextInt();// the next line typed is the rate of pay
		
		// this is the object to the team leader class
		TeamLeader lead = new TeamLeader(eshift, hDate, ename, eNum, erate, trainHours , requiredTrain, monthlyBonus);
		
		// display the output
		System.out.print("The employee's name: " + lead.getName() + "\n");
		
		System.out.print("The employee's number: " + lead.getEmpNum() + "\n");
		
		System.out.print("The employee's hire date: " + lead.getHireDate() + "\n");
		
		System.out.print("The employee's rate of pay: " + lead.getRate() + " dollars per hour. \n");
		// displays all of the variables used by the team leader class
		System.out.print(lead.getName() + "'s employee number is " + lead.getEmpNum() + ". \n " + 
				lead.getName() + " was hired on " + lead.getHireDate() + ". He is the team leader for the  " + lead.getShift() + " shift at " +
				lead.getRate() + " dollars per hour.\n As a team leader, he also gets a monthly bonuse of " + lead.getMonthlyBonus() +
			" and must have a mandatory " + lead.getRequiredTrain() + " hours of training.\n He currently has " +
			lead.getTrainHours() + " hours of training.");
		
	}
	/**
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * Start at the error on line 41
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}