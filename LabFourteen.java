import java.util.Scanner;

public class LabFourteen {

	
	public static void main(String[] args) {
	
		// these are values I was given in the book
		double shares = 1000;
		double sharePrice = 25.50;
		double commission = .02;
		
		// these are the print outs and calculations for the share and there values
		System.out.println(shares * sharePrice);
		System.out.println((shares * sharePrice) * commission);
		System.out.println((shares * sharePrice) * commission + shares * sharePrice);
		

	}

}
