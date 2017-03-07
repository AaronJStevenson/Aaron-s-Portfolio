
public class customerLaunch {

public static void main (String [] Args){
		
		//Customer customer = new Customer("1","jon_jacob@gmail.com");
		Person person = new Customer("Jon Jacob", "5467435", "North 1st Street", "1", "jon_jacob@gmail.com");
		
		   System.out.println("Name\t\t\tPhone Number\t\tAddress\t\t\t\tCustomer Number\t\tCustomer E-Mail");
		  
		   System.out.println(person.getName() +  "\t\t" + person.getAddress() +  "\t\t\t"
				  + person.getPhoneNumber() + "\t\t\t" + ((Customer) person).getCustomerNumber() + "\t\t" + ((Customer) person).geteMail());

	}
	
}