
public class BankCharges {
	
	private double accountBalance;
	private int checksWritten;
	
	public BankCharges() {
		
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public int getChecksWritten() {
		return checksWritten;
	}

	public void setChecksWritten(int checksWritten) {
		this.checksWritten = checksWritten;
	}

	public double getServiceFees(){
		double fees = 0;
		
		 if(accountBalance < 400){
			 fees += 15;
			 // adds fees up
		 }
		 fees += 10;
		 
		 if(checksWritten < 20){
			 fees += (checksWritten * .10);
		 }else if(checksWritten >= 20 && checksWritten <= 39){
			 fees += (checksWritten * .08);
		 }else if(checksWritten >= 40 && checksWritten <= 59){
			 fees += (checksWritten * .06);
		 }else{
			 fees += (checksWritten * .04);
		 }
		
		return fees;
	}
}
