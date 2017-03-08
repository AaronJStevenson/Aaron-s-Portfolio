import javax.swing.*;
import java.awt.event.*;

/**
 *  This version of the MPGCalculatorGUI class
 *  displays debugging messages to the console window.
 */

public class MPGCalculatorGUI extends JFrame
{
   private JPanel panel;                  // A panel container
   private JLabel messageLabel;           // A message to display
   private JLabel messageLabel2;           // A message to display
   private JTextField milesTextField;      // To hold user input
   private JTextField gallonsTextField;   // To hold user input
   private JButton calcButton;            // Performs calculation
   private final int WINDOW_WIDTH = 400;  // Window width
   private final int WINDOW_HEIGHT = 150; // Window height

   /**
    *  Constructor
    */

   public MPGCalculatorGUI()
   {
      // Call the JFrame constructor.
      super("Miles Per Gallon Calculator");

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
      // Create the label, text field, and button components.
      messageLabel = new JLabel("Enter a distance in miles");
      milesTextField = new JTextField(5);
      messageLabel2 = new JLabel("Enter the amount of gallons used");
      gallonsTextField = new JTextField(5);
      calcButton = new JButton("Calculate");

      // Add an action listener to the button.
      calcButton.addActionListener(new CalcButtonListener());

      // Create a panel to hold the components.
      panel = new JPanel();
      
      // Add the label, text field, and button to the panel.
      panel.add(messageLabel);
      panel.add(milesTextField);
      panel.add(messageLabel2);
      panel.add(gallonsTextField);
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
         String str;     // To hold text entered
         String str2;    // To hold text entered
         double miles;   // To hold miles
         double gallons; // To hold gallons
         double mpg;     // To hold miles per gallon

         // Get the number of miles and gallons entered in the
         // text fields. The input is a string.
         str = milesTextField.getText();
         str2 = gallonsTextField.getText();
         
         // For debugging, display the text entered, and
         // its value converted to a double.
         System.out.println("Reading " + str +
                            " from the text field.");
         System.out.println("Converted value: " +
                            Double.parseDouble(str));
         System.out.println("Reading " + str2 +
                 " from the text field.");
         System.out.println("Converted value: " +
                 Double.parseDouble(str2));

         // Convert the miles and gallons to miles per gallon.
         mpg = Double.parseDouble(str) / Double.parseDouble(str2);

         // Display a message dialog showing the miles.
         JOptionPane.showMessageDialog(null, str + 
                   " miles with " + str2 + " gallons of gas is " + mpg + " miles per gallon.");

         // For debugging, display a message indicating
         // the application is ready for more input.
         System.out.println("Ready for the next input.");
      }
   }
   
   /**
    *  The main method creates an instance of the
    *  MPGCalculatorGUI class, which displays
    *  a window on the screen.
    */
   
   public static void main(String[] args)
   {
      new MPGCalculatorGUI();
   }
}