package alternative;
import java.util.Date;

public class Faculty extends Employee {

	private Date officeHours;
	private byte rank;
	
	public Faculty() {

	}
	
	public Faculty(Person person) {
		super(person);
	}
	
	public Faculty(Person person, Date officeHours, byte rank) {
		this(person);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	public Faculty(Date officeHours, byte rank) {
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
	
	

}
