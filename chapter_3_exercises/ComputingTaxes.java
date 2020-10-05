import java.util.Scanner;

public class ComputingTaxes {
	public static void main(String[] args) {

	final double EPSILON = 1E-14;

	Scanner input = new Scanner(System.in);

	byte userStatus = -1;
	
	while (userStatus < 0 || userStatus > 4) {
		System.out.print("Please enter your status for the purpose of calculating taxes.\n" +
			"Enter 0 if you are single\n" +
			"Enter 1 if filing jointly or you are a qualified widower\n" +
			"Enter 2 if you are married yet filing seperately\n" +
			"Enter 3 if you are the head of the household.\n" +
			"0/1/2/3 ");
	       	userStatus = input.nextByte();
		}
	
	System.out.print("Please enter your annual income in $ including cents.\n" +
				"e.g. 12495,21\n" +
				"My annual income: ");
	double userIncome = input.nextDouble() * 100;
	int taxRate;
	switch(userStatus) {

		case 0: if (userIncome < 8350 * 100) {taxRate = 10;}
			else if (userIncome < 33950 * 100) {taxRate = 15;}
			else if (userIncome < 82250 * 100) {taxRate = 25;}
			else if (userIncome < 171550 * 100) {taxRate = 28;}
			else if (userIncome < 372950 * 100) {taxRate = 33;}
			else {taxRate = 35;}
			break;
		case 1: if (userIncome < 16700 * 100) {taxRate = 10;}
			else if (userIncome < 67900 * 100) {taxRate = 15;}
			else if (userIncome < 137050 * 100) {taxRate = 25;}
			else if (userIncome < 208850 * 100) {taxRate = 28;}
			else if (userIncome < 372950 * 100) {taxRate = 33;}
			else {taxRate = 35;}
			break;
		case 2: if (userIncome < 8350 * 100) {taxRate = 10;}
			else if (userIncome < 33950 * 100) {taxRate = 15;}
			else if (userIncome < 68525 * 100) {taxRate = 25;}
			else if (userIncome < 104425 * 100) {taxRate = 28;}
			else if (userIncome < 186475 * 100) {taxRate = 33;}
			else {taxRate = 35;}
			break; 
 		case 3: if (userIncome < 16700 * 100) {taxRate = 10;}
			else if (userIncome < 11950 * 100) {taxRate = 15;}
			else if (userIncome < 45500 * 100) {taxRate = 25;}
			else if (userIncome < 117450 * 100) {taxRate = 28;}
			else if (userIncome < 372950 * 100) {taxRate = 33;}
			else {taxRate = 35;}
			break; 
 		default: System.out.println("I'm calling FBI.");
			 taxRate = 0;
		}
	System.out.println("Your marginal tax rate is " + taxRate + "%.");
	double userTaxPay = userIncome * (taxRate / 100.0);
	System.out.println("On your annual income of $" + userIncome / 100 +
		       " you must pay $" + (userTaxPay / 100));
	}
}
	

