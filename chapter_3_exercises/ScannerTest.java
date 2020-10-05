import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
		System.out.print("Please enter two numbers divided by spaces.");
		Scanner input = new Scanner(System.in);
		int k1 = input.nextInt();
		int k2 = input.nextInt();
		System.out.println(k1 + " " + k2);

	}
}
