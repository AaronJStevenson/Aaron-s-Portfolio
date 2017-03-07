/**
 * This class holds data about a cube
 * 
 * @author Wendy Stevenson
 *
 */
public class Cube extends Rectangle {
	private double height; // the height of the cube
	
	/**
	 * the constructor accepts the cube's length,
	 * width, and height as arguments.
	 */
	public Cube(double len, double w, double h) {
		// call the superclass constructor to initialize lenth and width
		super(len, w);
		
		// we don't initialize the height the same as the other 2 because the rectangle class
		// does not have a height field
		
		// initialize the height field
		this.height = h;
		
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * The getSurfaceArea method retruns the cube's surface area
	 */
	
	public double getSurfaceArea(){
		
		return getArea() * 6;
	}
	

	/**
	 * The getVolume method retruns the cube's Volume
	 */
	public double getVolume(){
		
		return getArea() * height;
	}
}
