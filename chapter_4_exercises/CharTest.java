import java.util.Scanner;

public class CharTest {
	public static void main(String[] args) {
		int counter = 0;
		char someLetter = '\u0030';

		while (counter < 5000) {
			System.out.println("The symbol " + someLetter + 
					" is " + (int) someLetter);
			counter++;
			someLetter++;
		}
	}
}
