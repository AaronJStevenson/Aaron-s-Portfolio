import java.util.Scanner;
// this is importing the Scanner object

public class numLauncher {

	public static void main(String[] args) {
		
		// local variable in the main method
		double userInput;
		
		

	

	// Scanner class object to help input user feedback
	Scanner keyboard = new Scanner(System.in);
	
	//must set value before creating the object   ALWAYS REMEMBER
	System.out.println("Enter a positive integer value.");
	userInput = keyboard.nextDouble();
	
	// class object from the sumNum() class
	sumNum num1 = new sumNum(userInput);
		
	
	
	
	
	System.out.println("These are the sum of all the integers: " +num1.getInput());
	


	keyboard.close();
}
}