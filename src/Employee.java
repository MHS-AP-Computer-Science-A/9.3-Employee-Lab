

public class Employee extends Person {
	private String title;
	private double payrate;
	
	//POST: calls superclass constructor and initialized title and payrate
	//      instance variables
	public Employee(String name, String birthday, String title, double payrate) {
		//Send name and birthday to superclass constructor
		super(name, birthday);
		//Initialize this class's instance variables
		this.title = title;
		this.payrate = payrate;
	}
	
	//POST: returns the Employee's payrate
	public double getPayCheck() {
		return payrate;
	}
	
	//Post: returns name and title
	@Override
	public String toString() {
		//The call here to getPayCheck will call the subclass method if the
		//subclass overrides it
		return super.toString() + "\nTitle: " + title + "\nPay: $" + getPayCheck(); 
	}

}
