import java.util.Scanner;

/**
 * This program demonstrates passing arguments to a superclass constructor
 * @author Wendy Stevenson
 *
 */
public class CubeDemo {

	public static void main(String[] args) {
		double length; 
		double width;
		double height;

		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter the following dimensions of a cube:");
		System.out.println("Length:");
		length = keyboard.nextDouble();
		System.out.println("Width:");
		width = keyboard.nextDouble();
		System.out.println("Height:");
		height = keyboard.nextDouble();
		
		Cube myCube = new Cube(length, width, height);
		
		System.out.println();
		System.out.println("Here are the properties of the Cube!");
		System.out.println("Base area: " + myCube.getArea());
		System.out.println("Surface Area: " + myCube.getSurfaceArea());
		System.out.println("Voluem: " + myCube.getVolume());
	
	}

}
