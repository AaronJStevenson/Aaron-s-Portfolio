import java.util.Scanner;

public class petLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		Pet pet1 = new Pet();
		
		System.out.print("Enter your pet's name.");
		pet1.setName(keyboard.nextLine());
		System.out.print("Enter what type of pet you have.");
		pet1.setType(keyboard.nextLine());
		System.out.print("Enter your pet's age.");
		pet1.setAge(keyboard.nextInt());
		
		System.out.println("Your pet " + pet1.getName() + " is a " + pet1.getType() + " and is " + pet1.getAge() + " years old.");
		
		
		
		keyboard.close();
		

	}

}
