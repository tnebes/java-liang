public class PalindromicPrime {
	public static void main(String [] args) {

		for(int i = 2; i < 1E+10; i++) { // big number warning
			if(checkIfPalindrome(i) && checkIfPrime(i)) {
				System.out.printf("\t\t%d is a palindromic prime.\n", i);
			}
		       	/*
			else {
				System.out.printf("%d is not a palindromic prime\n", i);
			}
			*/
		}

	}

	public static boolean checkIfPrime(int someInt) {
	
		boolean isPrime = true;
		for(int i = 2; i < someInt; i++) {
			if(someInt % i == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}

	public static boolean checkIfPalindrome(int somePrime) {
	
		int thePrime = somePrime;
		int reverse = 0;

		while(thePrime != 0) {
			int remainder = thePrime % 10; // gives the last digit
			reverse = reverse * 10 + remainder; // turns the last digit and adds it to the front.
			thePrime = thePrime / 10; // removes the last digit from the input palindrome
			// System.out.printf("%d", reverse);
		}
		return somePrime == reverse;
	}

}

