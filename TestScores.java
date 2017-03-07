
public class TestScores  {
	// array of test scores
		private double[] scores; 
		
		// constructor accepts an array as an argument 

	public TestScores(double[] s) throws NotValidTestScore {
		// created a new array the the same as scores
				scores = new double[s.length];
				
				// copy the values in scores to testScores
				for (int index = 0; index < s.length; index++){
					scores[index] = s[index];
					
					
				}
				
	}
	
	// method for the average test score
	public double scoreAverage(){
		double average = 0;// the field for the average test
		double total = 0;// the accumalator for the total of all scores
		
		for (int index = 0; index < scores.length; index++){
			total += scores[index];
			}
		// calculating the average 
		average = total / scores.length;
		
		
		return average;// returns the test score average
	}

}
