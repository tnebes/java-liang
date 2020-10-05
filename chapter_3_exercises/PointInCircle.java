import java.util.Scanner;

public class PointInCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userX, userY;
		final int CIRCLE_RADIUS = 10;
		final int CIRCLE_X = 0, CIRCLE_Y = 0;

		System.out.print("Welcome to this unique and ingenious program\n" +
				"that checks whether a point in a circle of radius " +
				CIRCLE_RADIUS + ". Please enter X and Y coordinates.\n" +
				"X: ");
		userX = input.nextInt();
		System.out.print("Enter Y coordinate: ");
		userY = input.nextInt();

		double distance = Math.sqrt(Math.pow((userX - CIRCLE_X), 2) + Math.pow((userY - CIRCLE_Y), 2));
		System.out.println((distance <= CIRCLE_RADIUS) ? "Point is in radius" : "Point is outside of radius");

	}
}
