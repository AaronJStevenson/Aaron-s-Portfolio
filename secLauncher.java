import java.util.Scanner;
import javax.swing.JOptionPane;

public class secLauncher {

	public static void main(String[] args) {
		double userInput = 0;
		
		Scanner keyboard = new Scanner(System.in);
		NumSec sec1 = new NumSec();
		String output = "";// this allows me to add as many output messages that i want to run
		
		// != means not equal to... so if we look at our methods we set each variable equal to 0
		// so that if it isnt used, it will equal 0 and not run
		while(userInput != -1){
			output = "";
			userInput = Double.parseDouble(JOptionPane.showInputDialog("How many seconds do you wish to configure?"));
			// taking your input from the JOptionPane and putting it into the userInput
			sec1.setSeconds(userInput);
			
			if(sec1.getMinutes() !=0){
 				output += "The number of seconds you entered equals " + sec1.getMinutes() + " minutes. \n";// does not need to be in () and it means to add 
 				// to the output String
				
			}
			if (sec1.getHours() != 0){
				output += "The number of seconds entered equals " + sec1.getHours() + " hours. \n";
				
			}
			if (sec1.getDays() != 0){
				output += "The number of seconds entered will equal " + sec1.getDays() + "days. \n";
			}
			JOptionPane.showMessageDialog(null, output);
		}
		
		
		System.exit(0); //closes JOptionPane
	}

}
