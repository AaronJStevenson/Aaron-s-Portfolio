// This class is issuing the ticket with the values from the other classes
public class TicketLauncher {

	public static void main(String[] args) {
		ParkedCar car = new ParkedCar("Mazda ", " Miata ", " LMD456 ", 185);
		ParkingMeter meter = new ParkingMeter(30);
		PoliceOfficer officer1 = new PoliceOfficer(" Officer Lutes ", 45678);
		ParkinggTicket ticket = new ParkinggTicket(meter, car, officer1);
		PoliceOfficer officer2 = new PoliceOfficer(officer1, car, meter, ticket);
		officer2.examineCar();
		

	}

}
