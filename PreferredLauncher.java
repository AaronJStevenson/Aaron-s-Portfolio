import java.util.Scanner;

public class PreferredLauncher {

	public static void main(String[] args) {
		double DiscountRate = 0;// this is the discount rate of goods
		double AmountSpent = 0;// this is how much the customer spent
				// this is the object for preferred customer
				PreferredCustomer person = new PreferredCustomer("Jon Jacob", "5467435", "North 1st Street", 
						"1", "jon_jacob@gmail.com", DiscountRate, AmountSpent);
				// this is the scanner class object
				Scanner keyboard = new Scanner(System.in);
				
				System.out.println("As a preferred customer, you get a discount. \n\n How much did you spend?");
				AmountSpent = keyboard.nextDouble();
				person.setAmountSpent(AmountSpent);
				
		
				System.out.println("Name\t\t\tPhone Number\t\tAddress\t\t\t\tCustomer Number\t\tCustomer E-Mail");
				  
				   System.out.println(person.getName() +  "\t\t" + person.getAddress() +  "\t\t\t"
						  + person.getPhoneNumber() + "\t\t\t" + ((Customer) person).getCustomerNumber() + "\t\t"
						   + ((Customer) person).geteMail() + "\n With your purchase of " + AmountSpent
						   + " you save " + person.getDiscountRate() + "%.");


	}

}
