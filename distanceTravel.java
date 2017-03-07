import java.util.Scanner;
// importing the scanner class

import java.io.*;
// importing the PrintWriter 

public class distanceTravel {

	// instance fields
	private double mph;
	private double hours;
	private double distance;
	private String fileName;
	
	public distanceTravel(double Mph, double Hours)throws IOException {
		this.setMph(Mph);
		this.setHours(Hours);
	}

	// these are my getters and setters
	public double getMph(){
	
		return mph;
	}
	public void setMph(double Mph){
		
		this.mph = Mph;
		
	}
	
	public double getHours(){

		return hours;
	}
	public void setHours(double Hours){
		
		this.hours = Hours;
	}
	
	public void getDistance(double Distance) throws IOException
	{
	  do{
		  // getting the scanner object
		  Scanner keyboard = new Scanner(System.in);
		  
		// asking the question to allow you to set the variable speed
		  System.out.println("Enter in the speed you were driving?");
			mph = keyboard.nextDouble();
			
			// asking the question to allow you to set the variable hours
			System.out.println("Enter in the hours you were driving?");
			hours = keyboard.nextDouble();
			
			
			  
	  } while (mph <= 0 && hours <= 1);{
	// getting the scanner object
	  Scanner keyboard = new Scanner(System.in);
	  
	// getting the file name 
	 // System.out.println("Please enter a file name: ");
	  //fileName = keyboard.nextLine();
	  
	  // Opening the file
	 // PrintWriter outputFile = new PrintWriter(fileName);
	  
	  System.out.println("Hour \t\t Distance Traveled \n--------------------------------------");//
	 // outputFile.println("Hour \t\t Distance Traveled ");
	  //outputFile.println("--------------------------------------");
	  // stating that this distance is this Distance and that distance equals hours times mph
	  this.distance = Distance;
		distance = hours * mph;
		// basically saying that i is 1 and that each iteration or i is equal to or less than hours and to update or + i for
		// each iteration.
			for(int i = 1; i <= hours; i++)
				{
					//System.out.println("hello");
					System.out.println(i  + "\t\t\t" + (mph * i));//
				//outputFile.println(i  + "\t\t\t" + (mph * i));
				  }
			// CLose the file
					//	outputFile.close();
		//}
		/*else
		{
			System.out.print("You entered an invalid time or mile per hour!");
			}*/
			
	}
		
	
	}
}


