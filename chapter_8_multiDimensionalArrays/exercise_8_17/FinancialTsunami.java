/* A bank's total assets are its current balance plus its loans
 * to ther banks.
 * The banks' current balances are 25, 125, 175, 75 and 181 million
 * dollars respectively.
 *
 * ** pictures **
 *
 * If a bank's total assets are under a certain limit, the bank is
 * unsafe. Consequently, the lender may also be unsafe,
 * if its total assets are under the limit.
 *
 * Write a program to find all the unsafe banks.
 *
 * Your program reads the input:
 *	It first reads integers n and limit
 *		n is number of banks
 *		limit is the minimum total assets for keeping a bank safe
 *
 *	it then reads n lines that describe the information for n banks
 *	with IDs from 0 to n-1
 *	The first number in the line is the bank's balance
 *	the second number indicates the number of banks that borrowed
 *	money from the bank, and the rest are pairs of two numbers.
 *	Each pair describes a borrower. The first number in the pair is the 
 *	borrower's ID and the second is the amount borrowed
 *
 *	Expected output of program is that banks 3 and 1 are unsafe.
 *
 * Use a two-dimensional array borrowers to represent loans.
 * borrowers[i][j] indicates the amount that bank i gives to bank j
 * Once j becomes unsafe, borrowers[i][j] should be set to 0.
 */

import java.util.Locale;

public class FinancialTsunami {
	public static void main(String[] args) {
		java.util.Scanner input = new java.util.Scanner(System.in);
		input.useLocale(Locale.ENGLISH);

		int numOfBanks = input.nextInt(), limit = input.nextInt();
		System.out.printf("Loaded number of banks: %d\nLimit set to $%dM.\n",
			numOfBanks, limit);

		double[][] bankStatus = new double[numOfBanks][2];
		double[][] borrowers = new double[numOfBanks][numOfBanks];

		for (int i = 0; i < numOfBanks; i++) {
			bankStatus[i][0] = input.nextDouble();
			int numOfBorrower = input.nextInt();
			for (int j = 0; j < numOfBorrower; j++) {
				borrowers[i][input.nextInt()] = input.nextDouble();
			}				
		}
		for (int i = 0; i < bankStatus.length; i++) {
			System.out.printf("Bank %d starting balance is $%.2fM\n",
				i, bankStatus[i][0]);			
		}
		for (int i = 0; i < borrowers.length; i++) {
			for (int j = 0; j < borrowers[i].length; j++) {
				if (borrowers[i][j] != 0)
					System.out.printf("Bank %d borrowed bank %d $%.2fM\n",
						i, j, borrowers[i][j]);
			}
		}
		int[] unsafeBanks = new int[numOfBanks];
		// filling the array with -1 as 0 is bank 0
		for (int i = 0; i < unsafeBanks.length; i++) {
			unsafeBanks[i] = -1;
		}
		for (int i = 0; i < borrowers.length; i++) {
			for (int j = borrowers.length - 1; j > 0; j--) {
				calculateBalance(bankStatus, borrowers);
				checkUnsafe(bankStatus, limit, borrowers, unsafeBanks);
			}
		}
		for (int i = 0; i < unsafeBanks.length; i++) {
			if (unsafeBanks[i] != -1)
				System.out.printf("Bank %d is unsafe.\n",
					unsafeBanks[i]);
		}
	}

	/** calculates the total assets of a bank which are its initial balance
	 * and all the loans it gave out. */
	public static void calculateBalance(double[][] status, double[][] borrowers) {
		double sum = 0;
		for (int i = 0; i < status.length; i++) {
			sum = status[i][0];
			for (int j = 0; j < borrowers[i].length; j++) {
				sum += borrowers[i][j];
			}
			status[i][1] = sum;
		}
	}

	/** checks whether any of the bank's current assets are below the limit.
	 *  If true, the bank can no longer lend money
	 *  and any lent money to it is destroyed. */
	public static void checkUnsafe(double[][] status, int limit, double[][] borrowers, int[] unsafe) {
		for (int i = 0; i < status.length; i++) {
			if (status[i][1] < (double) limit) {
				for (int j = 0; j < borrowers[i].length; j++) {
					borrowers[i][j] = 0;
					borrowers[j][i] = 0;
				}
				if (!isInArray(unsafe, i)) {
					unsafe[findFirstAvailable(unsafe)] = i;
				}
			}
		}
	}

	/** checks whether a given int is in the array. Returns a bool. */
	public static boolean isInArray(int[] array, int bank) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == bank)
				return true;
		}
		return false;
	}

	/** returns the index of the first empty position in an array. */
	public static int findFirstAvailable(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == -1)
				return i;
		}
		return array.length - 1;
	}

}
