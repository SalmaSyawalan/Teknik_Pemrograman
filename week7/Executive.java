package week7;

public class Executive extends Employee {
	private double bonus;
	
	//constructor: sets up this executive with the specified info
	public Executive(String eName, String eAddress, String ePhone, String socSecNumber, double rate) {
		super(eName, eAddress, ePhone, socSecNumber, rate);
		bonus = 0; //bonus has yet to be awarded
	}
	
	//awards the specified bonus to this executive
	public void awardBonus(double execBonus) {
		bonus = execBonus;
	}
	
	//computes and return the pay for executive
	@Override
	public double pay() {
		double payment = super.pay() + bonus;
		bonus = 0;
		return payment;
	}
}
