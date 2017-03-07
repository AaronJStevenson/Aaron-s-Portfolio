
public class PreferredCustomer extends Customer {

    double DiscountRate = .00;// this is the discount rate field
    double AmountSpent = 00;// this is the amount they spent 
    // no arg constructor
	public PreferredCustomer() {
		// TODO Auto-generated constructor stub
	}
	// constructor accepting fields in the parameter
	public PreferredCustomer(String name, String address, String phone, String cusNum,
			String eMail, double DiscountRate, double AmountSpent) {
	super(name, address, phone, cusNum, eMail);
	this.DiscountRate = DiscountRate;
	this.AmountSpent = AmountSpent;
	}

	// method used to get discount rate
	// and the rest of the getters and setters
	public double getDiscountRate() {
		if(AmountSpent >= 500 && AmountSpent < 1000)
	    {
	        DiscountRate = .05;
	    }
		else if(AmountSpent >= 1000 && AmountSpent < 1500)
	    {
	        DiscountRate = .06;
	    }
		else if(AmountSpent >= 1500 && AmountSpent < 2000)
	    {
	        DiscountRate = .07;
	    }
		else if(AmountSpent >= 2000)
	    {
	        DiscountRate = .1;
	    }
		return DiscountRate;
	}

	public void setDiscountRate(double discountRate) {
		DiscountRate = discountRate;
	}

	public double getAmountSpent() {
		return AmountSpent;
	}

	public void setAmountSpent(double amountSpent) {
		AmountSpent = amountSpent;
	}
	
	

}
