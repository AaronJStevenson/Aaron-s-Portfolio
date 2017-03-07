// Practice
public class InventoryDemo {

	public static void main(String[] args) throws NegativePrice {
		InventoryItem item;
		
		// try to assign an empty string to the description field
		try{
			item = new InventoryItem("");
		}
		catch (IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
		throw new NegativePrice();
		/*
		// again try to assign an empty string to the description
		try{
			item = new InventoryItem("", 5);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
		
		// try to assign a negative number to the units field
		try {
			item = new InventoryItem("Wrench", -1);
		}
		catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}
*/
	}

}
