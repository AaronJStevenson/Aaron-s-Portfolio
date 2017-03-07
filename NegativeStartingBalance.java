
public class NegativeStartingBalance extends Exception{

	// no arg
	public NegativeStartingBalance() {
		super("Error: Negative starting balance.");
	}

	public NegativeStartingBalance(double amount){
		super("Error: Negative starting balance: " + amount);
	}
}
