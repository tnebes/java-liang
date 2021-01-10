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

public class Stopwatch {

	private long startTime, endTime;
	
	public Stopwatch() {
		this.startTime = System.currentTimeMillis();
	}
	
	public void start() {
		this.startTime = System.currentTimeMillis();
	}
	
	public void stop() {
		this.endTime = System.currentTimeMillis();
	}
	
	public long getElapsedTime() {
		return this.endTime - this.startTime;
	}

}
