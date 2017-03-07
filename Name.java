
public class Name {
	
	// global variables
	private String name;
	private int idNumber;
	private String department;
	private String position;
	
	
	// this is a default constructor...always comes before a custom constructor if needed
	public Name() {
		
		
	}
// outside of the constructor
	
	public void setName(String Name){
		this.name = Name;
	}
	public String getName(){
		return name;
		}
	// get and set methods for employee name
	
	public void setId(int Id){
		this.idNumber = Id;
	}
	public int getId(){
		return idNumber;
	}
	// get and set methods for employee id
	
	public void setDep(String Dept){
		this.department = Dept;
	}
	public String getDep(){
		return department;
		}
	// get and set method for their departments
	
	public void setPos(String Pos){
		this.position = Pos;
	}
	public String getPos(){
		return position;
	}
	// get and set method for their posistions
}
