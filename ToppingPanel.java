import java.awt.*;
import javax.swing.*;
// class allows the user to select bagel topping
public class ToppingPanel extends JPanel {
	// the following constants are used to indicate the cost of toppings
	public final double CREAM_CHEESE = 0.50;
	public final double BUTTER = 0.25;
	public final double PEACH_JELLY = 0.75;
	public final double BLUEBERRY_JAM = 0.75;
	// check boxes for the available toppings
	private JCheckBox creamCheese; // cream cheese
	private JCheckBox butter; //butter
	private JCheckBox peachJelly; //Peach Jelly
	private JCheckBox blueberryJam; //Blueberry Jam
	// constructor
	public ToppingPanel() {
		// create grid layout with 4rows and 1 column
		setLayout(new GridLayout(4, 1));
		// create the check boxes
		creamCheese = new JCheckBox("Cream Cheese");
		butter = new JCheckBox("Butter");
		peachJelly = new JCheckBox("Peach Jelly");
		blueberryJam = new JCheckBox("Blueberry Jam");
		// add the border 
		setBorder(BorderFactory.createTitledBorder("Toppings"));
		// add the checkboxesto this panel
		add(creamCheese);
		add(butter);
		add(peachJelly);
		add(blueberryJam);
	}
	// getTheToppings method returns the cost of toppings
	public double getToppingCost(){
		// holds cost of toppinng
		double toppingCost = 0.0;
		// detremin which o f the toppings are selected more than one may be selected by using if statements
		if (creamCheese.isSelected())
			toppingCost += CREAM_CHEESE;
		if (butter.isSelected())
			toppingCost += BUTTER;
		if (peachJelly.isSelected())
			toppingCost += PEACH_JELLY;
		if (blueberryJam.isSelected())
			toppingCost += BLUEBERRY_JAM;
		// 	return topping cost
		return toppingCost;
	}

}
