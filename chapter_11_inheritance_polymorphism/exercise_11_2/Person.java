/*
 * Design a class named Person and its two subclasses named Student and Employee.
 * Make Faculty and Staff subclasses of Employee.
 * A person has a name, address, phone number, and e-mail address.
 * A student has a class status (freshman, sophomore, junior, or senior).
 * 	Define the status as a constant.
 * An employee has an office, salary, and date hired. 
 * A faculty member has office hours and a rank.
 * A staff member has a title.
 * Override the toString method in each class to display the class name and the person’s name.
 */
public class Person {

	private String name, address, phoneNumber, email;
	
	public Person() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("Person's name is %s and name of the class is %s\n", this.getName(), this.getClass().getName());
	}
	
	
	
}
