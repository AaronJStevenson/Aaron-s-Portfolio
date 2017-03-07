import javax.swing.JOptionPane;

public class pop {
	// instance fields
	private double startNum;
	private double avgDailyIncre;
	private double numDayMult;
	private double currentPop;
	// constructor
	public pop() {
		// TODO Auto-generated constructor stub
	}
	// getters and setters that get and return data
	public double getStartNum() {
		return startNum;
	}
	public void setStartNum(double startNum) {	
		this.startNum = startNum;
	}
	public double getAvgDailyIncre() {
		return avgDailyIncre;
	}
	public void setAvgDailyIncre(double avgDailyIncre) {
		this.avgDailyIncre = avgDailyIncre;
	}
	public double getNumDayMult() {
		return numDayMult;
	}
	public void setNumDayMult(double numDayMult) {
		this.numDayMult = numDayMult;
	}
	// calculating the population
	public double getCurrentPop() {
		this.currentPop = (((double)this.currentPop * (double)this.avgDailyIncre) + (double) this.currentPop);
		return this.currentPop;
	}
	public void setCurrentPop() {
		this.currentPop = this.startNum;
		for(int i = 1; i < this.numDayMult; i++){
		
		this.currentPop = getCurrentPop();
		}
	}
	// Running the results of my calculations
	public void displayPopSize(){
		String myString = "";
		myString += "******Species Population******* \n" + "Starting Population: " + this.startNum + "\n" +
		"Average Population Increase: " + this.avgDailyIncre + "\n" + "Number of days multiplied: " + this.numDayMult + "\n" 
		+ "Ending population: " + this.getCurrentPop();
		JOptionPane.showMessageDialog(null, myString);
	}

}
