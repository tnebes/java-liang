/*
 * Design a class named MyPoint
 * Class contains:
 * 	x and y with accessors
 * 	noarg constructor
 * 	constructor with specified coordinates
 * 	method distance which returns distance to another MyPoint
 * 	distance which returns distance to x and y coordinates
 * 	static method that returns the distance from two MyPoint objects
 * 
 * 	Write a test program that creates two points (0, 0) and (10, 30.5) and displays the
 * 	distance between them
 */


public class MyPoint {
	
	private double x, y;
	
	public MyPoint() {
		this(0, 0);
	}
	
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double getX() {
		return this.x;
	}
	
	public double getY() {
		return this.y;
	}
	
	public double distance(double x, double y) {
		return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
	}
	
	public double distance(MyPoint point) {
		return this.distance(point.getX(), point.getY());
	}
	
	public static double distance(MyPoint point1, MyPoint point2) {
		return Math.sqrt(Math.pow((point1.getX() - point2.getX()), 2) + Math.pow((point1.getY() - point2.getY()), 2));
	}

}
