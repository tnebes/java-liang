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


