import java.awt.*;
import javax.swing.*;
// allows user to select type of bagel
public class NonroutineServicesPanel extends JPanel{
	// text fields to input user data
	private JLabel messageLabel;           // A message to display
	private JLabel messageLabel2;           // A message to display
	private JTextField partsTextField;      // To hold user input
	private JTextField laborTextField;   // To hold user input
	// constructor
	public NonroutineServicesPanel() {
		//create a GridLayout manager with 2 rows and 1 column
		setLayout(new GridLayout(2, 1)); 
		// create the radio buttons
		messageLabel = new JLabel("Parts Charges:"); 
		partsTextField = new JTextField(5);
		messageLabel2 = new JLabel("Hours of Labor:");
		laborTextField = new JTextField(5);
		// add a border around the panel
		setBorder(BorderFactory.createTitledBorder("Nonroutine Services"));
		add(messageLabel);
		add(partsTextField);
		add(messageLabel2);
		add(laborTextField);  }
	// the get NonroutineCost method returns the cost of the selected nonroutine services
	public double getNonroutineServicesCost(){
		String str; //To hold text entered
		String str2; //To hold text entered 
		// the following variable will hold the cost of the selected bagel
		double NonroutineCost = 0.0;
		//determine the total of Nonroutine Costs
		str = partsTextField.getText();
        str2 = laborTextField.getText();  
        NonroutineCost = Double.parseDouble(str) + (Double.parseDouble(str2) * 20);
		// return total of Nonroutine costs
		return NonroutineCost;
	}
}