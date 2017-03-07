
public class CruiseShip extends Ship {

	private int maxPass; // max passengers
	
	// constructor no arg
	public CruiseShip() {
		maxPass = 0;
	}
	
	// constructor passing fields
	public CruiseShip(String name, String Year, int maxPassengers) {
		super(name, Year);
		this.maxPass = maxPassengers;
	}

	
	public int getMaxPassengers() {
		return maxPass; // retrurning max num of passengers
	}

	public void setMaxPassengers(int maxPassenger) {
		this.maxPass = maxPassenger; // setting the max passengers
	}
	// displaying the name year and passengers of ship
	public String toString(){
		return " Name: " + this.getName() + "\n Year: " + this.getYear() + 
	    "\n Max Passengers: " + this.maxPass + "\n";
	}
}
