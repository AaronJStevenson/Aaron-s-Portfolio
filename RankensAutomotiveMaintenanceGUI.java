import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

// The OrderCaclulator GUI class creates the fui for the brandis bagels app

public class RankensAutomotiveMaintenanceGUI extends JFrame{ // must extend JFrame to allows program to run in JFrame window
	private RoutineServicesPanel routine;            // Routine Services Panel
	private NonroutineServicesPanel nonroutine;     // Nonroutine Services Panel
	
	private JPanel buttonPanel;                  // to hold buttons

    private JButton calcButton;              // calculate the cost
	private JButton exitButton;             // exit the application

	private final double HOURLY_RATE = 20.00; // Hourly rate
	private final double PARTS_CHARGE = 1;   // Hourly rate

	// constructor and this is where we create the layout of the application
	public RankensAutomotiveMaintenanceGUI() {
		// display the title
		super("Ranken's Automotive Maintenance");
		// speccify an action for the close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// create a borderlayout manager
		setLayout(new BorderLayout());
		//create the custom panels
		routine = new RoutineServicesPanel();
		nonroutine = new NonroutineServicesPanel();
		
		// create the button panel
		buildButtonPanel();
		
		// add the components to the content pane
		add(routine, BorderLayout.NORTH);
		add(nonroutine, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.SOUTH);
		
		// pack the contents of the window and display it
		pack();
		setVisible(true);
	}
	// the buildButtonPanel method builds the button panel
	private void buildButtonPanel(){
		// create a panel for the buttons
		buttonPanel = new JPanel();
		
		// create the buttons 
		calcButton = new JButton("Calculate");
		exitButton = new JButton("Exit");
		
		// register the action listeners
		calcButton.addActionListener(new CalcButtonListener());
		exitButton.addActionListener(new ExitButtonListener());
		
		// add the buttons to the button panel
		buttonPanel.add(calcButton);
		buttonPanel.add(exitButton);
	}
	// private inner class that handles the event when the user clicks
	// the calculate button
	private class CalcButtonListener implements ActionListener {
		public void actionPerformed (ActionEvent e){
			// variables to hold the subtotal, tax, and total
			
			double totalCharges;
			
			// calculate the subtotal
			totalCharges = routine.getRoutineServicesCost() + nonroutine.getNonroutineServicesCost();
			
			// create the decimal format object
			DecimalFormat formatter = new DecimalFormat("$###,##0.00");
			
			// display the charges
			JOptionPane.showMessageDialog(null, "Total Charges: " + formatter.format(totalCharges));
		}
	}
	// private inner class that handles the event when the user clicks the exit button
	private class ExitButtonListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
	// main method
	public static void main(String[] args){
		new RankensAutomotiveMaintenanceGUI();
	}

}
