import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DemonstrationDemo {

	public static void main(String[] args) throws FileNotFoundException {
		String userInputString;
		int numCds = 0;
		String filename = "c:\\users\\aaron\\desktop\\cdFile.txt";
		Scanner keyboard = new Scanner(System.in);
		PrintWriter output = new PrintWriter(filename);
		for(int i = 0; i < 5; ++i){
			System.out.println("Enter a CD Name: ");
			userInputString = keyboard.nextLine();
			output.println(userInputString);
			numCds++;
		}
		output.println("Total num of CDs in the collection is");
		keyboard.close();
		output.close();
		
		CD album1 = new CD("Bat out of hell", "Meatloaf", "Number 3", "Number 4", "Number 5" + CD(cd));
		CDcollection  collection = new CDcollection(album1);
		System.out.println(collection);
	}

}
