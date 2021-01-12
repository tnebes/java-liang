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

public class Run {

	public static void main(String[] args) {
		MyPoint point0 = new MyPoint();
		MyPoint point1 = new MyPoint(10, 30.5);
		
		System.out.printf("Distance between (%.2f, %.2f) and (%.2f, %.2f) is %.2f", point0.getX(), point0.getY(),
				point1.getX(), point1.getY(), MyPoint.distance(point0, point1));
	}
	
}
