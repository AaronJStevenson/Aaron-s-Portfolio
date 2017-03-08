import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
 *  This version of the TheaterRevenueGUI class
 *  displays debugging messages to the console window.
 */

public class LongDistanceGUI extends JFrame
{

		
		
	
   private JPanel panel;                            // A panel container
   private JLabel messageLabel1;                   // A message to display
   // radio buttons to reference type of bagels
   private JRadioButton DayTime;
   private JRadioButton Evening;
   private JRadioButton Off_Time;
// the following variable will reference a buttongroup object to group buttons
	private ButtonGroup bg;
	
   private JButton calcButton;              // Performs calculations
   private JTextField timeTextField;       // To hold user input
   private final int WINDOW_WIDTH = 950;     // Window width
   private final int WINDOW_HEIGHT = 175;   // Window height

   /**
    *  Constructor
    */
   public LongDistanceGUI()
   {
      // Call the JFrame constructor.
      super("Long Distance Call Rates");

      // Set the size of the window.
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // Specify what happens when the close
      // button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Build the panel and add it to the frame.
      buildPanel();

      // Add the panel to the frame's content pane.
      add(panel);

      // Display the window.
      setVisible(true);
   }

   /**
    *  The buildPanel method adds a label, text field, and
    *  a button to a panel.
    */

   private void buildPanel()
   {
	   setLayout(new GridLayout(5, 1)); 
		// create the radio buttons
		DayTime = new JRadioButton("6:00 a.m. through 5:59 p.m.", true); 
		Evening = new JRadioButton("6:00 p.m. through 11:59 p.m.");
		Off_Time = new JRadioButton("12:00 a.m. through 5:59 a.m.");
      // Create the text field, and button components.
		messageLabel1 = new JLabel("Enter in the number of minutes used.");
      timeTextField = new JTextField(5);
      calcButton = new JButton("Calculate");
      
   // group the radio buttons
   		bg = new ButtonGroup();
   		bg.add(DayTime);
   		bg.add(Evening);
   	    bg.add(Off_Time);
      
  
      // Add an action listener to the button.
      calcButton.addActionListener(new CalcButtonListener());
      

      // Create a panel to hold the components.
      panel = new JPanel();
      
      // Add the label, text field, and button to the panel.
      panel.add(DayTime);
      panel.add(Evening);
      panel.add(Off_Time);
      panel.add(messageLabel1);
      panel.add(timeTextField);
      panel.add(calcButton);
   }

   /**
    *  Private inner class that handles the event when
    *  the user clicks the calculate button.
    */

   private class CalcButtonListener implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
    	 String str; // To hold user input
    	 final double DAYTIME = 0.07;
 		 final double EVENING = 0.12;
 		 final double OFF_PEAK = 0.05;
 		 double chargedCall = 0;
    	 
    	 str = timeTextField.getText();
    	 // Calculating the amount of money
    	 if(DayTime.isSelected())
    		 chargedCall = Double.parseDouble(str) * DAYTIME;
    	 else if(Evening.isSelected())
    		 chargedCall = Double.parseDouble(str) * EVENING;
    	 else if(Off_Time.isSelected())
    		 chargedCall = Double.parseDouble(str) * OFF_PEAK;
    		 
    	 

    	 DecimalFormat formatter = new DecimalFormat("$###,##0.00");
    	 JOptionPane.showMessageDialog(null, "Your phone rate is " + formatter.format(chargedCall));
      }
   }
   
   /**
    *  The main method creates an instance of the
    *  LongDistanceGUI class, which displays
    *  a window on the screen.
    */
   
   public static void main(String[] args)
   {
      new LongDistanceGUI();
   }
}