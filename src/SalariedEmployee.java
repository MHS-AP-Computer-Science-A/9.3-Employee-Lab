

public class SalariedEmployee extends Employee {
	private int payPeriods;

	public SalariedEmployee(String name, String birthday, String title, double payrate) {
		super(name, birthday, title, payrate);
		payPeriods = 26;
	}
	
	//POST: sets payPeriods to p
	public void setPayPeriods(int p) {
		payPeriods = p;
	}
	
	//POST: Computes and returns pay which is the payrate
	//      divided by 26
	@Override
	public double getPayCheck() {
		return super.getPayCheck() / 26;	
	}
	
	
}
