import java.util.Scanner;

/* this code is bad because I didn't read the exercise.
 * I was supposed to reverse the integer and compare whether they are the same
 * Intead I chose to do the recursive palindrome check from Python where I check
 * each individual char. Remember, this is a way how to check int palindromes.
 */

public class PalindromeInteger {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.print("Enter an int to check if it's a palindrome. ");
			System.out.printf("%b \n", checkPalindrome(input.nextInt()));
			System.out.print("Continue? Y/N ");
			if(input.next().toUpperCase().equals("N"))
				break;
		}
	}

	public static boolean checkPalindrome(int suspectInt) {
	
		String temp = suspectInt + "";

		if (temp.length() > 1) {
			System.out.printf("Triggered with %s\n", temp);
			if (temp.charAt(0) == temp.charAt(temp.length() - 1)) {
				System.out.printf("%c, %c\n", temp.charAt(0), temp.charAt(temp.length() - 1));
				temp = temp.substring(1, temp.length() - 1);
				System.out.printf("%s\n", temp);
				System.out.printf("length is %d\n", temp.length());
				return checkPalindrome(Integer.parseInt(temp));
			} else {
				System.out.println("first");
				return false;
			}
		} else {
			System.out.println("second");
			return true;
		}
	}
}
