public class Staff extends Employee {
	
	private String title;

	public Staff() {
		this(new Person());
	}
	
	public Staff(Person person) {
		this(person, "");
	}
	
	public Staff(Person person, String title) {
		this.ptrPerson = person;
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return String.format("Staff person's name is %s and name of the class is %s.\nTitle: %s\nAddress: %s\nPhone: %s\nE-mail: %s\nLocation: %s\nSalary: %.2f\nHired: %s\n",
				this.getName(),
				this.getClass().getName(),
				this.getTitle(),
				this.getAddress(),
				this.getPhoneNumber(),
				this.getEmail(),
				this.getOfficeLocation(),
				this.getSalary(),
				this.getDateHired().toString()
		);
	}
	
	

}
