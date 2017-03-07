
public class InventoryItem {
	private String description;
	private int units;
	
	// no arg const
	public InventoryItem(){
		
	}

	public InventoryItem(String d) {
		if ( d.equals("")){
			throw new IllegalArgumentException("Description is an empty string. " );
		}
		description = d;
		units = 0;
		
	}
	
	public InventoryItem(String d, int u) throws NegativePrice{
		if (d.equals("")){
			throw new IllegalArgumentException("Description is an empty string.");
		}
		if (u < 0){
			
			throw new IllegalArgumentException("Units is negative.");
			
		}
		description = d;
		units = 0;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

}
