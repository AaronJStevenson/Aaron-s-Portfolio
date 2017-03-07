import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

// used my SearchArray

public class AccountModification {

	public static void main(String[] args) throws IOException  {
		// create an array of values
				final int SIZE = 18; // max size of array
				int[] tests = new int[SIZE];
				int index = 0; // initialize with 0
		
		int results; // results of search
		int account; 
		
		File file = new File("account.txt");
		Scanner inputFile = new Scanner(file);
		
		while (inputFile.hasNext() && index < tests.length){
			tests[index] = inputFile.nextInt();
			index++;
		}
		
		Scanner keyboard = new Scanner(System.in);
		// search the array for the value given
		System.out.println("Enter an account number for validation:");
		account = keyboard.nextInt();
		results = SearchArray.sequentialSearch(tests, account);
		
		// determine whether 100 was found in the array
		if(results == -1){
			System.out.println("This was an invalid account.");
		}
		else{
			// results holds the subscript of the value
			System.out.println("Your account was valid.");
	
			inputFile.close();
		}
	}

}