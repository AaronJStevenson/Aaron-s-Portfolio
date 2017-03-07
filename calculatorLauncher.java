import java.util.Scanner;


public class calculatorLauncher {

	public static void main(String[] args) {
		double dradius = 0;// circle's radius as a double
		int iradius = 0;// circle's radius as an int
		
		double dlength = 0;// rectangle's length as a double
		double dwidth = 0;// rectangle's width as a double
		
		int ilength = 0;// rectangle's length as an int
		int iwidth = 0;// rectangle's width as an int
		
		double dbase = 0;// triangle base as a double
		int ibase = 0;// triangle base as an int
		
		double dheight = 0;// triangle height as a double
		int iheight = 0;// triangle height as an int
		
		double userInputDouble = 0;// these turn the input into variables
		int userInputInt = 0;
		
		// scanner class object to read the keyboard
		Scanner keyboard = new Scanner(System.in);
		//Asking the question
		System.out.println("Please choose the area you wish to calculate. \n" +
		"Type the matching number of the shape you selected. \n" +
				"#1 Circle #2 Rectangle #3 Triangle or #4 to quit.");
		userInputDouble = keyboard.nextDouble();// puting the next line text as the userInput variable
		// This ensures the the number they choose is one that is equal to one of the shapes
		if(userInputDouble > 0 && userInputDouble < 5){
			if(userInputDouble == 1){
				System.out.println("What is the circles radius as a double?");// asking the question for the circle radius as a double
				dradius = keyboard.nextDouble();// turning the next line typed into the double radius 
				if(dradius <=0){// this ensures the user inputs a number that is not negative. Each of these from line 36 - 89
					GeometryCalculator.numError(userInputDouble);
				}
				System.out.println("The area of the circle is " + GeometryCalculator.circleArea(dradius));// displaying the area as a double
				System.out.println("What is the circles radius as an int?");// asking the question for the circle radius as a int
				iradius = keyboard.nextInt();// turning the next line typed into the int radius 
				if(iradius <=0){
					GeometryCalculator.numError(userInputDouble);
				}
				System.out.println("The area of the circle is " + GeometryCalculator.circleArea(iradius));// displaying the area as an int
				
			}else if(userInputDouble == 2){
				System.out.println("What is the rectangle's width as a double?");// asking the question for the rectangle's width as a double
				dwidth = keyboard.nextDouble();// turning the next line typed into the double width
				if(dwidth <=0){
					GeometryCalculator.numError(userInputDouble);
				}
				System.out.println("What is the rectangle's lenght as a double?");// asking the question for the rectangle's length as a double
				dlength = keyboard.nextDouble();// turning the next line typed into the double length
				if(dlength <=0){
					GeometryCalculator.numError(userInputDouble);
				}
				System.out.println("The area of the rectangle is " + GeometryCalculator.rectangleArea(dlength, dwidth));// displaying the area as a double
				
				System.out.println("What is the rectangle's width as a int?");// asking the question for the rectangle's width as a int
				iwidth = keyboard.nextInt();// turning the next line typed into the int width
				if(iwidth <=0){
					GeometryCalculator.numError(userInputDouble);
				}
				System.out.println("What is the rectangle's lenght as a int?");// asking the question for the rectangle's length as a int
				ilength = keyboard.nextInt();// turning the next line typed into the int length
				if(ilength <=0){
					GeometryCalculator.numError(userInputDouble);
				}
				System.out.println("The area of the rectangle is " + GeometryCalculator.rectangleArea(ilength, iwidth));// displaying the area as an int
			}else if(userInputDouble == 3){
				System.out.println("What is the triangle's base as a double?");// asking the question for the triangle's base as a double
				dbase = keyboard.nextDouble();// turning the next line typed into the double height
				if(dbase <=0){
					GeometryCalculator.numError(userInputDouble);
				}
				System.out.println("What is the triangle's height as a double?");// asking the question for the triangle's height as a double
				dheight = keyboard.nextDouble();// turning the next line typed into the double radius
				if(dheight <=0){GeometryCalculator.numError(userInputDouble);
				}
				System.out.println("The area of the triangle is " + GeometryCalculator.triangleArea(dheight, dbase));// displaying the area as a double
				
				System.out.println("What is the triangle's base as a int?");// asking the question for the triangle's base as a int
				ibase = keyboard.nextInt();// turning the next line typed into the int height
				if(ibase <=0){GeometryCalculator.numError(userInputDouble);
				}
				System.out.println("What is the triangle's height as a int?");// asking the question for the triangle's height as a int
				iheight = keyboard.nextInt();// turning the next line typed into the int radius 
				if(iheight <=0){GeometryCalculator.numError(userInputDouble);
				}
				System.out.println("The area of the triangle is " + GeometryCalculator.triangleArea(iheight, ibase));// displaying the area as an int

			}else if(userInputDouble == 4){
				System.out.println("Thank You and GoodBye!");
			}
			
		}else{
			GeometryCalculator.error(userInputDouble);
		}
		keyboard.close();

	}

}
