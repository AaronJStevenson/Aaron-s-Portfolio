import javax.swing.JOptionPane;

public class TestScores {

	// fields
	private double testOne;
	private double testTwo;
	private double testThree;
	
	
	// constructor
	public TestScores(double testOne, double testTwo, double testThree) {
		testOne = 0;
		testTwo = 0;
		testThree = 0;
		
	}

	public TestScores() {
		
	}

	public double getTestOne() {
		return testOne;
	}

	public void setTestOne(double testOne) {
		this.testOne = testOne;
	}

	public double getTestTwo() {
		return testTwo;
	}

	public void setTestTwo(double testTwo) {
		this.testTwo = testTwo;
	}

	public double getTestThree() {
		return testThree;
	}

	public void setTestThree(double testThree) {
		this.testThree = testThree;
	}
	public String getAverage(){
		String grade = "";
		String average = ((testOne + testTwo + testThree) / 3) + grade;
		
		double userInput = 0;
		
		if(userInput >= 90 && userInput <= 100){
			grade += "A";
		}
		else if(userInput >= 80 && userInput < 90){
			grade += "B";
		}
		else if(userInput >= 70 && userInput < 80){
			grade += "C";
		}
		else if(userInput >= 60 && userInput < 70){
			grade += "D";
		}
		else if(userInput > 60){
			grade += "";
		}
		/*if(average >= 90 && average <= 100){
			JOptionPane.showMessageDialog(null,average = (testOne + testTwo + testThree) / 3);	
		}
		*/
		return average;
	}

	
}

