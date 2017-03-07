import java.util.Scanner;
import java.text.*;

public class hotelLauncher {
	
	public static void main(String[] args) {
	 int floors;
	 double rooms = 0; 
	 int occupied = 0;
	 double totalRooms = 0;
	 double totalOccupied = 0;
	 double vacancy = 0;
	 double rate = 0.0;
	 int userInput;
		// Instantiating objects 
		Scanner keyboard = new Scanner(System.in);
		hotelOccu hotel1 = new hotelOccu();
		// Prompt user for floor count
		System.out.print("Enter the number of floors: ");
		userInput = keyboard.nextInt();
		hotel1.setFloors(userInput);
		// Input validation: Floor count > 1
		while(hotel1.getFloors() < 1){
			System.out.print("Invalid Input. Enter a number of floors greater than 0: ");
			userInput = keyboard.nextInt();
			hotel1.setFloors(userInput);
		}
		// for loop 
		for(int i = 0; i < hotel1.getFloors(); i++){
			// Prompt user for the number of rooms
			System.out.print("Enter the number of rooms (Floor " + (int)(i + 1) + "): ");
			userInput = keyboard.nextInt();
			hotel1.setRooms(userInput);
			// Room input validation
			while(hotel1.getRooms() < 10){
				System.out.print("Invalid input. Enter a number of rooms greater than 9 \n (Floor " + (int)(i + 1) + "): ");
				userInput = keyboard.nextInt();
				hotel1.setRooms(userInput);
			}
			
			// Prompt user for the number of rooms occupied.
			System.out.print("Enter the number of rooms occupied(Floor " + (int)(i + 1) + "): ");
			userInput = keyboard.nextInt();
			hotel1.setOccupied(userInput);
			
			// making the rooms equal to the rooms on the other class
			rooms = hotel1.getRooms();
			
			// Calculate total rooms
			totalRooms += rooms;
			
			// making occupied equal to occupied
			occupied = hotel1.getOccupied();
			
			// Calculate total rooms occupied
			totalOccupied += occupied;
		}
		
		// Calculate total vacancy
		vacancy = totalRooms - totalOccupied; 
		
		// Calculate occupancy rate
		rate = (totalOccupied/totalRooms);
		
		
		
		// Display Hotel Occupancy data
		System.out.println("Total Number of Rooms: " + totalRooms + "\n Occupied Rooms: " + totalOccupied + 
							"\n Vacant Rooms: " + vacancy + "\n The Occupancy Rate: " + rate + "%");
	}
}