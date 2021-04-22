

public class EmployeeTester {

	public static void main(String[] args) {
		//Test HourlyEmployee
		HourlyEmployee he = new HourlyEmployee("Amy", "4/28", "Helpdesk Staff", 18.75);
		he.addHours(10);
		he.addHours(15);
		System.out.println(he); //Pay should be 468.75
		//Verify hours reset
		he.addHours(5);
		System.out.println("\n" + he); //Pay should be 93.75
		
		//Test SalariedEmployee
		SalariedEmployee se = new SalariedEmployee("Molly", "9/15", "Engineer", 93522);
		System.out.println("\n" +se); //Pay should be 3597
		
		//Test pay periods
		se.setPayPeriods(24);
		System.out.println("\n" + se); //Pay should be 3896.75
	}

}
