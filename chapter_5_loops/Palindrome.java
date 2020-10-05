import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean repeatInputCondition;
		String testString;
	
		do {
			repeatInputCondition = false;
			System.out.print("Enter a word to check whether it's a palindrome ");
			testString = input.next();
			
			for (char c : testString.toCharArray()) {
				if (Character.isDigit(c)) {
					repeatInputCondition = true;
					break;
				}
			}
		} while (repeatInputCondition);

		// check whether it is a palindrome.

		boolean isPalindrome = true;
		for (int i = 0; i < testString.length() / 2; i++) {
			System.out.printf("comparing %c and %c\n", testString.charAt(i),
				testString.charAt(testString.length() - (i + 1)));
	
			if (testString.charAt(i) != testString.charAt(testString.length() - (i + 1))) {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.printf("%s is a palindrome\n", testString);
		}
		else {
			System.out.printf("%s is not a palindrome\n", testString);
		}
	}
}
