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
 * 	new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3),	new MyPoint(5, 3.5)),
 * displays its area and perimeter,
 * and displays the result of
 * 	t1.contains(3, 3),
 * 	r1.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), MyPoint(1, 3.4))),
 * 	and t1 .overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint (4, –3), MyPoint(2, 6.5)))
 */

public class Run {

	public static void main(String[] args) {
		Triangle2D myTriangle = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3),	new MyPoint(5, 3.5));
		System.out.printf("Perimeter of the triangle is %f\n", myTriangle.getPerimeter());
		System.out.printf("Area of the triangle is %f \n", myTriangle.getArea());
		System.out.printf("Result of myTriangle.contains(3, 3) is %b\n", myTriangle.contains(3, 3));
		System.out.printf("Result of myTriangle.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))) is %b\n",
				myTriangle.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
		System.out.printf("Result of myTriangle.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint (4, -3), new MyPoint(2, 6.5))) is %b\n",
				myTriangle.overlaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint (4, -3), new MyPoint(2, 6.5))));
	}

}
