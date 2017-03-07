
public class Ship {
	private String name; // ship name
	private String year; // when ship was made
	// no arg constructor
	public Ship() {
		name = "";
		year = "";
	}
	// constructor passing fields
	public Ship(String name, String year) {
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name; // returning the name
	}

	public void setName(String name) {
		this.name = name; // setting the name
	}

	public String getYear() {
		return year; // returning the year
	}

	public void setYear(String year) {
		this.year = year; // setting the year
	}
	// displaying the name and year
	public String toString(){
		return "Name: " + this.name + "\nYear: " + this.year;
	}
}
