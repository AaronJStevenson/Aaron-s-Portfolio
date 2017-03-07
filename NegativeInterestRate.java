
public class NegativeInterestRate extends Exception{

	public NegativeInterestRate() {
		super("Error: Negative interest rate");
	}
	
	public NegativeInterestRate(double amount){
		super("Error: negative interest rate: " + amount);
	}

}
