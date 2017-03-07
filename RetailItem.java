
public class RetailItem {

	private String item;
	private String description;
	private int units;
	private double price;
	
	public RetailItem() {
		
	}
	
	public void setItem(String Item){
		this.item = Item;
	}
	public String getItem(){
		return item;
	}
	//---------------------------------------------------
	public void setDescription(String Description){
		this.description = Description;
	}
	public String getDescription(){
		return description;
	}
	//---------------------------------------------------

	public void setUnits(int Units){
		this.units = Units;
	}
	public int getUnits(){
		return units;
	}
	//-----------------------------------------------------
	public void setPrice(double Price){
		this.price = Price;
	}
	public double getPrice(){
		return price;
	}
	//-----------------------------------------------------
	
	
}
