
public class CargoShip extends Ship {
	private int cargoCapacity;	//Tonnage of cargo that ship can hold
	
	// no arg constructor
	public CargoShip() {
		this.cargoCapacity = 0;
	}
	// constructor passing fields
	public CargoShip(String name, String year, int cargoCap) { 
		super(name, year);
		this.cargoCapacity = cargoCap;
	}
	// displaying year name and capacity
	public String toString(){
		return "Name: " + this.getName() + "\nYear: " + this.getYear() 
		+  "\nCargo Capacity: " + this.cargoCapacity + " tons";
	}
 }
