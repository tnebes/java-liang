import java.util.Arrays;

public class SelectionSortExercise {
		public static void main(String[] args) {

			int[] myList = {4, 23, 6, 123, 5, 65, 75, 234, 77, 23, 55};

			for (int i = 0; i < myList.length - 1; i++) {
				int currentMin = myList[i];
				int currentMinIndex = i;

				for (int j = i + 1; j < myList.length; j++) {
					if (currentMin > myList[j]) {
						currentMin = myList[j];
						currentMinIndex = j;
					}
				}

				if (currentMinIndex != i) {
					myList[currentMinIndex] = myList[i];
					myList[i] = currentMin;
				}
			
			}

			System.out.printf("%s\n", Arrays.toString(myList));

		}
}
