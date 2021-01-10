/*
 * n-sided regular polygon has sides of the same length and anles of the same degree
 * private int data field n defines the number of sides
 * 	default 3
 * private double data field named side stores the length
 * 	default 1
 * double data field named x defines the x-coordinate of the centre
 * 	default 0
 * double data field named y defines the y-coordinate of the centre
 * 	default 0
 * no arg constructor create the regular polygon with default values
 * constructor creates a regular polygon with number of sides and length of the sides
 * constructor creates a regular polygon with number of sides and length of the sides on x and y coordinates
 * accessor and mutator method for all data fields
 * getPerimeter() method
 * getArea() method
 * 
 * Write a test program that creates three objects,
 * 	RegularPolygon()
 * 	RegularPolygon(6, 4)
 * 	RegularPolygon(10, 4, 5.6, 7.8)
 * Display their perimeter and area
 */
public class RegularPolygon {

	private int n; // numbers of sides
	private double side;
	private double x;
	private double y;
	
	public RegularPolygon() {
		this(3, 1, 0, 0);
	}
	
	public RegularPolygon(int n, int side) {
		this(n, side, 0, 0);
	}
	
	public RegularPolygon(int n, int side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
	
	//accessors
	public int getNumberOfSides() {
		return this.n;
	} 
	
	public double getSidesLength() {
		return this.side;
	}
	
	public double getXCoordinate() {
		return this.x;
	}
	
	public double getYCoordinate() {
		return this.y;
	}
	
	//mutators
	public void setNumberOfSides(int n) {
		if (n > 2)
			this.n = n;
		else {
			System.out.print("Number of sides must be greater than 2.\n");
		}
	}
	
	public void setSidesLength(double side) {
		if (side > 0) {
			this.side = side;
		} else {
			System.out.print("Side length must be a non-negative real number\n");
		}
	}
	
	public void setXCoordinate(double x) {
		this.x = x;
	}
	
	public void setYCoordinate(double y) {
		this.y = y;
	}
	
	public double getPerimeter() {
		return this.n * this.side;
	}
	public double getArea() {
		return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
	}
	
}
