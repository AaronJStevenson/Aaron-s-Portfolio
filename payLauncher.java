import java.util.Scanner;
// imports our Scanner class

import javax.swing.JOptionPane;
// imports our JOPtion Pane

public class payLauncher {

	// fields
	double Salary;
	
	
	
	
	public static void main(String[] args) {
		// creating scanner object
		
		
		//time variable set to 0
		double time = 0;
		// creating the class object
		pennyPay penny1 = new pennyPay();
		
		double userInput = 0;
		// asking the question
		
		userInput = Double.parseDouble(JOptionPane.showInputDialog("How many days are in your pay period? "));
		while(userInput == 0){
			userInput = Double.parseDouble(JOptionPane.showInputDialog("How many days are in your pay period? "));
		penny1.setTime(userInput);
		
		}
		
	    JOptionPane.showMessageDialog(null, "Your salary is : " + penny1.getSalary());
	    
	    System.exit(0);
	}

}
