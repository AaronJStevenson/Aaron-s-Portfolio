import java.io.IOException;

public class class7Launcher {

	public static void main(String[] args) throws IOException {
		int[] array = null;
		
		int[] array2 = new int[3]; // new array to display the decrypted version of the first array
		Number7.readFirst("challenge.txt", array);
		System.out.println("Encryption");
	Number7.writeArray("challenge1.txt", array2);
	System.out.println("Decrpyting");
	Number7.readSecond("challenge.txt", array2);
	System.out.println("Your array numbers are ");
	for(int i = 0; i < array2.length; i++){
		System.out.println(array2[i] + "\t");
	}
	}
}
