// import can be disregarded by:
// import java.util.Scanner;

public class AnalyzeNumbers {
	public static void main(String[] args) {
		// instead of this
		// Scanner input = new Scanner(System.in);
		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Enter the number of items: ");
		int numberOfItems = input.nextInt();
		double[] numbers = new double[numberOfItems];
		double sum = 0;

		System.out.print("Enter the numbers");
		for (int i = 0; i < numberOfItems; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}

		double average = sum / numberOfItems;

		int count = 0;
		for (int i = 0; i < numberOfItems; i++) {
			if (numbers[i] > average)
				count++;
		}
		
		System.out.printf("\nAverage is %f\n", average);
		System.out.printf("Number of elements above the average is %d.", count);
	}
}

