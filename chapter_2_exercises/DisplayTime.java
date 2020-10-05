import java.util.Scanner;

public class DisplayTime {
	public static void main(String[] args) {
		Scanner KeyboardInput = new Scanner(System.in);
		System.out.print("Enter seconds: ");
		int seconds = KeyboardInput.nextInt();

		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		System.out.println(seconds + "seconds is " + minutes + " minutes and " + remainingSeconds + " seconds.");
	}
}

