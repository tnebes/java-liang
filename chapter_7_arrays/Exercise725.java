public class Exercise725 {
	public static void main(String[] args) {
		
		//int i = new int(30);
		//System.out.printf("%d\n", i);
		// double d[] = new double[30]; // this creates an array of length 30 with 30 0.0's.
		// I wonder if this is C/C++ syntax that we talked about in the book.
		double[] d = new double[30]; // this seems to be the regular Java syntax.
		for(double i : d) {
			System.out.printf("%.1f ",i);
		}
		System.out.print("\n");

		// char[] r = new char{1..30}; // this fails as it cannot do anything.
		// this would be a better solution

		char[] r = new char[32];
		for (int i = 24; i < r.length; i++) { // using a for loop is always faster than anything else
			r[i] = (char) i;
		}

		System.out.printf("%s\n\r\nnewline", new String(r));

		int i[] = {3,4,3,2};
		
		for(int number : i) {
			System.out.printf("%d ", number);
		}

		char[] c = new char[]; //???

	}
}
