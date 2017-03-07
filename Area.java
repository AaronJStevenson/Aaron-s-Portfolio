
public class Area {
	public Area() {
	}
	// overloaded static methods
	
	// These are the static methods for the circle's area. The first is as a double
	// and the second is as an int.
	public static double circleArea(double dradius){
		return Math.PI * (dradius * dradius);// returning the calculation for the area
	}
	public static int circleArea(int iradius){
		return (int) (Math.PI * (iradius * iradius));// returning the calculation for the area
	}
	// These are the area calclulations for the rectangle as a double and an int
	public static double rectangleArea(double dlength, double dwidth){
	return dlength * dwidth;// returning the calculation for the area
	}
	public static int rectangleArea(int ilength, int iwidth){
	return ilength * iwidth;// returning the calculation for the area
	}
	// These are the area calculations for an area of a cylinder as a double and an int
	public static double cylinderArea(double dradius, double dheight){
		return Math.PI * (dradius * dradius) * dheight;// returning the calculation for the area
	}
	public static int cylinderArea(int iradius, int iheight){
		return (int) (Math.PI * (iradius * iradius) * iheight);// returning the calculation for the area
	}
}
