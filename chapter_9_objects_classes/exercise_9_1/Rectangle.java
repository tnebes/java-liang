/*
 * Design a class named Rectangle.
 * The class contains:
 * 	two double width and height, default 1
 * 	no-arg constructor
 * 	constructor that creates a rectnagle of width and height
 * 	method named getArea()
 * 	method named getPerimeter()
 * 	Write a test program that creates two Rectangle objects: 4, 40 and 3.5, 35.9.
 * 	Display width, height, area and perimeter.
 */

public class Rectangle {
	private double width, height, area, perimeter;

	// no-arg constructor
	public Rectangle() {
		this(1, 1);
	}

	// constructor
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return this.width;
	}

	public double getHeight() {
		return this.height;
	}

	public double getArea() {
		return this.width * this.height;
	}

	public double getPerimeter() {
		return 2 * (this.width + this.height);
	}

}