import javax.swing.*;
import java.awt.event.*;

/**
 *  This version of the LatinTranslatorGUI class
 *  displays debugging messages to the console window.
 */

public class LatinTranslatorGUI extends JFrame
{
   private JPanel panel;                            // A panel container
   private JLabel messageLabel1;                   // A message to display
   private JLabel messageLabel2;                  // A message to display
   private JLabel messageLabel3;                 // A message to display
   private JButton convertButton1;              // Performs conversion
   private JButton convertButton2;             // Performs conversion
   private JButton convertButton3;            // Performs conversion
   private final int WINDOW_WIDTH = 100;     // Window width
   private final int WINDOW_HEIGHT = 250;   // Window height

   /**
    *  Constructor
    */

   public LatinTranslatorGUI()
   {
      // Call the JFrame constructor.
      super("Latin to English Translator");

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
      messageLabel1 = new JLabel("Sinister");
      convertButton1 = new JButton("Convert");
      messageLabel2 = new JLabel("Dexter");
      convertButton2 = new JButton("Convert");
      messageLabel3 = new JLabel("Medium");
      convertButton3 = new JButton("Convert");

      // Add an action listener to the button.
      convertButton1.addActionListener(new ConvertButtonListener1());
      convertButton2.addActionListener(new ConvertButtonListener2());
      convertButton3.addActionListener(new ConvertButtonListener3());

      // Create a panel to hold the components.
      panel = new JPanel();
      
      // Add the label, text field, and button to the panel.
      panel.add(messageLabel1);
      panel.add(convertButton1);
      panel.add(messageLabel2);
      panel.add(convertButton2);
      panel.add(messageLabel3);
      panel.add(convertButton3);
   }

   /**
    *  Private inner class that handles the event when
    *  the user clicks the calculate button.
    */

   private class ConvertButtonListener1 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
    	 String english = "Sinister"; // To hold the english version
         String latin = "Left";      // To hold latin translation

         // Display a message dialog showing the miles.
         JOptionPane.showMessageDialog(null, "The translation of the english word " +
         english + " in Latin is " + latin + ".");

         // For debugging, display a message indicating
         // the application is ready for more input.
         System.out.println("Ready for the next input.");
      }
   }
   
   private class ConvertButtonListener2 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
    	 String english = "Dexter"; // To hold the english version
         String latin = "Right";      // To hold latin translation

         // Display a message dialog showing the miles.
         JOptionPane.showMessageDialog(null, "The translation of the english word " +
         english + " in Latin is " + latin + ".");

         // For debugging, display a message indicating
         // the application is ready for more input.
         System.out.println("Ready for the next input.");
      }
   }
   
   private class ConvertButtonListener3 implements ActionListener
   {
      public void actionPerformed(ActionEvent e)
      {
    	 String english = "Medium"; // To hold the english version
         String latin = "Center";      // To hold latin translation

         // Display a message dialog showing the miles.
         JOptionPane.showMessageDialog(null, "The translation of the english word " +
         english + " in Latin is " + latin + ".");

         // For debugging, display a message indicating
         // the application is ready for more input.
         System.out.println("Ready for the next input.");
      }
   }
   
   
   /**
    *  The main method creates an instance of the
    *  LatinTranslatorGUI class, which displays
    *  a window on the screen.
    */
   
   public static void main(String[] args)
   {
      new LatinTranslatorGUI();
   }
}