
public class RetailItem {

	private String item; // holds value of item
	private String description; // hold the description of item
	private int units; // amount of units of item
	private double price; // the price of the item
	// no arg constructor
	public RetailItem() {
		
	}
	
	public void setItem(String Item){
		this.item = Item; // setting values
	}
	public String getItem(){
		return item;// getting values
	}
	//---------------------------------------------------
	public void setDescription(String Description){
		this.description = Description;// setting values
	}
	public String getDescription(){
		return description;// getting values
	}
	//---------------------------------------------------

	public void setUnits(int Units){
		this.units = Units;// setting values
	}
	public int getUnits(){
		return units;// getting values
	}
	//-----------------------------------------------------
	public void setPrice(double Price){
		this.price = Price;// setting values
	}
	public double getPrice(){
		return price; // getting values
	}
	//-----------------------------------------------------
	
	
}
