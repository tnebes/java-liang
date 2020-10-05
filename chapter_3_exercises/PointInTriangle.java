import java.util.Scanner;

public class PointInTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int triangleX0 = 0, triangleX1 = 0, triangleX2 = 200;
		int triangleY0 = 0, triangleY1 = 100, triangleY2 = 0;

		System.out.print("Enter X coordinate of a point to check" +
				" whether it resides in the triangle.\nX = ");
		int userX = input.nextInt();
		System.out.print("Y = ");
		int userY = input.nextInt();

		boolean isBelowOrOnHypothenuse = ( -userX/2 + 100) >= userY;
		//System.out.println(isBelowOrOnHypothenuse);
		boolean isInTriangle = (isBelowOrOnHypothenuse
			&& userX >= triangleX0 && userX <= triangleX2
			&& userY >= triangleY0 && userY <= triangleY1);
		System.out.println("Point(" + userX + "," + userY +
					") is in the triangle? " + isInTriangle);

	}
}
