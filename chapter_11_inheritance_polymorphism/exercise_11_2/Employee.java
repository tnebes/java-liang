import java.util.Date;

public class Employee extends Person {

	private String officeLocation;
	private double salary;
	private Date dateHired;
		
	public Employee() {
	
	}
	
	public Employee(Person person) {
		super(person.getName(), person.getAddress(), person.getPhoneNumber(), person.getEmail());
	}
	
	public Employee(Person person, String officeLocation, double salary, Date dateHired) {
		this(person);
		this.officeLocation = officeLocation;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	public Employee(String officeLocation, double salary, Date dateHired) {
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
	
	

}
