import java.util.Scanner;

public class LabTen {

	public static void main(String[] args) {
		
		double test1;
		double test2;
		double test3;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a test score.");
		test1 = Double.parseDouble(keyboard.nextLine());
		// getting input for the first test
		
		System.out.println("Enter another test score.");
		test2 = Double.parseDouble(keyboard.nextLine());
		// getting input for the second test
		
		System.out.println("Enter the last test score.");
		test3 = Double.parseDouble(keyboard.nextLine());
		// getting input for the third test

		double avg = (test1 + test2 + test3) / 3;
		System.out.println("Your average test score is an " + avg);
		// this take all 3 inputs and calculates the average and puts it on the screen
		
		keyboard.close();
	}

}
