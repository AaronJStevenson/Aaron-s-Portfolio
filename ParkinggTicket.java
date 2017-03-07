import java.text.DecimalFormat;

public class ParkinggTicket {
	private ParkingMeter parkingMeter;// aggrogate for ParkingMeter class
	private ParkedCar parkedCar; // aggrogate for the ParkedCar class
	private PoliceOfficer policeOfficer;// the aggrogate for the PoliceOfficer class
	// the constructor
	public ParkinggTicket() {
		
	}
    // 2 more constructors passing aggregates
	public ParkinggTicket(ParkingMeter parkingMeter, ParkedCar parkedCar, PoliceOfficer policeOfficer) {
		this.parkingMeter = new ParkingMeter(parkingMeter);
		this.parkedCar = new ParkedCar(parkedCar);
		this.policeOfficer = new PoliceOfficer(policeOfficer);
	}

	public ParkinggTicket(ParkinggTicket parkingTicket) {
		this.parkingMeter = new ParkingMeter(parkingTicket.parkingMeter);
		this.parkedCar = new ParkedCar(parkingTicket.parkedCar);
		this.policeOfficer = new PoliceOfficer(parkingTicket.policeOfficer);
	}
	
	/**
	 * returns a string with the objects make, model,
	 * license number, and number of minutes parked.
	 * @param parkedCar
	 * @return
	 */
	public String getParkedCarReport() {
		return new ParkedCar(parkedCar).toString();
	}
	
	public String getPoliceOfficerReport() {
		return new PoliceOfficer(policeOfficer).toString();
	}
	
	/**
	 * returns a string with the parking fine
	 * @return
	 */
	public String getParkingFine() {
		//create a DecimalFormat object
		DecimalFormat formatter = new DecimalFormat("$###,##0.00");
		
		double fine = 0; //fine of the illegally parked car
		
		String str = "The car is not parked illegally, there is no fine.";
		//determine how many minutes over the car has been parked
		double minutesOver = parkedCar.getNumMinutesParked() - parkingMeter.getNumMinutesPurchased();
		// determine if the car is illegally parked
		if(parkedCar.getNumMinutesParked() > parkingMeter.getNumMinutesPurchased()) {
			fine += 25.0; //base fine for the first hour
		}
		if(minutesOver > 60) {
			/* calculate the number of hours that the car is illegally parked and multiply
			 the ((minutesOver -60)/60.0) * 10) */
			fine += (Math.ceil((minutesOver - 60.0)/60.0) * 10.0);
		}
		// change the default result if there is a fine
		if(fine > 0.0){
			str = "Fine: " + formatter.format(fine);
		}
		return str;
	}
}
