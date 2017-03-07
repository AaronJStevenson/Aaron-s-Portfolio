public class ParkedCar {
	private String make; //make of vehicle
	private String model; 			// model of vehicle
	private String licenseNum;	   //  license number of vehicle
	private double numMinutesParked; //  number of minutes the vehicle has been parked
	
	/**
	 * no arg constructor to initialize
	 */
	public ParkedCar() {
		this.make = "";
		this.model = "";
		this.licenseNum = "";
		this.numMinutesParked = 0.0;
	}

	public ParkedCar(String make, String model, String licenseNum, double numMinutesParked) {
		this.make = make;
		this.model = model;
		this.licenseNum = licenseNum;
		this.numMinutesParked = numMinutesParked;
	}
	
	//copy of constructor
	public ParkedCar(ParkedCar object2) {
		this.make = object2.make;
		this.model = object2.model;
		this.licenseNum = object2.licenseNum;
		this.numMinutesParked = object2.numMinutesParked;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getLicenseNum() {
		return licenseNum;
	}

	public void setLicenseNum(String licenseNum) {
		this.licenseNum = licenseNum;
	}

	public double getNumMinutesParked() {
		return numMinutesParked;
	}

	public void setNumMinutesParked(double numMinutesParked) {
		this.numMinutesParked = numMinutesParked;
	}

	@Override
	public String toString() {
		String str;
		str = "Make: " + this.make + "\n " + 
				"Model: " + this.model + "\n " + 
				"License Number: " + this.licenseNum + "\n " + 
				"Number of minutes parked: " + this.numMinutesParked;
		return str;
	}

	
}
