import java.util.Scanner;

public class FormatDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// header of table
		System.out.printf("%10s%-10s%-10s%-10s%-10s\n", "Degrees",
				"Radians", "Sine", "Cosine", "Tangent");
		// interesting. I don't have to use variables, I can insert
		// Strings as well.
		// %-10s means that it's left justified.

		System.out.print("Insert degrees: ");
		int degrees = input.nextInt();
		double radians = Math.toRadians(degrees);
		System.out.printf("%10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees,
				radians, Math.sin(radians), Math.cos(radians),
				Math.tan(radians));

		while (true) {
			System.out.print("Input degrees: ");
			degrees = input.nextInt();
			radians = Math.toRadians(degrees);
			System.out.printf("%10d%-10.4f%-10.4f%-10.4f%-10.4f\n", degrees,
				radians, Math.sin(radians), Math.cos(radians),
				Math.tan(radians));
			System.out.print("Continue? Y/N ");
			if (input.next().toUpperCase().equals("N")) {
				break;
			}
		}
	}
}
