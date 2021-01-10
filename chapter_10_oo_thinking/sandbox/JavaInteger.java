/*
 * 10.7 Processing Primitive Data Type Values as Objects
 */
public class JavaInteger {

	public static void main(String[] args) {
		int myInteger;
		
		myInteger = new Integer("5005");
		System.out.printf("Result of new Integer(\"5005\") is: %d\n\tWARNING: this is deprecated.\n", myInteger);
		
		myInteger = new Integer(5005).byteValue();
		System.out.printf("Result of new Integer(5005).byteValue() is: %d\n", myInteger);
		
		Integer myInteger1 = new Integer(1005);
		Integer myInteger2 = new Integer(5005);
		System.out.printf("Result of myInteger2.compareTo(myInteger1) is: %d\n", myInteger2.compareTo(myInteger1));
		
		System.out.printf("Result of myInteger1.toString() + myInteger2.toString() is: %s\n", myInteger1.toString() + myInteger2.toString());
		
		myInteger = Integer.valueOf("13");
		System.out.printf("Result of Integer.valueOf(\"13\") is: %d\n", myInteger);
		
		System.out.print(myInteger1.getClass().getName());

		Integer x = 3 + new Integer(5);
		System.out.printf("\n%d\n", x);
		x = 3;
		System.out.printf("%d\n", x);
		
	}
	
}
