import javax.swing.JOptionPane;
// importing the JOPtionPane class
public class popLaunch {

	public static void main(String[] args) {
		double userInput; // local variable
		
		// instantiating objects
		pop pop1 = new pop();
		
		// asking the question for startNum
		userInput = Double.parseDouble(JOptionPane.showInputDialog("What is the population?"));
		pop1.setStartNum(userInput);
		// not allowing the population be less than 2
		while(userInput <= 1){
			userInput = Double.parseDouble(JOptionPane.showInputDialog("You entered an invalid number" +
		"try one that is a 2 or higher."));
			pop1.setStartNum(userInput);
			
		}
		
		// asking the question for avgDailyIncrease
		userInput = Double.parseDouble(JOptionPane.showInputDialog("What is the average increase of the"
				+ "population?"));
		pop1.setAvgDailyIncre(userInput);
		
		// not allowing the increase in population be a negative number
		while(userInput <= 0){
			userInput = Double.parseDouble(JOptionPane.showInputDialog("You entered an invalid number" +
		"try one that is a positive number."));
			pop1.setAvgDailyIncre(userInput);
			
		}
		
		// asking the question for getNumDaysMultiplied
		userInput = Double.parseDouble(JOptionPane.showInputDialog("What is the number of days of multiply?"));
		pop1.setNumDayMult(userInput);
		
		// not accepting a number less than 1
		while(userInput <= 0){
			userInput = Double.parseDouble(JOptionPane.showInputDialog("You entered an invalid number" +
		"try one that is a 1 or higher."));
			pop1.setStartNum(userInput);
			
		}
		
		// running these methods will trigger my JOptionPane in the other class page
		pop1.setCurrentPop();
		pop1.displayPopSize();
		

		System.exit(0);
	}

}
