
public class FuelGauge {
	
	private double currentFuel;// This is instance field for the amount of fuel
	final static double MAXFUEL = 15;// the max amount of fuel
	private double fillFuel;// This is filling up the fuel
	private double burningFuel;// This is the fill being used
	private double gallons;
	
	odometer odometer2;//aggregate of odometer
	
	// no arg constructor to initialize
	public FuelGauge() {
		this.currentFuel = 0;
		this.fillFuel = 0;
		this.burningFuel = 0;
	}
	public FuelGauge(double currentFuel, double fillFuel, double burningFuel) {
		this.currentFuel = currentFuel;
		this.fillFuel = fillFuel;
		this.burningFuel = burningFuel;
		
	}
	//copy of constructor
	public FuelGauge(FuelGauge object2){
		this.currentFuel = object2.currentFuel;
		this.fillFuel = object2.fillFuel;
		this.burningFuel = object2.burningFuel;
	}


	public double getCurrentFuel(double gallons) {
		if (gallons <= MAXFUEL) {
            this.gallons = gallons;
        } else {
            gallons = MAXFUEL;
        }
		return currentFuel;
	}


	public double getFillFuel() {
		
		return fillFuel;
	}


	public void setFillFuel(double fillFuel) {
		this.fillFuel = fillFuel;
	}

	public void setCurrentFuel(double currentFuel) {
		this.currentFuel = currentFuel;
	}
	public double getGallons() {
		return gallons;
	}
	public void setGallons(double gallons) {
		this.gallons = gallons;
	}
	public odometer getOdometer2() {
		return odometer2;
	}
	public void setOdometer2(odometer odometer2) {
		this.odometer2 = odometer2;
	}
	public double getCurrentFuel() {
		return currentFuel;
	}
	public static double getMaxfuel() {
		return MAXFUEL;
	}
	// adding fuel if less than max
	public void addGallons() {
        if (gallons < MAXFUEL) {
            gallons++;
        } 
    }
	// simulating burning fuel
		public void burnFuel() {
	        if (gallons > 0) {
	            gallons--;
	        } else {
	            System.out.println("Out of gas.");
	        }
	    }

	
}
