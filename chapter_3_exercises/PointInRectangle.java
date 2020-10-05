import java.util.Scanner;

public class PointInRectangle {
	public static void main(String[] args) {
		// make a program that firstly defines the X,Y coordinates of
		// a rectangle so that the XY is the lower left point of the
		// rectangle.
		// The user inputs the length of the rectangle.
		// For beginning purposes we will make it so that it's 2:1.
		// e.g. Rectangle with a = 10 will have b = 5.
		// Then the user can input a point and we will calculate the
		// distance and check whether it's in the rectangle.

		Scanner input = new Scanner(System.in);

		while(true) {
			System.out.print("Please enter the X,Y origin of the" +
					" rectangle.\nThe origin is lower left" + 
					" edge of a rectangle.\nX = ");
			int rectangleX1 = input.nextInt();
			System.out.print("Y = ");
			int rectangleY1 = input.nextInt();
			System.out.print("Please enter the length of the longest" + 
					" side of the rectangle. The other pair will" +
					" be the half of the length of the number you" +
					" enter.\nRectangle side length: ");
			int rectangleLength = input.nextInt();
			int rectangleX2 = rectangleX1 + rectangleLength;
			int rectangleY2 = rectangleY1 + (rectangleLength / 2);
			int rectangleCentreX = (rectangleX1 + rectangleX2) / 2;
			int rectangleCentreY = (rectangleY1 + rectangleY2) / 2;

			System.out.println("(" + rectangleX1 + "," + rectangleY1 + ")," +
				"(" + rectangleX2 + "," + rectangleY2 + ").\nCentre of" +
			       " rectangle is (" + rectangleCentreX + "," +
			       rectangleCentreY + ")");
			
			while(true) {
				System.out.print("Enter a point's position to check" +
						"whether it resides in a rectangle.\n" +
						"X = ");
				int pointX = input.nextInt();
				System.out.print("Y = ");
				int pointY = input.nextInt();
				boolean isInside = ((pointX - rectangleCentreX) <= (rectangleLength /2) 
						&& (pointY - rectangleCentreY) <= (rectangleLength /4))
				       		? true : false;
				System.out.println("Point is in rectangle: " + isInside);
				System.out.print("Check another point? y/n ");
				if (input.next().toLowerCase().equals("n"))
						break;
			}
		System.out.print("Check for another rectangle? y/n ");
		if (input.next().toLowerCase().equals("n"))
			break;
		}
	}
}
