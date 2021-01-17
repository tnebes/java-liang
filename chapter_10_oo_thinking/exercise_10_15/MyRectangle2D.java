import java.awt.geom.Line2D;

/**
 * @author tnebes
 *
 */
public class MyRectangle2D {
	
	private static final double EPSILON = 1e-14;
	private MyPoint2D centre;
	private double width, height;
	private double area, perimeter;
	private MyPoint2D p1, p2, p3, p4;
	private MyPoint2D[] edges;
	private MyLine2D l1, l2, l3, l4;
	private MyLine2D[] lines;
	
	/**
	 * no-arg constructor
	 */
	public MyRectangle2D() {
		this(0, 0, 1, 1);
	}
	
	/**
	 * Constructor with double values
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public MyRectangle2D(double x, double y, double width, double height) {
		this(new MyPoint2D(x, y), width, height);
	}
	
	/**
	 * Constructor
	 * @param centre
	 * @param width
	 * @param height
	 */
	public MyRectangle2D(MyPoint2D centre, double width, double height) {
		this.centre = centre;
		this.width = width;
		this.height = height;
		doCalculations();
	}
	
	/**
	 * Calculates all the static fields
	 * required for the object to function
	 */
	public void doCalculations() {
		calculatePoints();
		calculateLines();
		calculateArea();
		calculatePerimeter();
		edges = new MyPoint2D[] { p1, p2, p3, p4 };
		lines = new MyLine2D[] { l1, l2, l3, l4 };
	}
	
	/**
	 * Calculates there the edges of the rectangle are
	 */
	private void calculatePoints() {
		//p1 is at bottom left
		p1 = new MyPoint2D(centre.getX() - (width / 2.0), centre.getY() + (height / 2.0));
		p2 = new MyPoint2D(p1.getX() + width, p1.getY());
		p3 = new MyPoint2D(p2.getX(), p2.getY() - height);
		p4 = new MyPoint2D(p3.getX() - width, p3.getY());
	}
	
	/**
	 * Calculates the position of the lines that make up the rectangle
	 */
	private void calculateLines() {
		l1 = new MyLine2D(p1, p2);
		l2 = new MyLine2D(p2, p3);
		l3 = new MyLine2D(p3, p4);
		l4 = new MyLine2D(p4, p1);
		assert(Math.abs(l1.getLength() - width) < EPSILON);
		assert(Math.abs(l2.getLength() - height) < EPSILON);
		assert(Math.abs(l3.getLength() - width) < EPSILON);
		assert(Math.abs(l4.getLength() - height) < EPSILON);
	}
	
	/**
	 * calculates the area of the triangle
	 */
	private void calculateArea() {
		area = width * height;
	}
	
	/**
	 * Calculates the perimeter of the rectangle
	 */
	private void calculatePerimeter() {
		perimeter = (2 * width) + (2 * height);
	}
	
	/*
	 * accessors
	 */
	public double getX() {
		return centre.getX();
	}
	
	public double getY() {
		return centre.getY();
	}
	
	public double getArea() {
		return area;
	}
	
	public double getPerimeter() {
		return perimeter;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}
	
	public MyLine2D[] getLines() {
		return lines;
	}
	
	public MyPoint2D[] getEdges() {
		return edges;
	}
	
	/*
	 * mutators
	 */
	public void setX(double x) {
		centre.x = x;
		doCalculations();
	}
	
	public void setY(double y) {
		centre.y = y;
		doCalculations();
	}
	
	public void setWidth(double width) {
		this.width = width;
		doCalculations();
	}
	
	public void setHeight(double height) {
		this.height = height;
		doCalculations();
	}
	
	/**
	 * Returns true if the point is contained within the rectangle
	 * @param point
	 * @return
	 */
	public boolean contains(MyPoint2D point) {
		return point.getX() >= p1.getX() && point.getX() <= p2.getX() &&
				point.getY() <= p2.getY() && point.getY() >= p3.getY();
	}
	
