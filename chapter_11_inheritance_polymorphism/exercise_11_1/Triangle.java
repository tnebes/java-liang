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
		checkInvalidSides();
		this.perimeter = calculatePerimeter();
		this.area = calculateArea();
	}
	
	private void checkInvalidSides() {
		if (side1 + side2 < side3)
			resetTriangle();
		else if (side1 + side3 < side2)
			resetTriangle();
		else if (side2 + side3 < side1)
			resetTriangle();
	}
	
	private void resetTriangle() {
		this.side1 = 1.0;
		this.side2 = 1.0;
		this.side3 = 1.0;
		System.out.print("Invalid input. Sides set to 1\n");
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
