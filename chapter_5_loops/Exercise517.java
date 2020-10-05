import java.util.Scanner;

public class Exercise517 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of lines: ");
		int numberOfLines = input.nextInt();

		for (int i = numberOfLines; i != 0; i--) {
			for (int j = i; j != 0; j--) {
				System.out.printf("%1d ", j);
			}
			for (int j = 2; j <= i; j++) {
				System.out.printf("%1d ", j);
			}
			System.out.print("\n");
		}
	}
}
