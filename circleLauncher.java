import java.util.Scanner;
public class circleLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		// creation of circle object
		Circle circleRadius = new Circle();
		
		System.out.println("What is the size of the circle's radius?");
		circleRadius.setRadius(keyboard.nextDouble());
		System.out.printf("The area of the circle is %.2f\n", circleRadius.getArea());
		System.out.printf("The diameter of the circle is %.2f\n", circleRadius.getDiameter());
		System.out.printf("The circumfrence of the circle is %.2f\n", circleRadius.getCircumfrence());
		
		
		

		keyboard.close();
	}

}
