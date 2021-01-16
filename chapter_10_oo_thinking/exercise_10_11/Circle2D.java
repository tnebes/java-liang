/*
 * Define the Circle2D class
 * double data fields x y
 * data field radius + getter
 * noarg constructor (0,0) radius 1
 * constructor for x y and radius
 * getArea(), getPerimeter(),
 * contains(x, y) returns true if point is within circle
 * contains(Circle2d circle) returns true if the circle is inside this circle
 * overlaps(Circle2d circle) returns true if the circle overlaps with this circle
 */
public class Circle2D {

	private double x, y;
	private double radius;
	
	/**
	 * no-arg constructor
	 */
	public Circle2D() {
		this(0, 0, 1);
	}
	
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	private double distance(double x, double y) {
		return Math.sqrt(Math.pow((this.x - x), 2) + Math.pow((this.y - y), 2));
	}
	
	public boolean contains(double x, double y) {
		return distance(x, y) <= radius ? true : false;
	}
	
	public boolean contains(Circle2D circle) {
		// no need to do any further calculations if the point is not in the circle 
		if (!contains(circle.getX(), circle.getY())) {
			return false;
		} else {
			return circle.getRadius() < (this.getRadius() - distance(circle.getX(), circle.getY()));
		}
	}
	
	public boolean overlaps(Circle2D circle) {
		if (contains(circle.getX(), circle.getY())) {
			return true;
		} else {
			return this.radius + circle.getRadius() < distance(circle.getX(), circle.getY());
		}
	}
	
}
