import java.awt.*;
import javax.swing.*;
// class allows the user to services they need performed
public class RoutineServicesPanel extends JPanel {
	// the following constants are used to indicate the cost of each service
	public final double OILCHANGE = 26.00;
	public final double LUBEJOB = 18.00;
	public final double RADIATORFLUSH = 30.00;
	public final double TRANSMISSIONFLUSH = 80.00;
	public final double INSPECTION = 15.00;
	public final double MUFFLERREPLACEMENT = 100.00;
	public final double TIREROTATION = 20.00;
	// check boxes for the available services
	private JCheckBox Oil_Change;            // Radio Button to choose this option
    private JCheckBox Lube_Job;             // Radio Button to choose this option
    private JCheckBox Radiator_Flush;      // Radio Button to choose this option
	private JCheckBox Transmission_Flush;     // Radio Button to choose this option
    private JCheckBox Inspection;            // Radio Button to choose this option
    private JCheckBox Muffler_Replacement;  // Radio Button to choose this option
    private JCheckBox Tire_Rotation;       // Radio Button to choose this option
	// constructor
	public RoutineServicesPanel() {
		// create grid layout with 7 rows and 1 column
		setLayout(new GridLayout(7, 1));
		// create the check boxes
		Oil_Change= new JCheckBox("Oil Change ($26.00)");
		Lube_Job = new JCheckBox("Lube Job ($18.00)");
		Radiator_Flush = new JCheckBox("Radiator Flush ($30.00)");
		Transmission_Flush = new JCheckBox("Transmission Flush ($80.00)");
		Inspection = new JCheckBox("Inspection ($15.00)");
		Muffler_Replacement = new JCheckBox("Muffler Replacement ($100.00)");
		Tire_Rotation = new JCheckBox("Tire Rotation ($20.00)");
		// add the border 
		setBorder(BorderFactory.createTitledBorder("Routine Services"));
		// add the checkboxes to this panel
		add(Oil_Change);
		add(Lube_Job);
		add(Radiator_Flush);
		add(Transmission_Flush);
		add(Inspection);
		add(Muffler_Replacement);
		add(Tire_Rotation);
	}
	// getRoutineServices method returns the cost of all the services
	public double getRoutineServicesCost(){
		// holds cost of all services chosen
		double routineServicesCost = 0.0;
		// determines which services you choose
		if (Oil_Change.isSelected())
			routineServicesCost += OILCHANGE;
		if (Lube_Job.isSelected())
			routineServicesCost += LUBEJOB;
		if (Radiator_Flush.isSelected())
			routineServicesCost += RADIATORFLUSH;
		if (Transmission_Flush.isSelected())
			routineServicesCost += TRANSMISSIONFLUSH;
		if (Inspection.isSelected())
			routineServicesCost += INSPECTION;
		if (Muffler_Replacement.isSelected())
			routineServicesCost += MUFFLERREPLACEMENT;
		if (Tire_Rotation.isSelected())
			routineServicesCost += TIREROTATION;
		// 	return routine services cost
		return routineServicesCost;
	}

}