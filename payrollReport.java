import java.text.DecimalFormat;

public class payrollReport {

	// instance fields
	private int employeeNumber;
	private double grossPay;
	private double stateTax;
	private double federalTax;
	private double fica;
	
	public payrollReport() {
		// TODO Auto-generated constructor stub
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public double getGrossPay() {
		return grossPay;
	}

	public void setGrossPay(double grossPay) {
		this.grossPay = grossPay;
	}

	public double getStateTax() {
		return stateTax;
	}

	public void setStateTax(double stateTax) {
		this.stateTax = stateTax;
	}

	public double getFederalTax() {
		return federalTax;
	}

	public void setFederalTax(double federalTax) {
		this.federalTax = federalTax;
	}

	public double getFica() {
		return fica;
	}

	public void setFica(double fica) {
		this.fica = fica;
	}

	public double getNetPay(){
		
		return (grossPay - stateTax - federalTax - fica);
	}
	
	public void printEmployeeReports(){
		DecimalFormat formatter = new DecimalFormat("$###,##0.00");
		System.out.println("****************************\n" +
				"Gross pay: " + this.getGrossPay() + "\n" +
				"State tax: " + this.getStateTax() + "\n" +
				"Federal tax: " + this.getFederalTax() + "\n" +
				"Fica withholdings: " + this.getFica() + "\n" +
				"Net pay: " + this.getNetPay());
	}
	
	public void printTotals(double grossPayTotal, double stateTaxTotal, double federalTaxTotal, double ficaTotal){
		
	}
}
