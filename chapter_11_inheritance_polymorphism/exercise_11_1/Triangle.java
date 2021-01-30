/*
 * Design a class named Triangle that extends GeometricObject
 * The class contains
 * 	three double data fields side1...side3 with default values 1
 * 	no-arg constructor for default triangle
 * 	constructor that creates a triangle with the specified side1...side3
 * 	accessors
 * 	getArea()
 * 	getPerimeter()
 * 	toString() description
 * 
 * Write a test program that prompts the user to enter three
 * sides of the triangle, a colour, and a Boolean value to indicate whether the triangle
 * is filled. The program should create a Triangle object with these sides and set
 * the colour and filled properties using the input. The program should display
 * the area, perimeter, colour, and true or false to indicate whether it is filled or not.
 *  
 */


public class Triangle extends GeometricObject {

	private double side1, side2, side3;
	private double area, perimeter;
	
	public Triangle() {
		this(1.0, 1.0, 1.0);
	}
	
	public Triangle(double side1, double side2, double side3) {
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		if (checkInvalidSide()) {
			this.side3 = this.side1 + side2 - 1;
			System.out.printf("Warning. Side3 cannot be greater or equal than the sum of the previous sides.\nSide3 set to %f\n", this.side3);
		}
		this.perimeter = calculatePerimeter();
		this.area = calculateArea();
	}
	
	private boolean checkInvalidSide() {
		if (this.side1 + this.side2 <= this.side3) {
			return true;
		}
		return false;
	}

	private double calculatePerimeter() {
		return side1 + side2 + side3; 
	}
	
	private double calculateArea() {
		double sideSum = perimeter / 2.0;
		return Math.sqrt(sideSum * (sideSum - side1) * (sideSum - side2) * (sideSum - side3));
	}
	
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	public double getArea() {
		return area;
	}

	public double getPerimeter() {
		return perimeter;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Triangle:\n\tside1 = ");
		sb.append(side1);
		sb.append("\n\tside2 = ");
		sb.append(side2);
		sb.append("\n\tside3 = ");
		sb.append(side3);
		sb.append("\n\tArea: ");
		sb.append(area);
		sb.append("\n\tPerimeter: ");
		sb.append(perimeter);
		sb.append("\n\tColour: ");
		sb.append(getColour());
		sb.append("\n\tFilled: ");
		sb.append(isFilled());
		return sb.toString();
	}

}
