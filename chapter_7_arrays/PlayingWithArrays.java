public class PlayingWithArrays {
	public static void main(String[] args) {

		// declaring arrays
		
		double[] someList; // nothing is known about this array other than it exists.

		someList = new double[3]; // now we've added its length

		// creating arrays

		double[] myList = new double[2];
		myList[0] = 1.0;
		myList[1] = 2.0;
		// myList[3] = 3.0; cannot add the third - array length is 2

		double total0 = 0;

		for(double aNumber: myList) {
			total0 += aNumber;
		}
		System.out.printf("%f\n", total0);

		double[] myList1 = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0}; // notice how there
		// is no need to initialise the length of the array.

		double total1 = 0.0;
		for(double aNumber: myList1) {
			total1 += aNumber;
		}
		System.out.printf("%f\n", total1);

		// finding the largest number in an array:
		
		double max = 0.0;
		for (int i = 0; i < (myList1.length); i++) {
			if (myList1[i] > max)
				max = myList1[i];
		}
		System.out.printf("%f\n", max);

	}
}
