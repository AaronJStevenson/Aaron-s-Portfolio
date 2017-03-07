import java.util.Scanner;

/**
 * This program demonstrates the GradedActivity class
 * @author Wendy Stevenson
 *
 */
public class EmployeeLaunch {

	public static void main(String[] args) {
		double testScore; // holds the test score 
		
		// creates the scanner object to read keyboard 
		Scanner keyboard = new Scanner(System.in);
		
		// create a GradedActivity object
		GradeActivity grade = new GradeActivity();
		
		// get the test score from the user
		System.out.print("Enter a numeric test score: ");
		testScore = keyboard.nextDouble();
		
		//set the GRadActivity object's score
		grade.setScore(testScore);
		
		// display the letter grade for that score;
		System.out.println("The grade for that test is " + grade.getGrade());
				

	}

}
