public class TernaryOperators {
	public static void main(String[] args) {
		byte x = 1;
		byte y;	
	
		// here's one way of doing it
	
		if (x >= 1) {
			y = 10;
		}
		else {
			y = 0;
		}

		System.out.println("This is done with regular if/else statement.");
		System.out.println("y is " + y);

		// here's the other way to do it
		// ternary operators
		
		y = (x >= 1) ? (byte) 10 : (byte)  0;

		System.out.println("This is done with ternary operators.");
		System.out.println("y is " + y);
	}
}


