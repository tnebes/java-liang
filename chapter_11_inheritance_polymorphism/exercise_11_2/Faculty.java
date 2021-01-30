import java.util.Date;

public class Faculty extends Employee {

	private Date officeHours;
	private byte rank;
	
	public Faculty(Person person) {
		this(person, new java.util.Date(), (byte) -1);
	}
	
	public Faculty(Person person, Date officeHours, byte rank) {
		this.ptrPerson = person;
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public Date getOfficeHours() {
		return officeHours;
	}

	public void setOfficeHours(Date officeHours) {
		this.officeHours = officeHours;
	}

	public byte getRank() {
		return rank;
	}

	public void setRank(byte rank) {
		this.rank = rank;
	}
	
	@Override
	public String toString() {
		return String.format("Faculty member's name is %s and name of the class is %s. Address: %s\nPhone: %s\nE-mail: %s\nLocation: %s\nSalary: %.2f\nHired: %s\n",
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
