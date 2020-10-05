import java.util.Scanner;

public class RandomNumberGenerator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter maximum RNG number: ");
		int maxRandomNumber = input.nextInt();
		double debugRandomNumber = Math.random();
		System.out.println(debugRandomNumber);
		int randomNumber = 0;
		int numberOfTries = 0;
		while (randomNumber != maxRandomNumber - 1) {
			randomNumber = (int) (debugRandomNumber * maxRandomNumber);
			System.out.println("Your random number is: " + randomNumber);
			numberOfTries++;
			debugRandomNumber = Math.random();
		}
		System.out.println("You got the maximum RNG number in " + numberOfTries + " attempts.");
	}
}


