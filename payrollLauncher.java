import java.util.Scanner;


public class payrollLauncher {

	public static void main(String[] args) {
		int userInputInt = -1; // local variables
		double userInputDouble = 0;
		double grossPayTotal = 0;
		double stateTaxTotal = 0;
		double federalTaxTotal = 0;
		double ficaTotal = 0;
		double netPayTotal = 0;
		
		Scanner keyboard = new Scanner(System.in);// scanner class object
		
		payrollReport report1 = new payrollReport();// class object
		
	while(userInputInt != 0){
		while(userInputInt < 0){
			userInputInt = -1;
			System.out.println("Enter in an employee number.");// Asking the question
			userInputInt = keyboard.nextInt();
			report1.setEmployeeNumber(userInputInt);
			if(userInputInt < 0){
				System.out.print("Please enter a number more than 0.\n");
			}// close if
		}// close while 2
		if(userInputInt == 0){
			break;
		}// if closed
	}// while closed
	
	
	if(userInputInt != 0){
		while(userInputDouble <0){
			userInputDouble = -1.0;
			System.out.println("Enter in the gross pay.");// Asking another question
			userInputDouble = keyboard.nextDouble();
			report1.setGrossPay(userInputDouble);
			grossPayTotal += report1.getGrossPay();
			if(userInputDouble < 0){
				System.out.print("Please enter a number more than 0.\n");
			}// if closed
		}// closed while
		while(userInputDouble < 0){
			userInputDouble = -1.0;
			System.out.println("Enter in the state tax.");// Asking another question
			userInputDouble = keyboard.nextDouble();
			report1.setStateTax(userInputDouble);
			stateTaxTotal += report1.getStateTax();
		}// closed while
		while(userInputDouble < 0){
			userInputDouble = -1.0;
			System.out.println("Enter in the federal tax.");// Asking another question
			userInputDouble = keyboard.nextDouble();
			report1.setFederalTax(userInputDouble);
			federalTaxTotal += report1.getFederalTax();
		}// closed while
		while(userInputDouble < 0){
			userInputDouble = -1.0;
			System.out.println("Enter in the fica withholdings.");// Asking another question
			userInputDouble = keyboard.nextDouble();
			report1.setFica(userInputDouble);
			ficaTotal += report1.getFica();
		}// closed while
		
			// getting the net pay
			netPayTotal += report1.getNetPay();
		
			report1.printEmployeeReports();
		}
		if(report1.getEmployeeNumber() == 0){
			report1.printTotals(grossPayTotal, stateTaxTotal, federalTaxTotal, ficaTotal);
			grossPayTotal -= report1.getGrossPay();
			stateTaxTotal -= report1.getStateTax();
			federalTaxTotal -= report1.getFederalTax();
			netPayTotal -= report1.getNetPay();
			
			keyboard.close();
		}
	}
}
		
			

	
	
	
