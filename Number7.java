import java.io.*;

public class Number7 {
	
	public static void readFirst(String filename, int[] array) throws IOException{
		FileInputStream fstream = new FileInputStream(filename);
		DataInputStream inputfile = new DataInputStream(fstream);
		
		
		for(int i = 0; i < array.length; i++){
			array[i] = inputfile.readInt();
			array[i] = array[i];
		}
		inputfile.close();
	}

	public static void writeArray(String filename, int[] array) throws IOException{
		FileOutputStream fstream = new FileOutputStream(filename);
		DataOutputStream outputfile = new DataOutputStream(fstream);
		
		
		for(int i = 0; i < array.length; i++){
			outputfile.writeInt(10 + array[i]);
		}
		outputfile.close();
	}

	public static void readSecond(String filename, int[] array) throws IOException{
		FileInputStream fstream = new FileInputStream(filename);
		DataInputStream inputfile = new DataInputStream(fstream);
		
		
		for(int i = 0; i < array.length; i++){
			array[i] = inputfile.readInt();
			array[i] = array[i] - 10;
		}
		inputfile.close();
	}
}
