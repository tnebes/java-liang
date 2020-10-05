import java.util.Scanner;

public class BabylonianMethod {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		System.out.print("Please enter a number to reveal its square root.\n");
		long theNumber = input.nextLong();
		System.out.printf("The square root of %d is %f\n",theNumber ,sqrt(theNumber));

		for(int i = 1; i < 1000; i++) {
			System.out.printf("The square root of %d is %f\n",i ,sqrt(i));
		}



	}

	public static double sqrt(long n) {

		final double EPSILON = 1E-5;	
		double nextGuess;
		double lastGuess = 1.0;

		while(true) {
			nextGuess = (lastGuess + n / lastGuess) / 2;
			if(Math.abs(lastGuess - nextGuess) < EPSILON) {
				return nextGuess;
			} else {
				lastGuess = nextGuess;
			}
		}
	}
}
