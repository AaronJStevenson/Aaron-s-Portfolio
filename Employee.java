import java.text.DecimalFormat;
import java.util.Random;

/**
 * Challenge number 1 of chapter 8
 * 
 *
 */
public class Employee {
	// this is the employee name
	private String name;
	// this is the employees number
	private int empNum;
	// this is their hire date
	private String hireDate;
	
	/*public Employee(String name, String emNum,String hire) {
		this.name = name;
		this.empNum = emNum;
		this.hireDate = hire;
		
	}
	public Employee() {
		
	}
	*/
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpNum() {
		String num = "";
		int employeeNum;
		char empLett;
		
		DecimalFormat formatter = new DecimalFormat("000");
		
		Random randomNumbers = new Random();
		employeeNum = randomNumbers.nextInt(999);
		
		if(employeeNum < 925){
			empLett = 'A';
		}
		else if(employeeNum < 850){
			empLett = 'B';
		}
		else if(employeeNum < 775){
			empLett = 'C';
		}
		else if(employeeNum < 700){
			empLett = 'D';
		}
		else if(employeeNum < 625){
			empLett = 'E';
		}
		else if(employeeNum < 550){
			empLett = 'F';
		}
		else if(employeeNum < 475){
			empLett = 'G';
		}
		else if(employeeNum < 400){
			empLett = 'H';
		}
		else if(employeeNum < 325){
			empLett = 'I';
		}
		else if(employeeNum < 250){
			empLett = 'J';
		}
		else if(employeeNum < 175){
			empLett = 'K';
		}
		else if(employeeNum < 100){
			empLett = 'L';
		}
		else {
			empLett = 'M';
		}
		
		return num + formatter.format(employeeNum) + "-" + empLett;
	}
	public void setEmpNum(int empNum) {
		this.empNum = empNum;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

}
