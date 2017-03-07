import java.util.Scanner;
// this imports the scanner method

import java.io.*;
// this imports the PrintWriter and IOException 

public class travelLauncher {

	public static void main(String[] args) throws IOException {
		
		// local variable in my main method
		double Hours = 0;
		double Mph = 0;

		// scanner object
		Scanner keyboard = new Scanner(System.in);
		
		// asking the question to allow you to set the variable speed
		System.out.println("Enter in the speed you were driving?");
		Mph = keyboard.nextDouble();
		
		// asking the question to allow you to set the variable speed
		System.out.println("Enter in the hours you were driving?");
		Hours = keyboard.nextDouble();
		
		// creating the class object
		distanceTravel travel1 = new distanceTravel(Mph, Hours);
		
		// initializing the distance equal to 0 so you can add on to it
		double distance = 0;
		travel1.getDistance(distance);
		
		
		
		
		
	}

}
