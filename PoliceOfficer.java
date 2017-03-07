public class PoliceOfficer {
	private String name; //Officers Name
	private int badgeNum; //Officer's badge number
	private ParkedCar parkedCar; //Parked car object
	private ParkingMeter parkingMeter; //parking meter object
	private ParkinggTicket parkingTicket; //parking ticket object
	
	/**
	 * No arg constructor to initialize the field 
	 * values
	 */
	public PoliceOfficer() {
		this.name = "";
		this.badgeNum = 0;
	}
	
	/**
	 * Constructor to set the name and badge number of
	 * a police officer
	 * @param name
	 * @param badgeNum
	 */
	public PoliceOfficer(String name, int badgeNum) {
		this.name = name;
		this.badgeNum = badgeNum;
	}
	
	/**
	 * Constructor to set the name, badge number, Parked Car object
	 * @param name
	 * @param badgeNum
	 * @param parkedCar
	 * @param parkingMeter
	 */
	public PoliceOfficer(String name, int badgeNum, ParkedCar parkedCar, ParkingMeter parkingMeter) {
		this.name = name;
		this.badgeNum = badgeNum;
		this.parkedCar = new ParkedCar(parkedCar);
		this.parkingMeter = new ParkingMeter(parkingMeter);
	}
	
	public PoliceOfficer(PoliceOfficer policeOfficer, ParkedCar parkedCar, ParkingMeter parkingMeter, ParkinggTicket parkingTicket) {
		this.parkedCar = new ParkedCar(parkedCar);
		this.parkingMeter = new ParkingMeter(parkingMeter);
		this.parkingTicket = new ParkinggTicket(parkingTicket);
		this.name = policeOfficer.name;
		this.badgeNum = policeOfficer.badgeNum;
		
	}
	
	/**
	 * Constructor to duplicate a PoliceOfficer Object
	 * @param policeOfficer
	 */
	public PoliceOfficer(PoliceOfficer policeOfficer) {
		this.name = policeOfficer.name;
		this.badgeNum = policeOfficer.badgeNum;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBadgeNum() {
		return badgeNum;
	}
	
	public void setBadgeNum(int badgeNum) {
		this.badgeNum = badgeNum;
	}
	
	public ParkedCar getParkedCar() {
		return new ParkedCar(parkedCar);
	}
	
	public void setParkedCar(ParkedCar parkedCar) {
		this.parkedCar = new ParkedCar(parkedCar);
	}
	
	public ParkingMeter getParkingMeter() {
		return new ParkingMeter(parkingMeter);
	}
	
	public void setParkingMeter(ParkingMeter parkingMeter) {
		this.parkingMeter = new ParkingMeter(parkingMeter);
	}
	
	public ParkinggTicket getParkingTicket() {
		return parkingTicket;
	}
	
	public void setParkingTicket(ParkinggTicket parkingTicket) {
		this.parkingTicket = parkingTicket;
	}
	// saying if the minutes parked is more than they paid, issue the ticket
	public void examineCar() {
		if((parkedCar.getNumMinutesParked() - parkingMeter.getNumMinutesPurchased()) > 0) {
			issueParkingTicket();
		}
	}
	
	public void issueParkingTicket() {
		System.out.println("Issue ticket has been called");
		System.out.println("Parking Ticket" + 
					"\n**************************\n" + 
					"Car Info: " + "\n " + parkingTicket.getParkedCarReport() + "\n " + 
					"Police Officer Info: \n" + parkingTicket.getPoliceOfficerReport() + "\n " + 
					"Fine: \n" + parkingTicket.getParkingFine());
	}
	
	@Override
	public String toString() {
		String str;
		str = "Officer Name: " + this.name + "\n" + 
				"Badge Number: " + this.badgeNum;
		return str;
	}
	
	
	
}
