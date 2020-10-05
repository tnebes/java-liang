import java.util.Scanner;

public class CheckPassword {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String thePassword;
		boolean validPassword;

		System.out.print("Please enter your password. ");
		thePassword = input.next();

		if(checkPasswordValidity(thePassword)) {
			System.out.printf("%s is a valid password.\n", thePassword);
		} else {
			System.out.printf("%s is an invalid password.\n", thePassword);
		}




	}

	public static boolean checkPasswordValidity(String aPassword) {
		return (checkMinimalLength(aPassword)
				&& checkLettersAndDigits(aPassword)
				&& checkMinimalAmountOfDigits(aPassword));
	}

	public static boolean checkMinimalLength(String aPassword) {
		return aPassword.length() >= 10;
	}

	public static boolean checkLettersAndDigits(String aPassword) {
		int passwordLength = aPassword.length();
		for(int i = 0; i < passwordLength; i++) {
			if(!(Character.isLetter(aPassword.charAt(i))
				|| Character.isDigit(aPassword.charAt(i)))) {
				return false;
			}
		}
		return true;
	}

	public static boolean checkMinimalAmountOfDigits(String aPassword) {
		int numberOfDigits = 0;
		int passwordLength = aPassword.length();
		for(int i = 0; i < passwordLength; i++) {
			if(Character.isDigit(aPassword.charAt(i))) {
			       numberOfDigits++;
			}
		}
		if(numberOfDigits >= 3) {
			return true;
		} else {
			return false;
		}
	}
}

