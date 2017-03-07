/* Make a landTract class that has two fields: one for the tract's length and one for the width.
 * The class should have a method that retruns the tract's area, as well as an equals method and a toString
 * method. Demonstrate the class in a program that displays the area of each tract of land and indicate whether the tracts 
 * are of equal size.
 */

public class Land {
	// instance fields
	private double length;// This is the land tracts length
	private double width; // this is the lands width
	// constructor- inside it, it is stating that this. variable is equal to 0
	public Land() {
		this.length = 0;// stating that the length has a value of 0
		this.width = 0;// stating that width has a value of 0
	}// constructor2- inside it, it is stating that this. variable is equal to a new variable
	public Land(double len, double wid) {
		this.length = len; // stating that length is equal to len
		this.width = wid; // stating that width is equal to wid
	}
	// getting the value from the setter and return the value 
	public double getLength() {
		return length;
	}
	// getting the value from the launcher page
	public void setLength(double length) {
		this.length = length;
	}
	// getting the value from the setter and return the value 
	public double getWidth() {
		return width;
	}
	// getting the value from the launcher page
	public void setWidth(double width) {
		this.width = width;
	}
	// getting the value from the setter and return the value 
	public double getLandArea(){
		return length * width;
	}
	// this states if the values of land1 and land2 are true or false
	public boolean equals(Land object2){
		boolean status = false;
		if(this.getLandArea() == object2.getLandArea()){
			status = true;
		}
		return status;
	}
	// method concatinating the string of length and width 
	public String toString(){
		String str = "Length: " + length + "\t Width: " + width + " The area is: " + getLandArea();
		return str;
	}

}
