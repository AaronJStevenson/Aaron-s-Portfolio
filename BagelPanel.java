import java.awt.*;
import javax.swing.*;
// allows user to select type of bagel
public class BagelPanel extends JPanel{
	// cost of bagel
	public final double WHITE_BAGEL = 1.25;
	public final double WHEAT_BAGEL = 1.50;
	// radio buttons to reference type of bagels
	private JRadioButton whiteBagel;
	private JRadioButton wheatBagel;
	// the following variable will reference a buttongroup object to group buttons
	private ButtonGroup bg;
	// constructor
	public BagelPanel() {
		//create a GridLayout manager with 2 rows and 1 column
		setLayout(new GridLayout(2, 1)); 
		// create the radio buttons
		whiteBagel = new JRadioButton("White", true); 
		wheatBagel = new JRadioButton("Wheat");
		// group the radio buttons
		bg = new ButtonGroup();
		bg.add(whiteBagel);
		bg.add(wheatBagel);
		// add a border around the panel
		setBorder(BorderFactory.createTitledBorder("Bagel"));
		//add the radio buttons to this panel
		add(whiteBagel);
		add(wheatBagel);
	}
	// the get bagel cost method returns the cost of the selected bagel
	public double getBagelCost(){
		// the following variable will hold the cost of the selected bagel
		double bagelCost = 0.0;
		//determine which bagel is selected
		if(whiteBagel.isSelected())
			bagelCost = WHITE_BAGEL;
		else 
			bagelCost = WHEAT_BAGEL;
		// return cost of selected bagel
		return bagelCost;
	}

}
