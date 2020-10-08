/* Write a method that returns the index of the
 * largest element in an array of integers.
 * IF there is more than one element, return
 * the largest index.
 */

import java.util.Random;
import java.util.Arrays;

public class LargestElement {
	public static void main(String[] args) {

		double[] myArray = new double[10];
		Random RNG = new Random();
		System.out.printf("%.2f\n", RNG.nextDouble());
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = RNG.nextDouble() * 100.0d;
		}
		System.out.printf("%s\n", Arrays.toString(myArray));
		System.out.printf("The index of the largest element is %d\n",
				indexOfLargestElement(myArray));

	}

	public static int indexOfLargestElement(double[] array) {
		/** returns the index of the largest element
		 * in an array
		 */
	
		int index = 0;
		double tempValue = 0;
		for (int i = 0; i < array.length; i++) {
			//irc bad idea to compare doubles 
			//and floats. use an epsilon dammit!
			if (tempValue <= array[i]) {
				tempValue = array[i];
				if(i > index) {
					index = i;
				}
			}
		}

		return index;
	}
}

