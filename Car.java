
public class Car {
	
	// if using an launcher class, must put variables here as global so the laucher can access them. also make private
	private int yearModel;
	private String make;
	private int speed;
	
	// this is the constructor making yearModel, make and speed equal to 0 or nothing
	public Car(){
		
	}
	public Car(int yearModel, String make) {
		this.yearModel = 0;
		this.make = "";
		this.speed = 0;
	}
	
	
	
	// these methods are accessors that alter the variables in the constructor
	public void accelerate(){
		this.speed += 5;	
	}
	
	public void brake(){
		this.speed -= 5;
	}
	
	// this is setting the variables to chose values
	public void setYear(int year){
		this.yearModel = year;
	}
	public int getYear(){
		return yearModel;
	}
	
	public void setMake(String Make){
		this.make = Make;
	}
	public String getMake(){
		return make;
	}
	
	public void setSpeed(int Speed){
		this.speed = Speed;
	}
	public int getSpeed(){
		return speed;
	}
	
}
