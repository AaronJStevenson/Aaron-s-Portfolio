
public class LabEighteen {

	public static void main(String[] args) {
		
		// original shares bought and paid for 
		double shares = 1000;
		double origPrice = 32.87;
		double broker = .02;
		
		// the new price selling at
		double newPrice = 33.92;
		
		// the money he bought the shares for and paid broker
		double paidFirst = shares * origPrice;
		double paidBrokerFirst = paidFirst * broker;
		
		// the amount he sold for and paid broker for
		double soldFor = shares * newPrice;
		double paidBrokerSecond = soldFor * broker;
		
		// the profits he made
		double profit = (soldFor - paidBrokerSecond) - (paidFirst + paidBrokerFirst);
		
		System.out.println("Joe paid $" + paidFirst + " for his stocks.");
		System.out.println("Joe paid the broker $" + paidBrokerFirst + " for his commission.");
		System.out.println("Joe sold his stock for $" + soldFor + ".");
		System.out.println("Now Joe paid his broker $" + paidBrokerSecond + " for his stocks.");
		System.out.println("Joe made $" + profit + " for his stocks.");
		
		

	}

}
