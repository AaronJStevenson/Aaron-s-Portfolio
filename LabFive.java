import java.util.Scanner;  // need to add to use scanner class
import javax.swing.JOptionPane; // need to add to use a dialog box class


public class LabFive {

	public static void main(String[] args) {
		double cookie;
		double calorie;		
				
				
				System.out.println("How many cookies?");
				Scanner keyboard = new Scanner(System.in ); 
		cookie = Double.parseDouble(keyboard.nextLine()); 
		calorie = cookie * 75;
		System.out.println("This amount of cookie/cookies equals " + calorie + " calories.");
		keyboard.close();
	}
	
}