	/**
	 * Returns true if the point is contained within the rectangle
	 * @param point
	 * @return
	 */	
	public boolean contains(double x, double y) {
		return contains(new MyPoint2D(x, y));
	}
	
	/**
	 * Returns true if a rectangle is contained within the rectangle
	 * @param point
	 * @return
	 */
	public boolean contains(MyRectangle2D rectangle) {
		MyPoint2D[] rectangleEdges = rectangle.getEdges();
		for (int i = 0; i < rectangleEdges.length; i++) {
			if (!this.contains(rectangleEdges[i])) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Returns true if a rectangle overlaps the rectangle
	 * @param point
	 * @return
	 */
	public boolean overlaps(MyRectangle2D rectangle) {
		if (this.contains(rectangle) || rectangle.contains(this)) {
			return true;
		} else {
			// this is catastrophically bad
			// don't do this
			Line2D[][] newLines = new Line2D[2][4];
			for (int i = 0; i < newLines[0].length; i++) {
				newLines[0][i] = new Line2D.Double(lines[i].getPoint1().getX(), lines[i].getPoint1().getY(),
						lines[i].getPoint2().getX(), lines[i].getPoint2().getY());
			}
			MyLine2D[] rectangleLines = rectangle.getLines();
			for (int i = 0; i < newLines[1].length; i++) {
				newLines[1][i] = new Line2D.Double(rectangleLines[i].getPoint1().getX(),
						rectangleLines[i].getPoint1().getY(), rectangleLines[i].getPoint2().getX(),
						rectangleLines[i].getPoint2().getY());
			}
			for (int i = 0; i < newLines[0].length; i++) {
				for (int j = newLines[1].length - 1; j > i; j--) {
					if (newLines[0][i].intersectsLine(newLines[1][j]))
						return true;
				}
			}
		}
		return false;
	}

	

	/**
	 * A simple MyPoint class
	 * @author tnebes
	 *
	 */
	static class MyPoint2D {
		
		private double x, y;
		/**
		 * Constructor
		 * @param x
		 * @param y
		 */
		MyPoint2D(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		/**
		 * Returns x coordinate
		 * @return double
		 */
		public double getX() {
			return x;
		}
		
		/**
		 * Returns y coordinate
		 * @return double
		 */
		public double getY() {
			return y;
		}
		
	}
	
	/**
	 * Simple MyLine class
	 * @author tnebes
	 *
	 */
	static class MyLine2D {
		private MyPoint2D point1, point2;
		private double length;
		
		/**
		 * Constructor
		 * @param x1
		 * @param y1
		 * @param x2
		 * @param y2
		 */
		private MyLine2D(double x1, double y1, double x2, double y2) {
			this(new MyPoint2D(x1, y1), new MyPoint2D(x2, y2));
		}
		
		/**
		 * Constructor
		 * @param point1
		 * @param point2
		 */
		private MyLine2D(MyPoint2D point1, MyPoint2D point2) {
			this.point1 = point1;
			this.point2 = point2;
			this.length = calculateLength(point1, point2);
		}
		
		/**
		 * Calculates the distance between two points. Assumes that the rectangle is not rotated.
		 * Otherwise it will not work.
		 * @param point1
		 * @param point2
		 * @return double
		 */
		private double calculateLength(MyPoint2D point1, MyPoint2D point2) {
			if (Math.abs(point1.getX() - point2.getX()) < EPSILON)
				return Math.abs(point1.getY() - point2.getY());
			else
				return Math.abs(point1.getX() - point2.getX());
		}
		
		/**
		 * Returns the length of the line
		 * @return
		 */
		public double getLength() {
			return length;
		}
		
		/**
		 * Returns the first point of the line
		 * @return
		 */
		public MyPoint2D getPoint1() {
			return point1;
		}
		
		/**
		 * Returns the second point of the line
		 * @return
		 */
		public MyPoint2D getPoint2() {
			return point2;
		}

	}
	
	

}
