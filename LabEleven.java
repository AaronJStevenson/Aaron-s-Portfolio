import java.util.Scanner;

public class LabEleven {

	public static void main(String[] args) {
		double female;
		double male;
		
		// this is stating what is typed will be place in the variable
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many female students are in class?");
		female = Double.parseDouble(keyboard.nextLine());
		
		// this is stating what is typed will be place in the variable
		System.out.println("How many male students are in class?");
		male = Double.parseDouble(keyboard.nextLine());
		
		// this is the correct math to demonstrate the full size of the class room
		// and then the multiplications to make the percentages 
		double classRoom = female + male;
		double femPer = female / classRoom;
		double malPer = male / classRoom;
		
		// these print out the calculations from above and help make the percentages correct
		System.out.println("The size of the class is " + classRoom + " students.");
		System.out.println("The percentage of females in the class is " + femPer * 100);
		System.out.println("The percentage of males in the class is " + malPer * 100);
		
		keyboard.close();
		

	}

}
