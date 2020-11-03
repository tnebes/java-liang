/* Write a method to sort a 2d array using a defined header.
 * This method performs a primary sort on rows, and a secondary sort
 * on columns. 
 */

import java.util.Arrays;

public class Sort2dArray {
	public static void main(String[] args) {
		java.util.Random rng = new java.util.Random();
		/* test sort data
		int[][] list = {{4, 2},
			{1, 7},
			{4, 5},
			{1, 2},
			{4, 1}};
		*/
		// randomly generated data.
		int[][] list = new int[rng.nextInt(256)][2];
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[i].length; j++) {
				list[i][j] = rng.nextInt(10);
			}
		}
		
		for (int i = 0; i < list.length; i++) {
			System.out.printf("%s ", Arrays.toString(list[i]));
		}
		System.out.print("\n");
		sort(list);
		for (int i = 0; i < list.length; i++) {
			System.out.printf("%s ", Arrays.toString(list[i]));
		}
	}

	public static void sort(int m[][]) {
		int[] temp = new int[2];

		for (int i = 0; i < m.length; i++) {
			for (int j = m.length - 1; j > i; j--) {
				if (m[j][0] >= m[j - 1][0]) {
					if (m[j][0] > m[j - 1][0]) {
						temp = m[j];
						m[j] = m[j - 1];
						m[j - 1] = temp;
						continue;
					}
					else if (m[j][1] > m[j - 1][1]) {
						temp = m[j];
						m[j] = m[j - 1];
						m[j - 1] = temp;
						continue;
					}
				}
			}
		}
	}

}
