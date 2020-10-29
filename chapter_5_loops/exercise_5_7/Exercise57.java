import java.util.Scanner;

public class Exercise57 {
	public static void main(String[] args) {
		// calculating future tuition.
		double tuition = 10000 * 100.0; // converting to cents.
		double tuitionIncrease = 1.06;
		int years;
		double amount;
		double totalTuition = 0;
		int afterYears;

		Scanner input = new Scanner(System.in);

		System.out.print("Calculate (y)ears or (a)mount? ");
		if (input.next().toLowerCase().equals("y")) {
			System.out.print("Calculate for how many years? ");
			years = input.nextInt();
			for (int i = 1; i <= years; i++) {
				System.out.printf("Tuition for year %d is $%.2f\n", i,
					       (tuition / 100.0));
				tuition *= tuitionIncrease;
				totalTuition += tuition;
			}
			System.out.printf("The tuition after %d is $%.2f\n", years, (totalTuition / 100.0));
		}
		else {
			System.out.print("How much money are you willing to spend? $");
			amount = (input.nextDouble() * 100.0);
			for (int i = 1; ; i++) {
				tuition *= tuitionIncrease;
				totalTuition += tuition;
				afterYears = i;
				if (totalTuition >= amount) {
					System.out.printf("For %.2f you can study for %d years.\n",
							(amount / 100.0), afterYears);
					break;
				}				
			}
		}
	}
}
