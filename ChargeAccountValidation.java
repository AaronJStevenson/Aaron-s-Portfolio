import java.util.Scanner;

// used my SearchArray

public class ChargeAccountValidation {

	public static void main(String[] args) {
		int results; // results of search
		int account; 
		Scanner keyboard = new Scanner(System.in);
		
		// create an array of values
		int[] tests = {5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 
				8080152, 4562555, 5552012, 5050552, 7825877, 1250255,
				1005231, 6545231, 3852085, 7576651, 7881200, 4581002};
		
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
		}
	}

}
