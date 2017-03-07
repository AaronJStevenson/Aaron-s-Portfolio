
public class LabTwo {

	public static void main(String[] args) {
		String firstName = "Aaron";
		String middleName = "Jennings";
		String lastName = "Stevenson";
		
		char result = firstName.charAt(0);
		char result2 = middleName.charAt(0);
		char result3 = lastName.charAt(0);
		
		String init = result + "" + result2 + "" + result3; // turned a char into a string
		System.out.println(init);
		/*
		System.out.print(result);
		System.out.print(result2);
		System.out.print(result3);
		
		System.out.println(result2);
		System.out.println(result3);
		*/
		

	}

}
