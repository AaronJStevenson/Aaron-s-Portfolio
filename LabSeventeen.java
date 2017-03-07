import java.util.Scanner;

public class LabSeventeen {

	public static void main(String[] args) {
		String name;
		double age;
		String city;
		String college;
		String profession;
		String animal;
		String petName;
		
		Scanner keyboard = new Scanner(System.in);
		
		// the process of user entering in the variables
		System.out.println("Enter your name.");
		name = keyboard.nextLine();
		
		System.out.println("Enter your age.");
		age = Double.parseDouble(keyboard.nextLine());
		
		System.out.println("Enter your city.");
		city = keyboard.nextLine();
		
		System.out.println("Enter your college.");
		college = keyboard.nextLine();
		
		System.out.println("Enter your profession.");
		profession = keyboard.nextLine();
		
		System.out.println("Enter your animal.");
		animal = keyboard.nextLine();
		
		System.out.println("Enter your pet name.");
		petName = keyboard.nextLine();
		
		// the print of of the whole story
		System.out.println("There was once a person named " + name + " who live in " + city + ". At the age of " + age + ", " + name + " went to college at " + college + "." + name + " graduated and went to work as a " + profession + ". Then, " + name + " adopted a(n) " + animal + " named " + petName + ". They both lived happily ever after!" );
	
		

	}

}
