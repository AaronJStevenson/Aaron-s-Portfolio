import java.util.Scanner;  // need to add to use scanner class
import javax.swing.JOptionPane; // need to add to use a dialog box class

public class LabEight {

	public static void main(String[] args) {
		double stateTax = .055; // this
		double countyTax = .02;
		double purchase;
		
	    // Here im getting the amount that someone types as the purchase price
		Scanner keyboard = new Scanner(System.in );
		System.out.println("How much is your purchase?");
		purchase = Double.parseDouble(keyboard.nextLine());
		
		// here is where i made all of my calculations
		double statePur = purchase * stateTax;
		double countyPur = purchase * countyTax;	
		double totalTax = statePur + countyPur;
		double totalPrice = totalTax + purchase;
		
		// here i printed out the results
		System.out.println("The purchase price is $" + purchase);
		System.out.println("The state tax for this is $" + statePur);
		System.out.println("The county tax for this is $" + countyPur);
		System.out.println("The total tax for this is $" + totalTax);
		System.out.println("The overall price for this is $" + totalPrice);
		
		keyboard.close();
		

	}

}
