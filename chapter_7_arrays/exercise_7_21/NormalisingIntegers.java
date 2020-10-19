// prompt user to enter 10 integers
// normalise the integers to be in range
// of 0 to 1
// by dividing every integer with the largest integer
// display the 10 normalised real-valued numbers

public class NormalisingIntegers {
	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		int[] myList = new int[10];
		System.out.print("Please enter 10 integers to normalise them.\n");
		for (int i = 0; i < myList.length; i++) {
			System.out.printf("%d - ", i + 1);
			myList[i] = input.nextInt();
		}

		double[] normalisedList = normaliseIntegers(myList);

		for (int i = 0; i < normalisedList.length; i++)
			System.out.printf("%.5f\n", normalisedList[i]);

	}

	public static double[] normaliseIntegers(int[] originalList) {
	
		double[] list = new double[originalList.length];
		// find the largest element in the original list
		int largestIndex = 0;

		for (int i = 0; i < originalList.length; i++) {	
			if (originalList[largestIndex] > originalList[i])
				largestIndex = i;
		}

		for (int i = 0; i < list.length; i++) {
			list[i] =
				originalList[largestIndex] / (double) originalList[i];
		}

		return list;
	}
}
