import java.util.Scanner;

public class widgetLauncher {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		 
		widgetFactory widgets1 = new widgetFactory();
		
		
		System.out.println("How many widgets were made?");
		widgets1.setWidgets(keyboard.nextDouble());
		
		System.out.println(widgets1.numDays() + " day/days to make these widgets");
       
		
		

		keyboard.close();
	}

}
