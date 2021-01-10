/*
 * Design a class named location
 * for locating a maximal value
 * and its location in a 2d array
 * 
 * The class contains
 * public data fields row, column and maxValue
 * maxValue stores the maximal value
 * and its indices as int and maxValue as double
 * 
 * Write a method that returns the location of the largest element in a 2d
 * array.
 * 
 * The return value is an instance of Location.
 * 
 * Write a test program that prompts the user to enter a 2d array
 * and displays the location of the largest elemetn in the array.
 * 
 */

public class Run {
	
	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter the number of rows and columns in the array: ");
		int column = input.nextInt();
		int row = input.nextInt();
		double[][] array = new double[column][row];
		
		System.out.print("Enter the array: ");
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		
		input.close();
		
		Location largestFinder = Location.locateLargest(array);
		System.out.printf("The location of the largest element %f is at (%d, %d)",
				largestFinder.maxValue, largestFinder.column, largestFinder.row);
	}

}
