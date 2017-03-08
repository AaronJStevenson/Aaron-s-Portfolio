import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

// The OrderCaclulator GUI class creates the fui for the brandis bagels app

public class OrderCalculatorGUI extends JFrame{ // must extend JFrame to allows program to run in JFrame window
	private BagelPanel bagels; // Bagel panel
	private ToppingPanel toppings; // Toppings panel
	private CoffeePanel coffee; // coffee panel
	private GreetingPanel banner; // display greetings panel
	private JPanel buttonPanel; // to hold buttons
	private JButton calcButton; // calculate the cost
	private JButton exitButton; // exit the application
	private final double TAX_RATE = 0.06; // sales tax

	// constructor
	public OrderCalculatorGUI() {
		// display the title
		super("Order Calculator");
		// speccify an action for the close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// create a borderlayout manager
		setLayout(new BorderLayout());
		//create the custom panels
		banner = new GreetingPanel();
		bagels = new BagelPanel();
		toppings = new ToppingPanel();
		coffee = new CoffeePanel();
		
		// create te button panel
		buildButtonPanel();
		
		// add the components to the content pane
		add(banner, BorderLayout.NORTH);
		add(bagels, BorderLayout.WEST);
		add(toppings, BorderLayout.CENTER);
		add(coffee, BorderLayout.EAST);
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
			double subtotal;
			double tax;
			double total;
			
			// calculate the subtotal
			subtotal = bagels.getBagelCost() + toppings.getToppingCost() +
					coffee.getCoffeeCost();
			
			// calculate the sales tax
			tax = subtotal * TAX_RATE;
			
			// calculate the total
			total = subtotal + tax;
			
			// create the decimal format object
			DecimalFormat dollar = new DecimalFormat("0.00");
			
			// display the charges
			JOptionPane.showMessageDialog(null, "Subtotal: $" +
			dollar.format(subtotal) + "\n" + "Tax: $" +
					dollar.format(tax) + "\nTotal: $" + dollar.format(total));
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
		new OrderCalculatorGUI();
	}

}
