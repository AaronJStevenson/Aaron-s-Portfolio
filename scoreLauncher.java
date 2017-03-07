import java.util.Scanner;
import javax.swing.JOptionPane;

public class scoreLauncher {

	
	public static void main(String[] args) {
		// local variable 
		double userInput = 0;
		// objects
		Scanner keyboard = new Scanner(System.in);
		TestScores score1 = new TestScores(userInput, userInput, userInput);
		
		
		// asking questions then using our class object to store the users input into our testOne variable. . . for each variable
		userInput = Double.parseDouble(JOptionPane.showInputDialog("What is your first test score?"));
		score1.setTestOne(userInput);
		
		userInput = Double.parseDouble(JOptionPane.showInputDialog("What is your second test score?"));
		score1.setTestTwo(userInput);
		
		userInput = Double.parseDouble(JOptionPane.showInputDialog("What is your third test score?"));
		score1.setTestThree(userInput);
		
		
		JOptionPane.showMessageDialog(null, "Your grade is an " + score1.getAverage() + "%.");
		
		System.exit(0);

	}
	

}
