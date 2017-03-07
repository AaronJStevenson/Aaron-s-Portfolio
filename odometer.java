
public class odometer {
	double currentFuel;// This is instance field for the amount of fuel
	double mileage; // the miles being driven
	double initialMileage;
	public final int MAXMILES = 999999;// Constant for the max miles
	public final int MPG = 24;// Constant for the miles per gallon
	// aggregate
	FuelGauge fuelGauge;
	
	// no arg constructor to initialize
	public odometer() {
		this.currentFuel = 0;
		this.mileage = 0;
	}
	public odometer(double mileage, FuelGauge fuelGauge) {
        this.initialMileage = mileage;
        this.mileage = mileage;
        this.fuelGauge = fuelGauge;
    }
	public odometer(double currentFuel, double mileage) {
		this.currentFuel = currentFuel;
		this.mileage = mileage;
	}
	//copy of constructor
	public odometer(odometer object2) {
		this.currentFuel = object2.currentFuel;
		this.mileage = object2.mileage;
	}
	public double getCurrentFuel() {
		return currentFuel;
	}
	public void setCurrentFuel(double currentFuel) {
		this.currentFuel = currentFuel;
	}
	public double getMileage() {
		
		return mileage;
	}
	public void setMileage(double mileage) {
		this.mileage = mileage;
	}
	public void addMileage() {

        if (mileage < MAXMILES) {
            mileage++;
        } else {
            mileage = 0;
        }

        double driven = initialMileage - mileage;
        if (driven % MPG == 0) {
            fuelGauge.burnFuel();
        }
    }


	public String toString(){
		String str = "Your current amount of fuel is " + currentFuel;
		return str;
	}
}
