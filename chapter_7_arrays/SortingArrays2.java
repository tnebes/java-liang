public class SortingArrays2 {
	public static void main(String[] args) {

		double[] myList = {2, 9, 5, 4, 8, 1, 6};
		selectionSort(myList);

		for (double number : myList) {
			System.out.printf("%f ", number);
		}
	}
	
	public static void selectionSort(double[] list) {
	
		for (int i = 0; i < list.length - 1; i++) {
		
			double currentMin = list[i]; // this is stored for comparison only.
			int currentMinIndex = i; // ditto.

			for (int j = i + 1; j < list.length; j++) { // + 1 because we don't want to compare identical elements.
				if (currentMin < list[j]) {
					currentMin = list[j]; // instead of doing shenanigans in the list
					currentMinIndex = j; // we just store these values for now.
				}

			/* swapping goes here */

			if (currentMinIndex != i) { // making sure we are not swapping elements at identical places.
				list[currentMinIndex] = list[i]; // swapping the minimal value of a list with the i element
				list[i] = currentMin; // continued swapping.
			}

			}
		
		}

	}
}
