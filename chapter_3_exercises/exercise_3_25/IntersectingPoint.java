/*
 * Write a program that prompts the user to enter four points
 * and displays the intersecting point
 */

public class IntersectingPoint {

	public static void main(String[] args) {
		
		// line 1
		double x1 = 2, y1 = 2;
		double x2 = 5, y2 = -1.0;
		
		// line 2
		double x3 = 4.0, y3 = 2.0;
		double x4 = -1.0, y4 = -2.0;
		
		// first step
		// using Cramer's rule
		double a = y1 - y2; // parts of the line equation
		double b = x1 - x2;
		double c = y3 - y4;
		double d = x3 - x4;
		
		double e = ((a * x1 - b * y1) * -d) + b * (c * x3 - d * y3);
		double f = (a * (c * x3 - d * y3)) - (c * (a * x1 - b * y1));
		double x = e / (-a * d + b * c);
		double y = f / (-a * d + b * c);
		
		if (a * d - b * c == 0) {
			System.out.print("No solution!\n");
		} else {
			System.out.printf("The intersecting points is at (%f, %f)\n", x, y);
		}
		
		
	}
	
	

}
