
public class SavingAccount extends BankAccount {
	private boolean active;	// the account is active
	// this is a constructor and it uses the super()
	public SavingAccount(Double balance, double annualInterest) {
		super(balance, annualInterest);
	}
	// deciding on wheter or not the balance is active
	public void Active() {
		if(this.getBalance() < 25.0){
			this.active = false;
		} 
		else {
			this.active = true;
		}
}
  // deciciding if the account is active 
	public void withdraw(double amount) {
		this.Active();
		if(this.active == true){
			this.withdraw(amount);
		} 
		else {
			System.out.println("This account isn't active.");
		}
	}
	// deciding if account is active
	public void deposit(double amount) {
		this.Active();
		if(this.active == true){
			this.deposit(amount);
		} 
		else {
			if(this.getBalance() + amount > 25){
				this.deposit(amount);
		} 
			else {
				System.out.println("Account is not active");
			}
	  }
	}
	 // figuring fees upon withdraws
   public void monthlyProcess() {
		if(this.getNumWithdraw() > 4){
			double newCharge = this.getMonthlyServiceCharge() + (this.getNumWithdraw() * 
					(this.getNumWithdraw() - 4));
			this.setMonthlyServiceCharge(newCharge);
		}
		this.monthlyProcess();
	}
}
