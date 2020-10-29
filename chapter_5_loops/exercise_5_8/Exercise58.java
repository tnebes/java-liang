import java.util.Scanner;

public class Exercise58 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first and last name. ");
		String inputString = input.nextLine();
		byte emptySpace = (byte)inputString.indexOf(' ');
		String studentFirstName = inputString.substring(0, emptySpace);
		String studentLastName = inputString.substring(emptySpace + 1);
		System.out.printf("%s - %s\n", studentFirstName, studentLastName);
	}
}
