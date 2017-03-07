
public class BankAccount {

	private double balance;
	private double interestRate;
	private double interest;
	public BankAccount() {
		// TODO Auto-generated constructor stub
	} // always put the throws in the header
	public BankAccount(double startBalance, double intRate)throws NegativeStartingBalance, NegativeInterestRate {
		if ( startBalance < 0)
			throw new NegativeStartingBalance(startBalance);
		if ( intRate < 0)
			throw new NegativeInterestRate(intRate);
		
		balance = startBalance;
		interestRate = intRate;
		interest = 0.0;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}

}
