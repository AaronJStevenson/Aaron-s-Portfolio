
public abstract class BankAccount {

	private double balance;	// account balance
	private int numberDeposits; // number of deposits
	private int numberWithdraws; // number of withdraws
	private double annualInt; // annual interest
	private double monthlySerCharge; // monthly service charge
	
	// default or no arg constructor
	public BankAccount() {	
	}
	// passing balance and interest parameters through the constructor
	public BankAccount(Double bal, double annualInterest) {
		this.balance = bal;
		this.annualInt = annualInterest;
		this.numberDeposits = 0;
		this.numberWithdraws = 0;
		this.monthlySerCharge = 0;
	}	
	// depositing into the account
	public void Deposit(double amount){
		this.balance += amount;
		this.numberDeposits++;
	}	
	// withdrawing from account
	public void Withdraw(double amount){
		this.balance -= amount;
		this.numberWithdraws++;
	}	
	// calculating the interest
	public void CalcInterest(){
		double monthlyRate = this.annualInt / 12;
		double monthlyInterest = this.balance * monthlyRate;
		this.balance += monthlyInterest;
	}	
	// figuring the monthly charge and whats coming going from the account
	public void monthlyProcess(){
		this.balance -= this.monthlySerCharge;
		this.CalcInterest();
		this.numberDeposits = 0;
		this.numberWithdraws = 0;
	}
	// getters and setters
	public double getBalance() {
		return balance;
	}	
	public void setBalance(double balance) {
		this.balance = balance; // setting the balance
	}	
	public int getNumDeposit() {
		return numberDeposits; // returning deposit
	}	
	public void setNumDeposit(int numberDep) {
		this.numberDeposits = numberDep; // setting the deposit
	}	
	public int getNumWithdraw() {
		return numberWithdraws; // returning the withdraw
	}
	public void setNumWithdraw(int numWithdraws) {
		this.numberWithdraws = numWithdraws; // setting the withdraw
	}	
	public double getAnnualInterest() {
		return annualInt; // getting the annual interest
	}
	public void setAnnualInterest(double annualInterest) {
		this.annualInt = annualInterest; // setting the annual interest
	}	
	public double getMonthlyServiceCharge() {
		return monthlySerCharge; // returning the monthly charge
	}
	public void setMonthlyServiceCharge(double serviceCharge) {
		this.monthlySerCharge = serviceCharge; // setting the monthoy charge
	}
}
