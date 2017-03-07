import javax.swing.JOptionPane;

public class NumSec {

	// fields
	private double seconds;
	
	// constructor
	public NumSec() {
		

}
// getters and setters
	public double getSeconds() {
		return seconds;
		// we dont mess with this because the input we put in is the amount of seconds
	}

	public void setSeconds(double seconds) {
		this.seconds = seconds;
	}
	
	public double getMinutes(){
		double minutes = 0;
		// saying to run if seconds is greater than 60
		if(seconds >= 60){
			minutes = seconds / 60;
			//JOptionPane.showInputDialog("This equals " + getMinutes() + " minutes.");
		}
		else{
			JOptionPane.showMessageDialog(null, "You did not put in a valid number of seconds.");
		}// this is if the number of seconds is not greater than 60 run 
		
		return minutes;
	}
	public double getHours(){
		double hours = 0;
		if(seconds >= 3600){
			hours = seconds / 3600;
			//JOptionPane.showInputDialog("This equals " + getHours() + " hours.");
		}
		return hours;
	}
	public double getDays(){
		double days = 0;
		if(seconds >= 86400){
			days = seconds / 86400;
			//JOptionPane.showInputDialog("This equals " + getDays() + " days.");
		}
		return days;
	}
	
	
}