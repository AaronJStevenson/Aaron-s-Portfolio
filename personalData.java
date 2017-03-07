
public class personalData {
	//field
	private String name;
	private String address;
	private int age;
	private String phone;
	// constructor
	public personalData() {
	}
	// methods
	public void setName(String Name){
		this.name = Name;
	}
	public String getName(){
		return name;
	}
	//------------------------------------------------
	public void setAddress(String Address){
		this.address = Address;
	}
	public String getAddress(){
		return address;
	}
	//--------------------------------------------------
	public void setAge(int Age){
		this.age = Age;
	}
	public int getAge(){
		return age;
	}
	//-------------------------------------------------
	public void setPhone(String Phone){
		this.phone = Phone;
	}
	public String getPhone(){
		return phone;
	}
}
