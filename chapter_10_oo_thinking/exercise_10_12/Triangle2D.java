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
import java.awt.geom.Line2D;

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
	 * 
	 * @return double
	 */
	private double calculateArea() {
		return Math.abs((p1.getX() * (p2.getY() - p3.getY())
				+ p2.getX() * (p3.getY() - p1.getY())
				+ p3.getX() * (p1.getY() - p2.getY())) / 2.0);
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
	 * Checks whether a point with given coordinates is contained within the triangle 
	 * @param x
	 * @param y
	 * @return boolean
	 */
	public boolean contains(double x, double y) {
		return contains(new MyPoint(x, y));
	}
	
	/**
	 * Checks whether the triangle contains another triangle.
	 * @param triangle
	 * @return boolean
	 */
	public boolean contains(Triangle2D triangle) {
		return contains(triangle.getP1()) && contains(triangle.getP2()) && contains(triangle.getP3());
	}
	
	/**
	 * Derives a set of 3 Line2D objects from a triangle. Returns the lines in an array
	 * @param triangle
	 * @return Line2D[]
	 */
	private Line2D[] triangleToLines(Triangle2D triangle) {
		final int SIDES = 3;
		// since the Line2D.Double() requires a pair of MyPoint objects, the first entry in array
		// is also the last entry in the array.
		MyPoint[] edges = {triangle.p1, triangle.p2, triangle.p3, triangle.p1};
		int edgesIndex = 0;
		Line2D[] lines = new Line2D[SIDES];
		for (int i = 0; i < lines.length; i++) {
			lines[i] = new Line2D.Double(edges[edgesIndex].getX(), edges[edgesIndex++].getY(), edges[edgesIndex].getX(), edges[edgesIndex].getY());
		}
		return lines;
	}

	/**
	 * Checks whether the triangle overlaps another triangle.
	 * @param triangle
	 * @return boolean
	 */
	public boolean overlaps(Triangle2D triangle) {

		if (contains(triangle) || triangle.contains(this))
			return true;
		else {
			Line2D[][] linesTriangles = { triangleToLines(triangle), triangleToLines(this) };
			for (int i = 0; i < linesTriangles[0].length; i++) {
				for (int j = linesTriangles[0].length - 1; j > 0; j--) {
					if (linesTriangles[0][i].intersectsLine(linesTriangles[1][j]))
						return true;
				}
			}
		}
		return false;
	}
	
	
}
