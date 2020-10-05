public class PrintfTest {
	public static void main(String[] args) {
		// this would be an incorrect way to use the print method.

		double amount = 12618.98;
		double interestRate = 0.0013;
		double interest = amount * interestRate;
		System.out.println("Interest is $" + interest);
		// this is bad because I get a lot of trailing decimals.
		// It would be better to use printf().
		
		System.out.printf("Interest is $%4.2f\n", interest);
		// what does the following syntax do
		// $ is mine because I need to display dollars.
		// % is the identifier? It tells the compiler
		// that I want something formatted.
		// EDIT: it is a format specifier.
		// 4 is the field width.
		// 2 is the precisio
		// f is the conversion code (float?) and format specifier.
		// let's check with different settings.
		System.out.printf("Interest is $%4.4f\n", interest);
		System.out.printf("Interest is $%6.2f\n", interest);
		System.out.printf("Interest is $%2.2f\n", interest);



		
	}
}
