import java.util.Scanner;

public class GeometryCalculator {

	public GeometryCalculator() {
		
	}
	
	// overloaded static methods
	
		// These are the static methods for the circle's area. The first is as a double
		// and the second is as an int.
		public static double circleArea(double dradius){
			return Math.PI * (dradius * dradius);// returning the calculation for the area
		}
		public static int circleArea(int iradius){
			return (int) (Math.PI * (iradius * iradius));// returning the calculation for the area
		}
		// These are the area calculations for the rectangle as a double and an int
		public static double rectangleArea(double dlength, double dwidth){
		return dlength * dwidth;// returning the calculation for the area
		}
		public static int rectangleArea(int ilength, int iwidth){
		return ilength * iwidth;// returning the calculation for the area
		}
		// These are the area calculations for an area of a triangle as a double and an int
		public static double triangleArea(double dbase, double dheight){
			return dbase * dheight * .5;// returning the calculation for the area
		}
		public static int triangleArea(int ibase, int iheight){
			return (int) ((int) ibase * iheight * .5);// returning the calculation for the area
		}
		
		public static void error(double userInputDouble){
			Scanner keyboard = new Scanner(System.in);
			System.out.println(" Error, please choose a number shown. \n" +
					"Type the matching number of the shape you selected. \n" +
							"#1 Circle #2 Rectangle #3 Triangle or #4 to quit.");
					userInputDouble = keyboard.nextDouble();// Putting the next line text as the userInput variable
		}

		public static void numError(double userInputDouble){
			Scanner keyboard = new Scanner(System.in);
			System.out.println(" Error, please restart and try again.");
					userInputDouble = keyboard.nextDouble();// Putting the next line text as the userInput variable
		}
}
