public class hotelOccu {
	// instance fields
	int floors;
	private double rooms; 
	private int occupied;
	private double totalRooms;
	private double totalOccupied;
	private double vacancy;
	private double rate;
	private double userInput;
//constructor
	public hotelOccu() {
		//passing varables and their values through the constructor
		this.setFloors((int) userInput);
		this.setOccupied((int) userInput);
		this.setRooms(userInput);
		this.setVacant(userInput);
	}
	public int getFloors() {	
		return floors;
	}
	public void setFloors(int floors) {
		this.floors = floors;
	}
	public double getRooms() {
		return rooms;
	}
	public void setRooms(double rooms) {
		this.rooms = rooms;
	}
	public int getOccupied() {
		return occupied;
	}
	public void setOccupied(int occupied) {
		this.occupied = occupied;
	}
// adding for total num of rooms
	public double getTotalRooms() {
		// Calculate total rooms
					totalRooms += rooms;
		return totalRooms;
	}
	public void setTotalRooms(double totalRooms) {
		this.totalRooms = totalRooms;
	}
// adding for total occupied rooms
	public double getTotalOccupied() {
		// Calculate total rooms occupied
					totalOccupied += occupied;
		return totalOccupied;
	}
	public void setTotalOccupied(double totalOccupied) {
		this.totalOccupied = totalOccupied;
	}
	public double getVacant() {
		return vacancy;
	}
	public void setVacant(double vacancy) {
		this.vacancy = vacancy;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public double getUserInput() {
		return userInput;
	}
	public void setUserInput(double userInput) {
		this.userInput = userInput;
	}
	// getters and setters
}
