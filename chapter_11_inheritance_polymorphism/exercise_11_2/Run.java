/*
 * Write a test program
 * that creates a Person, Student, Employee, Faculty, and Staff, and invokes
 * their toString() methods.
 */
public class Run {

	public Run() {
		Person person = new Person();
		person.setName("Tomislav");
		person.setAddress("Gorgonzola 11");
		
		Student student = new Student();
		student.setName("Bojko");
		student.setStatus(Student.SOPHOMORE);
		
		Employee employee = new Employee();
		employee.setDateHired(new java.util.Date());
		employee.setOfficeLocation("1-54b");
		employee.setSalary(4999.99);
		
		Faculty faculty = new Faculty();
		faculty.setName("Stephen");
		faculty.setSalary(6999.99);
		
		Staff staff = new Staff();
		staff.setName("Vanessa");
		staff.setTitle("Master of Fine Arts");
		
		Person[] myPersons = new Person[5];
		myPersons[0] = person;
		myPersons[1] = student;
		myPersons[2] = employee;
		myPersons[3] = faculty;
		myPersons[4] = staff;
		
		for (int i = 0; i < myPersons.length; i++) {
			System.out.print(myPersons[i].toString());
		}
		
		
	}
	
	public static void main(String[] args) {
		new Run();

	}

}
