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

public class Time {

	private int hour, minute, second;
	private long unixTime;
	
	public Time() {
		this(System.currentTimeMillis());
	}
	
	public Time(long unixTime) {
		this.unixTime = unixTime;
		updateHourMinuteSecond();
	}
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHours() {
		return this.hour;
	}
	
	public int getMinutes() {
		return this.minute;
	}
	
	public int getSeconds() {
		return this.second;
	}
	
	public void setTime(long unixTime) {
		this.unixTime = unixTime;
		updateHourMinuteSecond();
	}
	
	public void updateHourMinuteSecond() {
		this.hour = (int) (this.unixTime / 3600000) % 24;
		this.minute = (int) (this.unixTime / 60000) % 60;
		this.second = (int) (this.unixTime / 1000) % 60;
	}
	
}
