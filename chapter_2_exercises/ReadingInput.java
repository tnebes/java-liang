// A program for calculating the radius of a circle

import java.util.Scanner;

public class ReadingInput {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter the radius of the circle: ");
		double radius = keyboardInput.nextDouble();
		double area = radius * radius * Math.PI;
		System.out.println("The area for the circle of radius " + radius +
			       		" is " + area + ".");
	}
}
