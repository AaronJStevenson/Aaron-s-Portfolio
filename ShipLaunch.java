
public class ShipLaunch {

	public static void main(String[] args) {
		
		Ship[] shipArray = new Ship[3]; // array of ships
		//instantiating ships
		shipArray[0] = new Ship("The Abatross", "1890");
		shipArray[1] = new CruiseShip("The Nina", "1491", 400);
		shipArray[2] = new CargoShip("The Pinta", "1490", 450);
		
		// displaying the ships
		System.out.println(shipArray[0]);
		System.out.println("\n");
		System.out.println(shipArray[1]);
		System.out.println(shipArray[2]);

	}

}
