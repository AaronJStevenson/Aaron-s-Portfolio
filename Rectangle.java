
public class Rectangle {
	private double length;
	private double width;
	
	// constructor
	public Rectangle(double len, double w) {
		this.length = len;
		this.width = w;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea(){
		double area = 0;
		area = length * width;
		return area;
	}
}
