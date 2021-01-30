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
public class Person extends AbstractPerson {

	private String name, address, phoneNumber, email;
	
	public Person() {
		this.ptrPerson = this;
	}
	
	public Person(String name, String address, String phoneNumber, String email) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.ptrPerson = this;
	}

	public String getName() {
		return ptrPerson.name;
	}

	public void setName(String name) {
		ptrPerson.name = name;
	}

	public String getAddress() {
		return ptrPerson.address;
	}

	public void setAddress(String address) {
		ptrPerson.address = address;
	}

	public String getPhoneNumber() {
		return ptrPerson.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		ptrPerson.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return ptrPerson.email;
	}

	public void setEmail(String email) {
		ptrPerson.email = email;
	}
	
	@Override
	public String toString() {
		return String.format("Person's name is %s and name of the class is %s. Address: %s\nPhone: %s\nE-mail: %s\n",
				this.getName(),
				this.getClass().getName(),
				this.getAddress(),
				this.getPhoneNumber(),
				this.getEmail()
		);
	}
	
	
	
}
