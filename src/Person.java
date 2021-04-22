

//Superclass
public class Person {
	private String name;
	private String birthday;
	
	//Parameterized Constructor
	public Person(String n, String b) {
		name = n;
		birthday = b;
	}
	
	//Setters and getters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}	
	
	public String toString() {
		return "Name: " + name + " DOB: " + birthday; 
	}
}
