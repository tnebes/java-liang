/*
 * Design a class named Time.
 * Class contains:
 * 	no arg constructor for current time
 * 	constructor with a specified elapsed time since the epoch
 * 	constructor with hour, minute and second
 * 	getters for hours, minutes and seconds
 * 	method setTime(long elapsedTime) that sets a new time for the object
 * 		using elapsed time
 * 	
 * Write a test program that creates
 * new Time()
 * new Time(555550000)
 * new Time(5, 23, 55)
 * and displays their hour, minute and second in format h:m:s
 * 
 */

public class Run {

	public static void main(String[] args) {
		Time[] times = new Time[3];
		times[0] = new Time();
		times[1] = new Time(555550000);
		times[2] = new Time(5, 23, 55);
		
		for (int i = 0; i < times.length; i++) {
			System.out.printf("Time %d:\n\t%2d:%2d:%2d\n",
					i, times[i].getHours(), times[i].getMinutes(), times[i].getSeconds());
		}
		
		

	}

}
