
public class ParkingMeter {
	private double numMinutesPurchased;
	
	/**
	 * No arg constructor to initialize fields
	 */
	public ParkingMeter() {
		this.numMinutesPurchased = 0.0;
	}

	public ParkingMeter(double numMinutesPurchased) {
		this.numMinutesPurchased = numMinutesPurchased;
	}
	
	//copy of constructor
	public ParkingMeter(ParkingMeter object2) {
		this.numMinutesPurchased = object2.numMinutesPurchased;
	}

	public double getNumMinutesPurchased() {
		return numMinutesPurchased;
	}

	public void setNumMinutesPurchased(double numMinutesPurchased) {
		this.numMinutesPurchased = numMinutesPurchased;
	}

	@Override
	public String toString() {
		String str;
		str = "Number of minutes purchased: " + this.numMinutesPurchased;
		return str;
	}
	
	

}
