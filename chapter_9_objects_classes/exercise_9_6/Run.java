/*
 * Design a class named Stopwatch
 *		Private data fields startTime and endTime
 *		no-arg constructor that intialises startTime with current time
 *		method named start() that resets the startTime to the current time
 *		method named stop() that sets the endTime to the current time
 *		a method named getElapsedTime() that returns the elapsed time for the
 *			stopwatch in milliseconds.
 *
 *		Write a test program that measures the execution time of sorting 100,000 numbers using selection sort.
 */

public class Run {

	public static void main(String[] args) {
		final int ARRAY_SIZE = 100000;
		Stopwatch myStopwatch = new Stopwatch();
		myStopwatch.start();
		
		int[] myArray = new int[ARRAY_SIZE];
		fillArray(myArray);
		selectionSort(myArray);
		
		myStopwatch.stop();
		System.out.printf("Time required to sort %d numbers is %d\n",ARRAY_SIZE, myStopwatch.getElapsedTime());

	}
	
	static void fillArray(int[] array) {
		final int MAX_INT = 1000;
		java.util.Random rng = new java.util.Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rng.nextInt(MAX_INT);
		}
	}
	
	static void selectionSort(int[] array) {
		int minIndex, temp;
		for (int i = 0; i < array.length; i++) {
			minIndex = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[minIndex])
					minIndex = j;
			}
			temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;
		}
	}

}
