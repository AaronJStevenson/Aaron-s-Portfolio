/**
 * 
 * This is apart of challenge 1 Chapter 8
 *
 */
public class ProductioinWorker extends Employee {
	// field for employee shift
	private int ishift;
	// holds place for the employees hourly pay rate
	private double rate;

	public ProductioinWorker(int eshift, String hireDate, String name, int empNum, double erate) {
	this.ishift = eshift;
	this.rate = erate;
	this.setName(name); // must set name using employee method.
	this.setEmpNum(empNum); // must set name using employee method.
	this.setHireDate(hireDate); // must set name using employee method.
	
	}
	// getters and setters
	public String getShift() {
		String shift;
		if(ishift == 1){
			shift = "Day";
		}else{
			shift = "Night";
		}
		
		return shift;
	}

	public void setShift(int ishift) {
		this.ishift = ishift;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	
}

