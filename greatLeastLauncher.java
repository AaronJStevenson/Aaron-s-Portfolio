import java.util.Scanner;
// importing in the scanner class to read input

public class greatLeastLauncher {

	public static void main(String[] args) {
		//local variables
		int value; 	
		int smallest;
		int largest = 0; 								
		
		// Instantiating objects
		Scanner keyboard = new Scanner(System.in);	
		greatLeast num1 = new greatLeast();
		
		// Asking the question
		System.out.println("Enter a series of numbers from -98 on up. If you type -99 it will end!");
		
		// Prompt user for input
		System.out.print("Enter a number: ");			
		num1.setValue(keyboard.nextInt());
		
		num1.getValues();
		
		
		
		// while loop 
		
		
		// Display largest and smallest value
		System.out.println("Smallest Value: " + num1.getSmallest() + "\nLargest Value: " + num1.getLargest());
	}
}