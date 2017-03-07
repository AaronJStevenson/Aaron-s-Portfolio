import java.util.Scanner;

public class ArrayDemo1 {

	public static void main(String[] args) {
		
		final int NUM_EMPLOYEES = 3; // total number of employees
		
		int[] hours = new int[NUM_EMPLOYEES]; // this is the array called hours, it is as long as the num of employees
	
		Scanner keyboard = new Scanner(System.in);// creating the scanner class
		
		// asking the question for the amount of hours worked by the 3 employees.
		System.out.println("Enter in the hours worked by " + NUM_EMPLOYEES + " employees.");
		/*
		// this asks the question for the hours and enter in the value into to the hours array element 0
				System.out.println("Employee 1: ");
				hours[0] = keyboard.nextInt();
		
		// this asks the question for the hours and enter in the value into to the hours array element 1
				System.out.println("Employee 2: ");
				hours[1] = keyboard.nextInt();
				
		// this asks the question for the hours and enter in the value into to the hours array element 2
				System.out.println("Employee 3: ");
				hours[2] = keyboard.nextInt();
				*/
		// this is a for loop thats asking the question 3 time to input the data in the array
		// can be int i or int Index
		for(int i = 0; i < 3; i++){
			System.out.println("Employee " + (i + 1) + ":");
			hours[i] = keyboard.nextInt();
		}
		
		
		// display the values in the array
				System.out.println("The hours you entered are: ");
				// this is a for loop displaying the output
				for (int i = 0; i < 3; i++){
					System.out.println(hours[i]);
				}
				/*
				System.out.println(hours[0]);
				System.out.println(hours[1]);
				System.out.println(hours[2]);
		*/
		
		
	}

}
