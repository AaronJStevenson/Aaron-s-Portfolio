import javax.swing.*;
// greetingpanel class is specialized JPanel class. Display greeting for app window
public class GreetingPanel extends JPanel {
// constructor
	public GreetingPanel() {
		//create the label
		JLabel greeting = new JLabel("Welcome to Brandi's Bagel House");
		// add the label to this panel
		add(greeting);
	}

}
