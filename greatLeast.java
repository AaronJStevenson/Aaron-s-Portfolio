import java.util.Scanner;
// importing in the scanner class to read input

public class greatLeast {
	// instance fields
	private int value; 	
	private int smallest;
	private int largest;
	
	//constructor
	public greatLeast() {
		
	}

	
	public void getValues() {
		Scanner keyboard = new Scanner(System.in);	
		// Assign first value as smallest
				
				// Instantiating object
		smallest = value;
				
				while(value != -99){							
					System.out.print("Enter -99 to close or enter another number: ");			
					value = keyboard.nextInt();
					if(value != -99 && value > smallest){
						if (value > smallest && value > largest){
							largest = value;
						}
						else{
							smallest = value;					
						}		
					}
				}
		
	}
	public int getValue(){
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public int getSmallest() {
		
		return smallest;
	}

	public void setSmallest(int smallest) {
		this.smallest = smallest;
	}

	public int getLargest() {
		return largest;
	}

	public void setLargest(int largest) {
		this.largest = largest;
	}

	
}
