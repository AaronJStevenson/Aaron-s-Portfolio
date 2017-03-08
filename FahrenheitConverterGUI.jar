import javax.swing.*;
import java.awt.event.*;

/**
 *  This program converts Celsius to Fahrenheit
 */

public class FahrenheitConverterGUI extends JFrame
{
   private JPanel panel;             // A panel container
   private JLabel messageLabel;      // A message to display
   private JTextField celsiusTextField; // To hold user input
   private JButton calcButton;       // Performs calculation
   private final int WINDOW_WIDTH = 525;  // Window width
   private final int WINDOW_HEIGHT = 250; // Window height

   /**
    *  Constructor
    */

   public FahrenheitConverterGUI()
   {
      // Call the JFrame constructor
      super("Fahrenheit Converter");

      // Set the size of the window
      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

      // when close button is clicked.
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // Build the panel and add it to the frame.
      buildPanel();

      // Add the panel to the frame's content pane.
      add(panel);

      // Display the window / if false it will not display
      setVisible(true);
   }

   /**
    *  The buildPanel method adds a label, text field, and a button to a panel
    */

   private void buildPanel()
   {
      // Create the label, text field, and button components.
      messageLabel = new JLabel("Enter a temperature in Celsius.");
      celsiusTextField = new JTextField(10);
      calcButton = new JButton("Calculate");

      // Adds an action listener to the button.
      calcButton.addActionListener(new CalcButtonListener());

      // Creates a panel to hold the components.
      panel = new JPanel();
      
      // Adds the label, text field, and button to the panel.
      panel.add(messageLabel);
      panel.add(celsiusTextField);
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
         String str;   // To hold text entered
         double fahrenheit; // To hold fahrenheit

         // Get the temperature in Celsius entered in the
         // text field. The input is a string.
         str = celsiusTextField.getText();
         
         // For debugging, display the text entered, and
         // its value converted to a double.
         System.out.println("Reading " + str +
                            " from the text field.");
         System.out.println("Converted value: " +
                            Double.parseDouble(str));

         // Convert the celsius to fahrenheit.
         fahrenheit = Double.parseDouble(str) * 9/5 + 32;

         // Display a message dialog showing the miles.
         JOptionPane.showMessageDialog(null, str + 
                   "degrees celsius is " + fahrenheit + " degrees fahrenheit.");

         // For debugging, display a message indicating
         // the application is ready for more input.
         System.out.println("Ready for the next input.");
      }
   }
   
   /**
    *  The main method creates an instance of the
    *  FahrenheitConverterGUI class, which displays
    *  a window on the screen.
    */
   
   public static void main(String[] args)
   {
      new FahrenheitConverterGUI();
   }
}