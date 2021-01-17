/*
 * Write a method that returns a bounding rectangle for a set of points in a two dimensional
 * plane, as follows
 * public static MyRectangle2D getRectangle(double[][] points)
 * 
 * Write a test program that prompts the user to enter five points and displays the bounding rectangle's center, width and height.
 */
public class BoundingRectangle {

	static final double EPSILON = 1e-14;

	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter five points: ");
		double[][] pointArray = new double[5][2];
		for (int i = 0; i < pointArray.length; i++) {
			for (int j = 0; j < pointArray[0].length; j++) {
				pointArray[i][j] = input.nextDouble();
			}
		}
		input.close();

		MyRectangle2D myRectangle = getRectangle(pointArray);
		System.out.printf("Rectangle centered at (%f, %f).\nWidth: %f\nHeight: %f\nEdges:\n", myRectangle.getX(),
				myRectangle.getY(), myRectangle.getWidth(), myRectangle.getHeight());
		{
			MyRectangle2D.MyPoint2D[] myRectangleEdges = myRectangle.getEdges();
			for (int i = 0; i < myRectangleEdges.length; i++) {
				System.out.printf("(%f, %f)\n", myRectangleEdges[i].getX(), myRectangleEdges[i].getY());
			}

		}

	}

	public static MyRectangle2D getRectangle(double[][] points) {
		// initialise
		double minX = points[0][0], maxX = points[0][0];
		double minY = points[0][1], maxY = points[0][1];
		double width, height;

		for (int i = 0; i < points.length; i++) {
			if (points[i][0] < minX)
				minX = points[i][0];
			else if (points[i][0] > maxX)
				maxX = points[i][0];
			if (points[i][1] < minY)
				minY = points[i][1];
			else if (points[i][1] > maxY)
				maxY = points[i][1];
		}
		width = Math.abs(minX - maxX);
		height = Math.abs(minY - maxY);
		return new MyRectangle2D((maxX + minX) / 2, (maxY + minY) / 2, width, height);
	}

}
