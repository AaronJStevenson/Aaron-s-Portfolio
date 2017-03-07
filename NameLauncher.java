
public class NameLauncher {

	public static void main(String[] args) {
		
		// Array
		// Name[] states its from the Name() object and the the other one says there is 3 of them
		Name[] employees = new Name[3];
		for (int i = 0; i < employees.length; i++){
			// this is saying that employees equals i, to start at 0 because arrays always start at 0
			// also that employee is equal to one name() object
			employees[i] = new Name();
			
		}
// this is the group of arrays with their selected values 
		employees[0].setName("Susan Meyers");
		employees[0].setId(47899); // do not need parenthesis because its an int not a String
		employees[0].setDep("Accounting");
		employees[0].setPos("Vice President");
		
		employees[1].setName("Mark Jones");
		employees[1].setId(39119);
		employees[1].setDep("IT\t");
		employees[1].setPos("Programmer");
		
		employees[2].setName("Joy Rogers");
		employees[2].setId(81774);
		employees[2].setDep("Manufacturing");
		employees[2].setPos("Engineer");
		
		
		// thes escape sequences \t are used to create a table and give appropriate spacing
		System.out.println("Name\t\tID Number\t\tDepartment\t\tPosition");
		System.out.println("-------------------------------------------------------------------------------------");
		
		for (int i = 0; i < employees.length; i++){
			System.out.print(employees[i].getName() + "\t\t");
			System.out.print(employees[i].getId() + "\t\t");
			System.out.print(employees[i].getDep() + "\t\t");
			System.out.println(employees[i].getPos());
			
			
			
		}
	}

	
}
