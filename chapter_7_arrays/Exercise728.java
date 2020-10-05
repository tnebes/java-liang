public class Exercise728 {
	public static void main(String[] args) {
		// create an array to hold 10 double values

		double[] myList0 = new double[10];

		//assign the value 5.5 to the last element in the array
		//
		myList0[9] = 5.5;
		myList0[myList0.length - 1] = 5.5;

		for (double i : myList0) {
			System.out.printf("%f ", i);
		}
		System.out.print("\n");

		// display the sum of the first two elements
		
		System.out.printf("%.2f \n", myList0[0] + myList0[1]);

		// write a loop that computers the sum of all elements in the array.
		
		for (int i = 0; i < myList0.length; i++) {
			myList0[i] = Math.random() * 1000;
		}

		double result = 0;
		for (double i : myList0) {
			System.out.printf("%.2f ", i);
			result += i;
		}
		
		System.out.printf("\n%.2f\n", result);

		// randomly generate an index and display the element of this index in the array
		
		System.out.printf("%f \n", myList0[(int) (Math.random() * myList0.length)]);

		// use an array initialiser to create another array with the initial values 3.5, 5.5, 4.52 and 5.6
		
		double[] myList1 = {3.5, 5.5, 4.52, 5.6};

		for (double number : myList1) {
			System.out.printf("%.2f, ", number);
		}

	}
}
