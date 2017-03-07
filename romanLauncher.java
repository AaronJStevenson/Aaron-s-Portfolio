import java.util.Scanner;

public class romanLauncher {

	public static void main(String[] args) {
		int userInput;
		
		Scanner keyboard = new Scanner(System.in); // creating an object that calls the Scanner() class
		RomanNum roman1 = new RomanNum(); // creating an object that calls the RomanNum() class
		System.out.println("Type a number between 1 and 10 to recieve its roman numeral.");
		userInput = keyboard.nextInt();
		roman1.setUserInput(userInput);
		roman1.setRomNum(userInput);
		System.out.print("Your roman numeral for " + roman1.getUserInput() + " is " + roman1.getRomNum());
		
		
		keyboard.close();

	}

}
