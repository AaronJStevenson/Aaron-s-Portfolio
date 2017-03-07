
public class Circle {

	//fields
	private double radius;
	private final double PI = 3.14159;
	public Circle() {
		
	}
	
	public Circle(double Radius) {
		this.radius = Radius;
	}

	// property of field
	public void setRadius(double Radius){
		this.radius = Radius;
		// is the mutator method
	}
	public double getRadius(){
		return radius;
		// is the accessor method
	}
	
	// method for figuring area
	public double getArea(){
		return PI * radius * radius;
	}
	// method for figuring diameter
	public double getDiameter(){
		return radius * 2;
	}
	// method for figuring circumfrence
	public double getCircumfrence(){
		return 2 * PI * radius;
	}
	
}
