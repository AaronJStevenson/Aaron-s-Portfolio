import java.util.Scanner;

public class testscoreLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Testscores students1 = new Testscores();
		
		System.out.println("Enter a test score");
		students1.setScore1(keyboard.nextDouble());
		
		System.out.println("Enter a second score");
		students1.setScore2(keyboard.nextDouble());
		
		System.out.println("Enter a third score");
		students1.setScore3(keyboard.nextDouble());
		
		//prints answer.. if using 
		System.out.printf("Your average score is an %.2f", students1.averageScore());

		keyboard.close();
	}

}
