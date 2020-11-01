/* Rewrite listing 3.5 using arrays.
 * For each filing status there are six tax rates.
 * Each rate is applied to a certain amount of taxable income.
 *
 * The six rates are the same for all filing statuses, which can be
 * represented in the following array:
 * double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
 *
 */
import java.util.Locale;

public class FinancialApplication {
	public static void main(String[] args) {
		double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
		int[][] brackets = {
			{8350, 33950, 82250, 171550, 372950},
			{16700, 67900, 1370505, 20885, 3729500},
			{8350, 33950, 68525, 104425, 186475},
			{11950, 45500, 117450, 190200, 372950}
		};
		String[] bracketExplanation = {"Single",
		"Married Filing Jointly or Qualifying Widow(er)",
		"Married Filing Separately",
		"Head of Household"};
		java.util.Scanner input = new java.util.Scanner(System.in);
		input.useLocale(Locale.ENGLISH);

		System.out.print("Welcome to the tax program.\n" +
		 "Choose a number that represents your category:\n");
		for (int i = 0; i < bracketExplanation.length; i++) {
			System.out.printf("%d - %s\n", i, bracketExplanation[i]);
		}
		int userBracket = input.nextInt();
		System.out.print("Enter taxable income: ");
		double income = input.nextDouble();
		double tax = calculateTax(rates, brackets, userBracket, income);
		System.out.printf("Tax is %.2f\n", tax);
	}

	public static double calculateTax(
		double[] rates,
		int[][] brackets,
		int userBracket,
		double income) {
		double tax = 0;

		for (int i = brackets[userBracket].length - 1; i >= 0; i--) {
			if (income >= brackets[userBracket][i]) {
				// exception from rule: what if the amount is larger than the bracket maximum?
				if (income >= brackets[userBracket][brackets[userBracket].length - 1]) {
					tax = (income - brackets[userBracket][i]) * rates[i + 1];
					income = brackets[userBracket][i];
				}
				// [j - 1] so that we can continue tracking the tax rates.
				for (int j = i; j > 0; j--) {
					tax += (income - brackets[userBracket][j - 1]) * rates[j];
					income = brackets[userBracket][j - 1];
				}
				tax += brackets[userBracket][0] * rates[0];
				return tax;
			}
		}
		return (income - brackets[userBracket][0]) * rates[0];
	}

}
