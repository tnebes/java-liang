import java.util.Scanner;

public class CalculatingPerimeter {
	public static void main(String[] args) {
		System.out.print("Enter a radius of a circle to get a perimeter: ");
		Scanner KeyboardInput = new Scanner(System.in);
		double diameter = KeyboardInput.nextDouble() * 2;
		double perimeter = (int) diameter * Math.PI;
		System.out.println("The perimeter of circle with radius " + diameter/2.0 + " is " + perimeter);
	}
}


