/* write a program that prompts the user to enter the length
 * of a square matrix, randomly fills in 0s and 1s into the matrix,
 * prints the matrix
 * finds the rows
 * columns
 * and diagonals with all 0s and 1s
 */

public class ExploreMatrix {
	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);
		java.util.Random rng = new java.util.Random();
		do {
			System.out.print("Enter the size of the matrix: ");
			int arraySize = input.nextInt();
			int[][] array = new int[arraySize][arraySize];
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = rng.nextInt(2);
				}
			}
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					System.out.printf("%d ", array[i][j]);
				}
				System.out.printf("\n");
			}
			findIdentical(array);
			System.out.print("Another exploration? y/n ");
		} while (input.next().equals("y"));
	}

	/** calls various methods to check whether there exist
	 * same numbers in any row, column or diagonal.*/
	public static void findIdentical(int[][] array) {
		findHorizontal(array);
		findVertical(array);
		findDiagonal(array);
	}

	/** checks whether there are same numbers on any row.*/
	public static void findHorizontal(int[][] array) {
		int counter = 0, identical = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array[i].length; j++) {
				if (array[i][0] == array[i][j]) {
					counter++;
				} else {
					counter = 0;
					break;
				}
				if (counter == array.length - 1) {
					System.out.printf("All %ds on row %d.\n",
						array[i][0], i);
					identical++;
				}
			}
			counter = 0;
		}
		if (identical == 0) {
			System.out.printf("No same numbers on a row.\n");
		}
	}

	/** checks whether there are same numbers on any column.*/
	public static void findVertical(int[][] array) {
		int counter = 0, identical = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array[i].length; j++) {
				if (array[0][i] == array[j][i]) {
					counter++;
				} else {
					counter = 0;
					break;
				}
				if (counter == array.length - 1) {
					System.out.printf("All %ds on column %d\n",
						array[0][i], j);
					identical++;
					counter = 0;
				}
			}
			counter = 0;
		}
		if (identical == 0) {
			System.out.printf("No same number on a column.\n");
		}
	}

	/** checks for identical numbers on major and sub-diagonal.*/
	public static void findDiagonal(int[][] array) {
		int counter = 0, identical = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[0][0] == array[i][i])
				counter++;
			else {
				counter = 0;
				break;
			}
			if (counter == array.length - 1) {
				System.out.printf("All %ds on the major diagonal\n",
					array[0][0]);
				identical++;
				counter = 0;
			}
		}
		if (identical == 0)
			System.out.printf("No same numbers on the major diagonal.\n");

		counter = 0;
	   	identical = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[0][array.length - 1]
				== array[i][array.length - 1 - i]) {
					counter++;
				} else {
					counter = 0;
					break;
				}
			if (counter == array.length - 1) {
				System.out.printf("All %ds on sub-diagonal\n",
					array[0][array.length - 1]);
				identical++;
				counter = 0;
			}
		}
		if (identical == 0)
			System.out.printf("No same numbers on the sub-diagonal\n");
	}

}
