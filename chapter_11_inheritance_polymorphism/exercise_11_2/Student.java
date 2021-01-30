public class Student extends Person {
	
//	public static final byte FRESHMAN = 0;
//	public static final byte SOPHOMORE = 1;
//	public static final byte JUNIOR = 2;
//	public static final byte SENIOR = 3;
	
	public static final byte FRESHMAN = 0,
			SOPHOMORE = 1,
			JUNIOR = 2,
			SENIOR = 3;
	private byte status;
		
	public Student(Person person) {
		this(person, (byte) -1);
	}
	
	public Student(Person person, byte status) {
		this.ptrPerson = person;
		this.status = status;
	}
	
	public byte getStatus() {
		return status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}
	
	

}
