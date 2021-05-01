package week7;

public class Employee extends StaffMember {
	protected String socialSecurityNumber;
	protected double payRate;
	
	//constructor: sets up this employee with specified info
	public Employee(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone);
		socialSecurityNumber = socSecNumber;
		payRate = rate;
	}
	
	//return info about an employee
	@Override
	public String toString() {
		String result = super.toString();
		result += "\nSocial Security Number: " + socialSecurityNumber;
		
		return result;
	}
	
	//return the pay rate for this employee
	public double pay() {
		return payRate;
	}
}
