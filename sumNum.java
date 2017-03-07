
public class sumNum {

	// instance fields
	private double userInput;
	 
	
	public sumNum(double UserInput) {
		// passing through the constructor
		this.setInput(UserInput);
	}

	// getter and setter methods
	public double getInput(){
		double sum = 0;// must be 0 so there is something add too
		// heres the loop to get the sum of all the integers
					for(int i = 0; i <= userInput; i++)
						sum += i;
						//System.out.println("These are the sum of all the integers: " + sum);
						
					
		
		return sum;
	}
	

	public void setInput(double userInput){
		this.userInput = userInput;
	}
}
