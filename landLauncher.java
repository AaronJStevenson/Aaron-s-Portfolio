import javax.swing.JOptionPane;

public class landLauncher {

	public static void main(String[] args) {
		double userInputDouble;// the variable that becomes what the user types
		Land land1 = new Land();
		Land land2 = new Land();
		// asking the questions to input values and set the value for the first tract of land's length and width
		userInputDouble = Double.parseDouble(JOptionPane.showInputDialog("Enter the land's length."));
		land1.setLength(userInputDouble);
		
		userInputDouble = Double.parseDouble(JOptionPane.showInputDialog("Enter the land's width."));
		land1.setWidth(userInputDouble);
		
		// asking the questions to input values and set the value for the second tract of land's length and width
		userInputDouble = Double.parseDouble(JOptionPane.showInputDialog("Enter the second land's length."));
		land2.setLength(userInputDouble);
				
		userInputDouble = Double.parseDouble(JOptionPane.showInputDialog("Enter the second land's width."));
		land2.setWidth(userInputDouble);
		
		if(land1.equals(land2)){
			JOptionPane.showMessageDialog(null, "These two tract's of land have the same area. \n" +
		"Land 1 " + land1.toString()  + "\n Land 2 " + land2.toString());
		}
		else{
			JOptionPane.showMessageDialog(null, "These two tracts of land do not have the same area.\n" +
		"Land 1 " + land1.toString() + "\n Land 2 " + land2.toString());
		}
		

	}

}
