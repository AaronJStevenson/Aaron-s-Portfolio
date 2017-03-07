
public class itemLauncher {

	public static void main(String[] args) {
		RetailItem[] items = new RetailItem[3];
		for (int i = 0; i < items.length; i++){
			// this is saying that items equals i, to start at 0 because arrays always start at 0
			// also that items is equal to one RetailItem() object
			items[i] = new RetailItem();
			
		}
		// this is the group of arrays with their selected values 
				items[0].setItem("Item #1");
				items[0].setDescription("Jacket\t"); 
				items[0].setUnits(12);
				items[0].setPrice(59.95);
				
				items[1].setItem("Item #2");
				items[1].setDescription("Designer Jeans"); 
				items[1].setUnits(40);
				items[1].setPrice(34.95);
				
				items[2].setItem("Item #3");
				items[2].setDescription("Shirt\t"); 
				items[2].setUnits(20);
				items[2].setPrice(24.95);
				
				
				// these escape sequences \t are used to create the appropriate table and spacing
				System.out.println("Description\t\t\t\t\tUnits On Hand\t\tPrice");
				System.out.println("-------------------------------------------------------------------------------------");
				
				// this is printing the array for the items 
				for (int i = 0; i < items.length; i++){
					System.out.print(items[i].getItem() + "\t\t");
					System.out.print(items[i].getDescription() + "\t\t\t\t");
					System.out.print(items[i].getUnits() + "\t\t");
					System.out.println(items[i].getPrice());
					
					
					
				}
			}

			
		}
