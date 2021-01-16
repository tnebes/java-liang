/*
 * Define a Triangle2D class that contains
 * p1, p2, and p3 of MyPoint type
 * Constructor with points and no-arg constructor
 * getArea() method : double
 * getPerimeter() method : double
 * contains(myPoint p) : boolean
 * contains(Triangle2D t) : boolean
 * overlaps(Triangle2D t) : boolean
 * 
 * Write a test program that creates a Triangle2D object t1
 * using the constructor
 * 	new Triangle2D(new MyPoint(2.5, 2),
 * 	new MyPoint(4.2, 3),
 * 	new MyPoint(5, 3.5)),
 * displays its area and perimeter,
 * and displays the result of
 * 	t1.contains(3, 3),
 * 	r1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3.4))),
 * 	and t1 .overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint (4, –3), MyPoint(2, 6.5)))
 */
public class Triangle2D {

	private MyPoint p1, p2, p3;
	private double a, b, c; // sides of the triangle
	private double area, perimeter;
	private final double EPSILON = 1e-14;
	
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
		this.a = p1.distance(p2);
		this.b = p2.distance(p3);
		this.c = p3.distance(p1);
		this.perimeter = calculatePerimeter();
		this.area = calculateArea();		
	}
	
	/**
	 * Calculates the perimeter when the object is instantiated
	 * @return double
	 */
	private double calculatePerimeter() {
		return a + b + c;
	}
	
	/**
	 * Calculates the area when the object is instantiated
	 * @return double
	 */
	private double calculateArea() {
		// uses Heron's formula
		double halfPerimeter = perimeter / 2d;
		return Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
	}
	
	/**
	 * Returns the area of the triangle
	 * @return double
	 */
	public double getArea() {
		return area;
	}
	
	/**
	 * Returns the perimeter of the triangle
	 * @return double
	 */
	public double getPerimeter() {
		return perimeter;
	}
	
	/**
	 * Returns the MyPoint object
	 * @return MyPoint
	 */
	public MyPoint getP1() {
		return p1;
	}
	
	/**
	 * Returns the MyPoint object
	 * @return
	 */
	public MyPoint getP2() {
		return p2;
	}
	
	/**
	 * Returns the MyPoint object
	 * @return
	 */
	public MyPoint getP3() {
		return p3;
	}

	/**
	 * Checks whether a point is contained within the triangle.
	 * This is done by instantiating 3 triangles whose 1 point is the given point.
	 * If the area of the three triangles is similar to the area of the original triangle
	 * the point is in the triangle.
	 * @param point
	 * @return boolean
	 */
	public boolean contains(MyPoint point) {
		double area1 = new Triangle2D(point, p1, p2).getArea();
		double area2 = new Triangle2D(point, p2, p3).getArea();
		double area3 = new Triangle2D(point, p3, p1).getArea();
		return Math.abs((area1 + area2 + area3) - this.getArea()) < EPSILON;
	}
	
	/**
	 * Checks whether the triangle contains another triangle.
	 * @param triangle
	 * @return boolean
	 */
	public boolean contains(Triangle2D triangle) {
		return contains(triangle.getP1()) && contains(triangle.getP2()) && contains(triangle.getP3());
	}
	
	public boolean overlaps(Triangle2D triangle) {
		return contains(triangle.getP1()) && contains(triangle.getP2()) && contains(triangle.getP3());
	}
	
	
	
}
