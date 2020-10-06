public class VarArgsDemo {
	public static void main(String[] args) {
		printMax(34, 3, 3, 2, 56.2);
		printMax(new double[]{1, 2, 3});
		printMax();
	}

	public static void printMax(double... numbers) {
		// this is known as ellipsis, when I don't know how many parameters will enter a method.
		// Actually, this is a variable-length argument list
		if (numbers.length == 0) {
			System.out.println("No argument passed");
			return;
		}

		double result = numbers[0];

		for (int i = 1; i < numbers.length; i++)
			if (numbers[i] > result)
				result = numbers[i];

		System.out.println("The max value is " + result);
	}
}
