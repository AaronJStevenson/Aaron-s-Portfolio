import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class chargesLauncher {

	public static void main(String[] args) {
		double userInput;
		DecimalFormat formatter = new DecimalFormat("$###,##0.00");
		Scanner keyboard = new Scanner(System.in);
		BankCharges charge1 = new BankCharges();
		
		userInput = Double.parseDouble(JOptionPane.showInputDialog("What is your beginning balance?"));
		// this is asking it to input value
		charge1.setAccountBalance(userInput);
		
		userInput = Double.parseDouble(JOptionPane.showInputDialog("How many checks were written?"));
		charge1.setChecksWritten((int)userInput);// casting userInput as an int because checksWritten is an int not a double
		
		JOptionPane.showMessageDialog(null, "Beginning amount in your account is " + formatter.format(charge1.getAccountBalance()) + "\n" + 
				"The numbert of checks that were written is " + charge1.getChecksWritten() + "\n" + "Your service fees are "
				+ formatter.format(charge1.getServiceFees()) + "\n" + "Your new account balance is " 
				+ (charge1.getAccountBalance() - charge1.getServiceFees()));

		keyboard.close();
		System.exit(0);
	}

}
 