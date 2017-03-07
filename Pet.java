
public class Pet {

	// fields
	private String name;
	private String type;
	private int age;
	
	// my constructor
	public Pet() {
		
	}

	// properties/ methods of the field
	public void setName(String Name){
		this.name = Name;
	}
	public String getName(){
		return name;
	}
	
	public void setType(String Type){
		this.type = Type;
	}
	public String getType(){
		return type;
	}
	
	public void setAge(int Age){
		this.age = Age;
	}
	public int getAge(){
		return age;
	}
	
}
