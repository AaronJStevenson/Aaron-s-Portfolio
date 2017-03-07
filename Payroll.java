public class Payroll {
	// private variables
	private String name;
	private int id;
	private double rate;
	private double hours;
	private double payed;
	public Payroll() {
	}
	public Payroll(String name, int Id){
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
