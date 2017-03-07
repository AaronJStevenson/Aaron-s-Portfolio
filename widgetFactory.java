
public class widgetFactory {

	// my variables fields
	private double widgets;
	private double widgetsADay = 160;
	
	// constructor
	public widgetFactory() {
		
	}
	// properties
	public double getWidgets() {
		return widgets;
	}


	public void setWidgets(double Widgets) {
		this.widgets = Widgets;
	}

	// method to figure the number of days to make the number of widgets
	
	public double numDays(){
		return Math.ceil(widgets / widgetsADay);
	}
	

}
