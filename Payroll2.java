public class Payroll2 {
	// private variables
	private String name; // name of employee
	private int id; // their id num
	private double rate; // their rate of pay
	private double hours; // the hours they worked
	private double payed; // what they were payed
	
	public Payroll2(){
		
	}
	// constructor that throws exceptions
	public Payroll2(String name, int idNum, double hourlyRate, int numHours) throws EmptyNameException, InvalidNumberException, 
	InvalidHoursException, InvalidPayRate{
		
		this.name = name;
		if(this.name == "")
			throw new EmptyNameException();
		this.id = idNum;
		if(this.id < 0)
			throw new InvalidNumberException();
		this.rate = hourlyRate;
		if(this.rate < 0 || this.rate > 25)
			throw new InvalidPayRate();
		this.hours = numHours;
		if(this.hours < 0 || this.hours > 84)
			throw new InvalidHoursException();
	}
	public Payroll2(String name, int Id){
		this.name = "";
		this.id = 0;	
	}
	// these are my getters and setters for my variables
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int Id) {
		this.id = Id;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double Rate) {
		this.rate = Rate;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double Hours) {
		this.hours = Hours;
	}
	public void setCalculate(double payed){
		this.hours = 0;
		this.rate = 0;
	}
	public double getCalculate(){
		return hours * rate;
	}
}
