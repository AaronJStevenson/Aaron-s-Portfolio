import java.util.Scanner;

public class LabTwelve {

	public static void main(String[] args) {
	
		
		Scanner keyboard = new Scanner (System.in);
		
		// this is my variable 
		String favCity;
		
		// this is stating what is typed will be place in the variable
		System.out.println("Please enter the name of your favorite city.");
		favCity = keyboard.nextLine();
		
		// each of these print methods dispays a different version of the variable
		System.out.println("The number of characters in " + favCity + " is " +favCity.length());
		System.out.println(favCity.toUpperCase());
		System.out.println(favCity.toLowerCase());
		System.out.println(favCity.charAt(0));
		

	}

}
