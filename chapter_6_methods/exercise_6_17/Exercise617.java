import java.util.Scanner;

public class Exercise617 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter the size of the randomly generated matrix: ");
		printMatrix(input.nextInt());
	}

	public static void printMatrix(int n) {
		char randomChar;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {

				randomChar = ((int) (Math.random() * 2) == 0) ? '0' : '1';

				/* commented out to see whether it's faster.
				 * if ((int) (Math.random() * 2) == 0) {
					randomChar = '0';
				} else {
					randomChar = '1';
				}
				*/

				System.out.printf("%c", randomChar);
			}
			System.out.print("\n");
		}
	}
}
