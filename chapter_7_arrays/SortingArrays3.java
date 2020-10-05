public class SortingArrays3 {
	public static void main(String[] args) {
		
		double[] myList = {2, 5, 9, 4, 3, 1, 10};
		selectionSort(myList);

		for (double number : myList)
			System.out.printf("%f ", number);
	}

	public static void selectionSort(double[] list) {
	
		for (int i = 0; i < list.length - 1; i++) {
		
			double currentMin = list[i];
			int currentMinIndex = i;

			for (int j = i + 1; j < list.length; j++) {
				
				if (currentMin > list[j]) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}

			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;

			}
		
		}
	
	}
}
