import java.util.Scanner;

public class Exercise546{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String stringInput = input.nextLine();

		String newString = "";
		for (char i: stringInput.toCharArray()) {
			newString = i + newString;			
		}
		System.out.println(newString);
	}
}
