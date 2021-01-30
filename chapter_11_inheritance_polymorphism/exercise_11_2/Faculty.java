import java.util.Date;

public class Faculty extends Employee {

	private Date officeHours;
	private byte rank;
	
	public Faculty() {

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
