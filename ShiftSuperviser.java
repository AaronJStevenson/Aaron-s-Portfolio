
public class ShiftSuperviser extends Employee{  // Shift supervisor " is a " employee.
	
	private double annualSalary; // the annual salary of a shift supervisor
	private double annualProdBonus; // this is a bonus that shift leaders recieve
	
	public ShiftSuperviser(String name, int empNum, String hireDate, double annualSalary, double annualProdBonus) {
		this.annualSalary = annualSalary;
		this.annualProdBonus = annualProdBonus;
		this.setName(name);
		this.setEmpNum(empNum);
		this.setHireDate(hireDate);
	}

	public double getAnnualSalary() {
		annualSalary = 50000;
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}

	public double getAnnualProdBonus() {
		annualProdBonus = 4000;
		return annualProdBonus;
	}

	public void setAnnualProdBonus(double annualProdBonus) {
		this.annualProdBonus = annualProdBonus;
	}

}
