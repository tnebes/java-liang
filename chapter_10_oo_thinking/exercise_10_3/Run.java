/*
 * Design a class named MyInteger. The class contains:
 * 	value stores int
 * 	constructor creates object with the int
 * 	getter for value
 * 	isEven(), isOdd(), isPrime() : boolean
 * 	static methods isEven(int), isOdd(int), isPrime(int) : boolean
 * 	static methods isEven(MyInteger), isOdd(MyInteger), isPrime(MyInteger) : boolean
 * 	equals() methods for int and MyInteger : boolean (?)
 * 	static method parseInt(char[]) for an array : int
 * 	static method parseInt(String) that converts the String into int
 * 
 * Write a client program that tests all methods in the class
 */

public class Run {

	public static void main(String[] args) {
		
		MyInteger myInteger = new MyInteger(3121);
		System.out.printf("myInteger = %d\n", myInteger.getValue());
		System.out.printf("\tis even? %b\n", myInteger.isEven());
		System.out.printf("\tis odd? %b\n", myInteger.isOdd());
		System.out.printf("\tis prime? %b\n", myInteger.isPrime());
		System.out.print("Static method check.\n");
		System.out.printf("\tis even? %b\n", MyInteger.isEven(myInteger));
		System.out.printf("\tis odd? %b\n", MyInteger.isOdd(myInteger));
		System.out.printf("\tis prime? %b\n", MyInteger.isPrime(myInteger));
		
		System.out.printf("\tequals 3121? %b\n", myInteger.equals(3121));
		MyInteger myInteger2 = new MyInteger(3121);
		System.out.printf("\tstatic:\tequals 3121? %b\n", myInteger.equals(myInteger2));
		System.out.print("Parsing input:\n");
		char[] charInput = {'3', '1', '2', '1'};
		String stringInput = "3121";
		System.out.printf("Parsing char array: %d\n", MyInteger.parseInt(charInput));
		System.out.printf("Parsing string: %d\n", MyInteger.parseInt(stringInput));
		
	}
}
