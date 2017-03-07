
public class LabSixteen {

	public static void main(String[] args) {
		int surveyedCustomers = 15000;
		double energyCustomers = .18 * surveyedCustomers;
		double citrusCustomers = .58 * energyCustomers;
		// these are the calculations for the number of customers that drink energy drinks
		
		// this is the print out of the answers calculated above
		System.out.println("From all the surveyed customers, " + energyCustomers + " buy one or more energy drinks per week.");
		System.out.println("From all the energy drink customers, " + citrusCustomers + " prefer citrus flavored energy drinks.");

	}

}
