import java.util.Scanner;

public class LabThirteen {

	public static void main(String[] args) {
		double amount;
		double tax = .075;
		double tip = .18;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How much was your meal?");
		amount = Double.parseDouble(keyboard.nextLine());
		// this will save the amount typed for your amount
		
		// the calculations for the totals are done here
		double mealTax = amount * tax;
		double mealTip = (amount + mealTax) * tip;
		double total = amount + mealTip;
		
		// heres the print out for the totals
		System.out.println("Your meal was $" + amount);
		System.out.println("The tax was $" + mealTax);
		System.out.println("Your tip was $" + mealTip);
		System.out.println("Your meal was $" + total);
		

	}

}
