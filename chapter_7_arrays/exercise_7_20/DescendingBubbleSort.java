// Rewrite the sort method from 7.18
// that uses the bubble-sort
// Write a test program
// that reads in 10 double numbers
// invokes the method
// and displays the sorted numbers
// in descending order

import java.util.Arrays;

public class DescendingBubbleSort {
		public static void main(String[] args) {

			java.util.Scanner input = new java.util.Scanner(System.in);
			//double[] myList = {989.34, 34.2, 74.3, 645.3,
			//	   764.65, 89.3, 54.3, 664.35, 6543.64, 565367.32, 12.3};

			double[] myList = new double[10];
			System.out.print("Please enter 10 decimal values one by one and hit enter. ");
			for (int i = 0; i < myList.length; i++) {
				myList[i] = input.nextDouble();
			}

			System.out.printf("Original: %s\nSorted: %s\n",
						   Arrays.toString(myList),
						   Arrays.toString(bubbleSort(myList)));

		}

		public static double[] bubbleSort(double[] originalList) { // forcing a return type as preservation of original is needed.

			double[] list = originalList;
			double temp;
			for (int i = 0; i < list.length; i++) {
			
				for (int j = list.length - 1; j > i; j--) {
				
					if (list[j] > list[j - 1]) {
						temp = list[j];
						list[j] = list[j - 1];
						list[j - 1] = temp;					
					}
				}
			}
			return list;		
		}
}
