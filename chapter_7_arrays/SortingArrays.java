public class SortingArrays {
	public static void main(String[] args) {

	double[] myList = {2, 9, 5, 4, 8, 1, 6};
	selectionSort(myList);
	
	for (double number : myList) {
		System.out.printf("%f ", number);
	}

	}

	public static void selectionSort(double[] list) {
		for (int i = 0; i < list.length - 1; i++) { // goes almost through all the list, except the final?
			// the reason why it goes through almost all of the indecis is that the second loop 
			// goes through i + 1.
			double currentMin = list[i]; // the currentMinimum is the first element?
			int currentMinIndex = i; // the index of the current minimum

			// what does this do? It apparently assumes that the first index is the current minimum. 

			for (int j = i + 1; j < list.length; j++) { // another loop that compares it to the next element
				if (currentMin > list[j]) { // comparison
					currentMin = list[j]; // swap them from the previous loop
					currentMinIndex = j; // store the index of the swapped element?
				}
			}

			if (currentMinIndex != i) { // what does this do?
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
	}
}
