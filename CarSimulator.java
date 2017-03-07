
public class CarSimulator {

	public static void main(String[] args) {
	 FuelGauge fuelGauge = new FuelGauge();
	 odometer odometer1 = new odometer(0, fuelGauge);
	 CarSimulator carSimulator = new CarSimulator();

	    for (int i = 0; i < odometer1.MAXMILES; i++) {
	        fuelGauge.addGallons();
	    }

	    // drive until done.
	    while (fuelGauge.getGallons() > 0) {

	        // add mile driven
	        odometer1.addMileage();

	        // Display the mileage.
	        System.out.println("Mileage: " + odometer1.getMileage());

	        // Display the amount of fuel.
	        System.out.println("Fuel level: \n" + fuelGauge.getGallons() + " gallons");
	        System.out.println("************************");
	    }
	    
}
}

