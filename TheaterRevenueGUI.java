import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;

/**
 *  This version of the TheaterRevenueGUI class
 *  displays debugging messages to the console window.
 */

public class TheaterRevenueGUI extends JFrame
{
   private JPanel panel;                            // A panel container
   private JLabel messageLabel1;                   // A message to display
   private JLabel messageLabel2;                  // A message to display
   private JButton calcButton;              // Performs calculations
   private JTextField adultTextField;       // To hold user input
   private JTextField childTextField;       // To hold user input
   private final int WINDOW_WIDTH = 400;     // Window width
   private final int WINDOW_HEIGHT = 250;   // Window height

   /**
    *  Constructor
    */

   public TheaterRevenueGUI()
   {
      // Call the JFrame constructor.
      super("Theater Revenue");

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
      messageLabel1 = new JLabel("How many adult tickets purchased at $7.00 a ticket?");
      adultTextField = new JTextField(5);
      messageLabel2 = new JLabel("How many child tickets purchased at $4.00 a ticket?");
      childTextField = new JTextField(5);
      calcButton = new JButton("Calculate");
   

      // Add an action listener to the button.
      calcButton.addActionListener(new CalcButtonListener());
      

      // Create a panel to hold the components.
      panel = new JPanel();
      
      // Add the label, text field, and button to the panel.
      panel.add(messageLabel1);
      panel.add(adultTextField);
      panel.add(messageLabel2);
      panel.add(childTextField);
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
    	 String adultTicket; // To hold number of tickets
    	 String childTicket; // To hold number of tickets for child
    	 double grossAdultRevenue; //To hold value of gross revenue
    	 double netAdultRev; // TO hold value of adult net revenue
    	 double grossChildRevenue; // To hold value of gross child revenue
    	 double netChildRevenue; // TO hold value of net child revenue
    	 double TotalGross; // To hold the total gross revenue of both
    	 double TotalNet; // To hold the total net revenue of both
    	 final double BOX_OFFICE_RECIEPTS = .2; // 20% of the box office reciepts the theater keeps
    	 final double MOVIEPAY = 75; // ammount they charge for the movie
    	 
    	 
    	 adultTicket = adultTextField.getText();
    	 childTicket = childTextField.getText();
    	 // Calculating the amount of money
    	 grossAdultRevenue = Double.parseDouble(adultTicket) * 7;
    	 netAdultRev = grossAdultRevenue * BOX_OFFICE_RECIEPTS; // this deducts adult sales by the movie charge
    	 grossChildRevenue = Double.parseDouble(childTicket) * 4;
    	 netChildRevenue = grossChildRevenue * BOX_OFFICE_RECIEPTS; // this deducts child sales by the movie charge
    	 TotalGross = grossChildRevenue + grossAdultRevenue; // Total of gross pay
    	 TotalNet = netAdultRev + netChildRevenue;
    	 

    	 DecimalFormat formatter = new DecimalFormat("$###,##0.00");
         // Display a message dialog showing the miles.
         JOptionPane.showMessageDialog(null, formatter.format(grossAdultRevenue) +
        		 " is the gross revenue of the Adult tickets.\n " +
        		 formatter.format(netAdultRev) + " is the net revenue for the adult tickets.\n" +
        		 formatter.format(grossChildRevenue) + " is the gross revenue for the child tickets.\n" +
        		 formatter.format(netChildRevenue) + " is the net revenue for the child tickets.\n" +
        		 formatter.format(TotalGross) + " is the total gross for adult and child tickets.\n" +
        		 formatter.format(TotalNet) + " id the total net for adult and child tickets.\n");

         // For debugging, display a message indicating
         // the application is ready for more input.
         System.out.println("Ready for the next input.");
      }
   }
   
   /**
    *  The main method creates an instance of the
    *  TheaterRevenueGUI class, which displays
    *  a window on the screen.
    */
   
   public static void main(String[] args)
   {
      new TheaterRevenueGUI();
   }
}