/*
 * Define a Triangle2D class that contains
 * p1, p2, and p3 of MyPoint type
 * Constructor with points and no-arg constructor
 * getArea() method
 * getPerimeter() method
 * contains(myPoint p) : boolean
 * contains(Triangle2D t) : boolean
 * overlaps(Triangle2D t) : boolean
 * 
 * 
 */
public class Triangle2D {

	private MyPoint p1, p2, p3;
	private double a, b, c; // sides of the triangle
	private double area, perimeter;
	
	/**
	 * no-arg constructor
	 */
	public Triangle2D() {
		this(new MyPoint(0,0), new MyPoint(1,1), new MyPoint(2,5));
	}
	
	/**
	 * Constructor
	 * @param p1
	 * @param p2
	 * @param p3
	 */
	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.a = distance(p1, p2);
		this.b = distance(p2, p3);
		this.c = distance(p3, p1);
		this.area = calculateArea();
		this.perimeter = calculatePerimeter();
	}
	
	/**
	 * Calculates the distance between 2 MyPoint objects
	 * @param point1
	 * @param point2
	 * @return double
	 */
	private double distance(MyPoint point1, MyPoint point2) {
		return Math.sqrt(Math.pow((point1.getX() - point2.getX()), 2) + Math.pow((point1.getY() - point2.getY()), 2));
	}
	
	private double calculateArea() {
		// uses Heron's formula
		double halfPerimeter = this.getPerimeter() / 2;
		return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
	}
	
	private double calculatePerimeter() {
		return a + b + c;
	}
	
	public double getArea() {
		return area;
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	
	public boolean contains(MyPoint point) {
		return false;
	}
	
	
	
}
