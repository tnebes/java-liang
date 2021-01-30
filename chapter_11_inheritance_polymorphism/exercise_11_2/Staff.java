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
		return "Polymorphism?";
	}
	
	

}
