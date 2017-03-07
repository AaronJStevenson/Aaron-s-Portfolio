import java.lang.reflect.Array;
import java.util.Scanner;

public class TestScoreLauncher {

	
	public static void main(String[] args) throws NotValidTestScore {
		
		final int TESTTOTAL = 5; // this is a constant that will not change for the total of tests
		
		// creating an array to hold the test scores
		double[] testScores = new double[TESTTOTAL];
		
		getValues(testScores);
		
		TestScores test = new TestScores(testScores);
		
		// this displays the average
		System.out.println("The average of the test scores is: " + test.scoreAverage() + "%.");

	}

	private static void getValues(double[] testScores) throws NotValidTestScore {
		// creating the scanner class to read keyboard input
		Scanner keyboard = new Scanner(System.in);
		
		//System.out.println("Enter in the test scores:");
		// get the test scores for each test
		
		// asking the question to insert test scores
		for (int index = 0; index < testScores.length; index++){
			
			System.out.println("Test " + (index + 1) + ": ");
			testScores[index] = keyboard.nextDouble();
			// this while loop will not alow a test score higher than 100 or lower than a 0
			if(testScores[index] < 0 || testScores[index] > 100);
			throw new NotValidTestScore();
			// this throws the exception 
			
			//while (testScores[index] < 0 || testScores[index] > 100){
			//System.out.println("Test " + (index + 1) + ": ");
			//testScores[index] = keyboard.nextDouble();
			}// end of if
			
			}// end of for
			
		
		
	}


