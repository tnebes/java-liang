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

// this has to be the dumbest class I have ever written.

public class Location {
	public int row, column;
	public double maxValue;
	
	public Location(int row, int column, double maxValue) {
		this.row = row;
		this.column = column;
		this.maxValue = maxValue;
	}
	
	public static Location locateLargest(double[][] a) {
		int row = -1, column = -1;
		double maxValue = 0;
		
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				if (a[i][j] > maxValue) {
					column = i;
					row = j;
					maxValue = a[i][j];
				}
			}
		}
		
		return new Location(row, column, maxValue);
	}
}
