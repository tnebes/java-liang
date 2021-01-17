/* 
 * Write a test program that creates a MyRectangle2D object r1 (new MyRectangle2D (2, 2, 5.5, 4.9)),
 * displays its area and perimeter,
 * and displays the result of
 * 	 r1.contains(3, 3),
 * 	 r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)),
 * 	 and r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)).
 * 
 */

public class Run {

	public static void main(String[] args) {
		MyRectangle2D r1 = new MyRectangle2D (2, 2, 5.5, 4.9);
		System.out.printf("Area: %f\n", r1.getArea());
		System.out.printf("Perimeter: %f\n", r1.getPerimeter());
		System.out.printf("r1.contains(3, 3): %b\n", r1.contains(3, 3));
		System.out.printf("r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)): %b\n", r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
		System.out.printf("r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)): %b\n", r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));

	}

}
