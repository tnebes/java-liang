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
 */
public class MyInteger {

	private int value;
	
	//constructor
	MyInteger(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public boolean isEven() {
		return MyInteger.isEven(this.value);
	}
	
	public boolean isOdd() {
		return MyInteger.isOdd(this.value);
	}
	
	public boolean isPrime() {
		return MyInteger.isPrime(this.value);
	}
	
	public static boolean isEven(MyInteger value) {
		return MyInteger.isEven(value.getValue());
	}
	
	public static boolean isOdd(MyInteger value) {
		return MyInteger.isOdd(value.getValue());
	}
	
	public static boolean isPrime(MyInteger value) {
		return MyInteger.isPrime(value.getValue());
	}

	public static boolean isEven(int value) {
		return value % 2 == 0;
	}
	
	public static boolean isOdd(int value) {
		return value % 2 != 0;
	}
	
	public static boolean isPrime(int value) {
		// uses sieve of Eratosthenes
		for (int i = 2; i <= Math.sqrt(value); i++) {
			if (value % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public boolean equals(int value) {
		return this.value == value;
	}
	
	public boolean equals(MyInteger value) {
		return equals(value.getValue());
	}
	
	public static int parseInt(char[] array) {
		int number = 0;
		for (int i = 0; i < array.length; i++) {
			number += Character.getNumericValue(array[i]) * Math.pow(10, array.length - i - 1);
		}
		return number;
	}
	
	public static int parseInt(String myString) {
		return MyInteger.parseInt(myString.toCharArray());
	}
	
}
