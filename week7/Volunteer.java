package week7;

public class Volunteer extends StaffMember {
	//constructor: sets up this volunteer using the specified info
	public Volunteer(String eName, String eAddress, String ePhone) {
		super(eName, eAddress, ePhone);
	}
	
	//return 0 pay value for volunteer
	public double pay() {
		return 0.0;
	}
}
