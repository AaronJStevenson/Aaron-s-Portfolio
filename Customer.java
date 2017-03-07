
public class Customer extends Person {
	private String customerNumber; // customer number
	private String email; // customer e mail

	// no arg constructor
	public Customer (){
		
	}
	public Customer (String name, String address, String phone, String cusNum, String eMail)  {
		super(name, address, phone);
	     this.customerNumber = cusNum;
	      this.email = eMail;
	   }
	
	public String getCustomerNumber() {
		return customerNumber;
	}
	
	public String geteMail() {
		return email;
	}
	
	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}

	public void seteMail(String eMail) {
		this.email = eMail;
	}

}
