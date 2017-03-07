
public class dataLauncher {

	public static void main(String[] args) {
		// Array
				personalData[] information = new personalData[3];
				for (int i = 0; i < information.length; i++){
					// this is saying that employees equals i, to start at 0
					information[i] = new personalData();
				}
		// this is the person info in the array
				information[0].setName("Aaron Stevenson");
				information[0].setAddress("847 North 1st street"); // do not need parenthesis because its an int not a String
				information[0].setAge(25);
				information[0].setPhone("618-979-2999");
				
				information[1].setName("Bret Schulte");
				information[1].setAddress("980 North 9th street"); // do not need parenthesis because its an int not a String
				information[1].setAge(25);
				information[1].setPhone("618-980-4124");
				
				information[2].setName("Patrick Forhan");
				information[2].setAddress("1048 North 11th street"); // do not need parenthesis because its an int not a String
				information[2].setAge(23);
				information[2].setPhone("618-970-2979");
				
				for (int i = 0; i < information.length; i++){
					System.out.print(information[i].getName() + "\t\t");
					System.out.print(information[i].getAddress() + "\t\t");
					System.out.print(information[i].getAge() + "\t\t");
					System.out.println(information[i].getPhone());
					
					
					
				}

	}

}
