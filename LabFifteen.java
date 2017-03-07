import java.util.Scanner;
import javax.swing.JOptionPane;

public class LabFifteen {

	public static void main(String[] args) {
	
		double sugar = 1.5;
		double butter = 1;
		double flour = 2.75;

		double cookies;
		
		// input amount for the cookies
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many cookies do you wish to make?");
		cookies = Double.parseDouble(keyboard.nextLine());
		
		/* one attempt i tried
		System.out.println(sugar * cookies);
		System.out.println(butter * cookies);
		System.out.println(flour * cookies);
		*/
		
		// stating if its less than or equal to 48 requires whole batch
		if (cookies <= 48){
		System.out.println(sugar + " cups of sugar.");
		System.out.println(butter + " cups of butter.");
		System.out.println(flour + " cups of flour.");
		} else if (49 <= 96){
			System.out.println(sugar * 2 + " cups of sugar.");
			System.out.println(butter * 2 + " cups of butter.");
			System.out.println(flour * 2 + " cups of flour.");	
		} 
		
	

	}
	
}
