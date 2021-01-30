/*
 *
 * Write a test program that prompts the user to enter three
 * sides of the triangle, a colour, and a Boolean value to indicate whether the triangle
 * is filled. The program should create a Triangle object with these sides and set
 * the colour and filled properties using the input. The program should display
 * the area, perimeter, colour, and true or false to indicate whether it is filled or not.
 *  
 */

public class Run {

	public Run() {
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter the three sides of a triangle: ");
		Triangle myTriangle = new Triangle(input.nextDouble(), input.nextDouble(), input.nextDouble());
		System.out.print("Enter triangle colour: ");
		myTriangle.setColour(input.next());
		System.out.print("Triangle filled? Y/N ");
		myTriangle.setFilled(input.next().toLowerCase().equals("y") ? true : false);
		System.out.printf("%s\n", myTriangle.toString());
		input.close();
	}
	
	public static void main(String[] args) {
		new Run();
	}

}
