import java.util.Scanner;

public class GetDesiredRandomNumber {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);	
		boolean resumeGeneration = true;
		int randomNumber;
		int generationAttempt = 0;

		while (true) {
			System.out.print("Enter maximum number for RNG: ");
			int maximumRandomNumber = (int) (input.nextInt() + 1);
			System.out.print("Do you wish to search for the maximum number? y/n ");
			if (input.next().toLowerCase().equals("y")) {
				while (true) {
					randomNumber = (int) (Math.random() * maximumRandomNumber);
					if (randomNumber == maximumRandomNumber - 1) {
						System.out.println("Maximum number " +
								randomNumber + " found in " +
								generationAttempt++ + " attempts!");
						break;
					}
					else {
						System.out.println(generationAttempt++ + " random number: " + randomNumber);
					}
				}
			}
			else {
				System.out.println((int) (Math.random() * maximumRandomNumber));
			}
			System.out.print("Do another search? y/n ");
			if (input.next().toLowerCase().equals("n")) {
				break;
			}
		}
	}
}

