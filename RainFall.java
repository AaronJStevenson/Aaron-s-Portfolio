
public class RainFall {
	
	// the testScores field is a variable that will reference an array of test score
	private double[] rainFall;
	
	/**
	 * The constructor accepts an array of test scores as an argument
	 * @return 
	 */
	public RainFall(double[] rain) { // the double[] rain is the argument
		// assign the array argument to the testScores field
		rainFall = rain;
	}
	
	/**
	 * The getLowestRainFall method returns the lowest test score
	 */
	
	public double getLowestRainFall(){
		double lowest; // hold the lowest amount of rain 
		
		// get the firest  subscript in the array
		lowest = rainFall[0];
		
		// getting the lowest asmount of rain 
		for (int index = 1; index < rainFall.length; index++){
			if(rainFall[index] < lowest)
				lowest = rainFall[index];
		}
		// return the lowest amount of rain
		return lowest;
	}
	
	public double getHighestRainFall(){
		double highest; // hold the lowest amount of rain 
		
		// get the first subscript in the array
		highest = rainFall[0];
		
		// getting the highest amount of rain 
		for (int index = 1; index < rainFall.length; index++){
			if(rainFall[index] > highest)
				highest = rainFall[index];
		}
		// return the highest amount of rain
		return highest;
	}
	
	/**
	 * The getAverage method returns the average amount of rainfall
	 * 
	 */
	
	public double getAverage(){
		double total = 0; // to hold the value of the total rain
		double average; // holds the average value
		
		// First calculate the total of rain
		for(double rain : rainFall)
			total += rain; // this is our accumulator
		
		// get the adjusted average
		average = total / (rainFall.length - 1);
	
	// return the adjusted average
	return average;
	}
	// gathering the total rainfall of the year
	public double getTotalRainFall(){
		double total = 0;
		for(double rain : rainFall)
			total += rain;
		
		return total;
	}
}
