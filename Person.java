
public class Person {
	// these fields hold the name, address, and phone locations
	private String name;
	private String address;
	private String phoneNumber;
	// no arg constructor
	public Person(){
		
	}
	public Person(String name, String address, String phone) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phone;
	}
	// getters and setters to retrieve and return values
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	
}
