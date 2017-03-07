import java.util.Scanner;

public class rainFallLauncher {

	public static void main(String[] args) { 
		final int MONTHS = 12; // hold the values of the number of months
		
		// creating the scanner object 
		Scanner keyboard = new Scanner(System.in);
		
		
		
		// create an array to holdthe test scores
		double[] rain = new double [MONTHS];
		
		// get the test scores and store them in the scores array
		for (int index = 0; index < MONTHS; index++){
			
			System.out.print("Enter in the rainfall for the #" + (index + 1) + " month: ");
			rain[index] = keyboard.nextDouble();
			if(rain[index] < 0){
				System.out.println("Enter in a positve amount of rain.");
			index--;
			}
			
		}
		
		// create a grader object, padding the scores array
		// as an argument to the constructor
		RainFall myRainFall = new RainFall(rain); // this is a class object
	
		// display the adjusted average
		System.out.println("Your average rainfall is " + myRainFall.getAverage());
		
		// display the total rain
		System.out.println("Your total rainfall was " + myRainFall.getTotalRainFall());
		
		// display the lowest rain
		System.out.println("Your lowest rainfall was in the #" + myRainFall.getLowestRainFall() + " month.");
		
		// display the highest rain
		System.out.println("Your highest rainfall was in the #" + myRainFall.getHighestRainFall() + " month.");

	}

}
