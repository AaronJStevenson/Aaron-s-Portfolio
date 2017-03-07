
public class ArrayInitialization {

	public static void main(String[] args) {
		final int MONTHS = 12; // Number of months
		
		// create and initialize an array
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// this for loop iterates for 0 - 11, meaning it iterates 12 times one for each month and adds
		// the day each month has to them.
		for(int index = 0; index < MONTHS; index++){
			System.out.println("Month " + (index +1) + " has " + days[index] + " days.");
		}

	}

}
