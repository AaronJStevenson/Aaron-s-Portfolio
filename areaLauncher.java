import java.util.Scanner;// importing the Scanner class

public class areaLauncher {

	public static void main(String[] args) {
		double dradius = 0;// circle's radius as a double
		int iradius = 0;// circle's radius as an int
		
		double dlength = 0;// rectangle's length as a double
		double dwidth = 0;// rectangle's width as a double
		
		int ilength = 0;// rectangle's length as an int
		int iwidth = 0;// rectangle's width as an int
		
		double dheight = 0;// cylinder's height as a double
		int iheight = 0;// cylinder's height as an int
		// Instantiating the Scanner object
		Scanner keyboard = new Scanner(System.in);// this is the object for the scanner
		
		System.out.println("What is the circles radius as a double?");// asking the question for the circle radius as a double
		dradius = keyboard.nextDouble();// turning the next line typed into the double radius 
		System.out.println("The area of the circle is " + Area.circleArea(dradius));// displaying the area as a double
		
		System.out.println("What is the circles radius as an int?");// asking the question for the circle radius as a int
		iradius = keyboard.nextInt();// turning the next line typed into the int radius 
		System.out.println("The area of the circle is " + Area.circleArea(iradius));// displaying the area as an int
		
		System.out.println("What is the rectangle's width as a double?");// asking the question for the rectangle's width as a double
		dwidth = keyboard.nextDouble();// turning the next line typed into the double width
		System.out.println("What is the rectangle's lenght as a double?");// asking the question for the rectangle's length as a double
		dlength = keyboard.nextDouble();// turning the next line typed into the double length
		System.out.println("The area of the rectangle is " + Area.rectangleArea(dlength, dwidth));// displaying the area as a double
		
		System.out.println("What is the rectangle's width as a int?");// asking the question for the rectangle's width as a int
		iwidth = keyboard.nextInt();// turning the next line typed into the int width
		System.out.println("What is the rectangle's lenght as a int?");// asking the question for the rectangle's length as a int
		ilength = keyboard.nextInt();// turning the next line typed into the int length
		System.out.println("The area of the rectangle is " + Area.rectangleArea(ilength, iwidth));// displaying the area as an int
		
		System.out.println("What is the cylinder's height as a double?");// asking the question for the cylinder's height as a double
		dheight = keyboard.nextDouble();// turning the next line typed into the double height
		System.out.println("What is the cylinder's radius as a double?");// asking the question for the cylinder's radius as a double
		dradius = keyboard.nextDouble();// turning the next line typed into the double radius
		System.out.println("The area of the cylinder is " + Area.cylinderArea(dradius, dheight));// displaying the area as a double
		
		System.out.println("What is the cylinder's height as a int?");// asking the question for the cylinder's height as a int
		iheight = keyboard.nextInt();// turning the next line typed into the int height
		System.out.println("What is the cylinder's radius as a int?");// asking the question for the cylinder's radius as a int
		iradius = keyboard.nextInt();// turning the next line typed into the int radius 
		System.out.println("The area of the cylinder is " + Area.cylinderArea(iradius, iheight));// displaying the area as an int

	}

}
