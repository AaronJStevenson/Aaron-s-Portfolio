import java.awt.*;
import javax.swing.*;
// allows user to select coffee
public class CoffeePanel extends JPanel{
	// the constants are used to indicate the cost of coffee
	public final double NO_COFFEE = 0.0;
	public final double REGULAR_COFFEE = 1.25;
	public final double DECAF_COFFEE = 1.25;
	public final double CAPPUCINO = 2.00;
	// radio buttons for the available coffees
	private JRadioButton noCoffee; // no coffee
	private JRadioButton regularCoffee; // regular  coffee
	private JRadioButton decafCoffee; // decaf
	private JRadioButton cappucino; // cappucino
	// the following variable will referenct a buttongroup
	private ButtonGroup bg;
	// constructor
	public CoffeePanel() {
		//create a gridlayout manager with 4row and 1 column
		setLayout(new GridLayout(4, 1));
		//create radio buttons
		noCoffee = new JRadioButton("None");
		regularCoffee = new JRadioButton("Regular coffee", true);
		decafCoffee = new JRadioButton("Decaf Coffee");
		cappucino = new JRadioButton("Cappucino");
		// group buttons into panel
		bg = new ButtonGroup();
		bg.add(noCoffee);
		bg.add(regularCoffee);
		bg.add(decafCoffee);
		bg.add(cappucino);
		// add border aroung panel
		setBorder(BorderFactory.createTitledBorder("Coffee"));
		//add the radio buttos to this panel
		add(noCoffee);
		add(regularCoffee);
		add(decafCoffee);
		add(cappucino);
	}
	//getCoffeeCOst method return selected coffee
	public double getCoffeeCost(){
		// holds value of coffee
		double coffeeCost = 0.0;
		//determin which is selected
		if(noCoffee.isSelected())
			coffeeCost = NO_COFFEE;
		else if(regularCoffee.isSelected())
			coffeeCost = REGULAR_COFFEE;
		else if(decafCoffee.isSelected())
			coffeeCost = DECAF_COFFEE;
		else if(cappucino.isSelected())
			coffeeCost = CAPPUCINO;
		//rturn cost
		return coffeeCost;
	}
}
