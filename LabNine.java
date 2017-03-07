import java.util.Scanner;  // need to add to use scanner class

public class LabNine {

	public static void main(String[] args) {
		double miles;
		double gallons;
		
		Scanner keyboard = new Scanner(System.in );
		System.out.println("How many miles did you drive?");
		miles = Double.parseDouble(keyboard.nextLine());
		// here im getting the miles they drove
		
		System.out.println("How many gallons have you used?");
		gallons = Double.parseDouble(keyboard.nextLine());
		// here im getting the gallons used
		
		double mpg = miles / gallons;
		// this is the taking there input and figured out the miles per gallon
		
		System.out.println("You are getting " + mpg + " miles per gallon.");
		
		System.out.println();
		
		keyboard.close();
		

	}

}
