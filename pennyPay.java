import javax.swing.JOptionPane;

public class pennyPay {

	// instance fields
	private double salary;
	private double time;
	private double totalSalary;
	
	
	// public constructor
	public pennyPay() {
		
	}
	// getters and setters
	public double getSalary() {
		
		double Wage = .01;
		// loop to figure the salary
		for(int i = 0; i <= time; i++){
			
			
			salary = (Wage += i) / 100;
			
		}
		
		return salary;
	}
	public void setSalary(double Salary) {
		salary = Salary;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double Time) {
		this.time = Time;
	}
	public double getTotalSalary(){
		
		
		return totalSalary;
	}
	public void setTotalSalary(double totalSalary){
		this.totalSalary = totalSalary;
	}

}
