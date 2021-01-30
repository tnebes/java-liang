import java.util.Date;

public class Employee extends Person {

	private String officeLocation;
	private double salary;
	private Date dateHired;
	
	public Employee() {
		this(new Person());
	}
	
	public Employee(Person person) {
		this(person, "", -1.0, new java.util.Date());
	}
	
	public Employee(Person person, String officeLocation, double salary, Date dateHired) {
		this.ptrPerson = person;
		this.officeLocation = officeLocation;
		this.salary = salary;
		this.dateHired = dateHired;
	}
		
	public String getOfficeLocation() {
		return officeLocation;
	}

	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}
	
	@Override
	public String toString() {
		return String.format("Employee's name is %s and name of the class is %s. Address: %s\nPhone: %s\nE-mail: %s\nLocation: %s\nSalary: %.2f\nHired: %s\n",
				this.getName(),
				this.getClass().getName(),
				this.getAddress(),
				this.getPhoneNumber(),
				this.getEmail(),
				this.getOfficeLocation(),
				this.getSalary(),
				this.getDateHired().toString()
		);
	}

}
