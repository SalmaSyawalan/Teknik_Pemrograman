package week7;

abstract public class StaffMember {
	protected String name;
	protected String address;
	protected String phone;
	
	//sets up a staff member using the specified information
	public StaffMember(String eName, String eAddress, String ePhone) {
		name = eName;
		address = eAddress;
		phone = ePhone;
	}
	
	//return a string including the basic employee info
	public String toString() {
		String result = "Name: " + name + "\n";
		result += "Address: " + address + "\n";
		result += "Phone: " + phone;
		
		return result;
	}
	
	//derived classes must define the pay method
	public abstract double pay();
}
