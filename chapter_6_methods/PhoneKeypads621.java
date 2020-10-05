import java.util.Scanner;

public class PhoneKeypads621 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a phone number written in " +
                "the international standard letter/number mapping.\n" +
                "e.g. 1-800-Flowers.\n" +
                "and it will be turned into a normal phone number ");
        String phoneNumber = input.next();
        // String phoneNumber = "1800Flowers";
        int phoneNumberLength = phoneNumber.length();
        String numbersFromString = "";

        //TODO: turn chars into uppercase so that the method has to do less work.

        for(int i = 0; i < phoneNumberLength; i++) {
            //TODO: what about - and spaces? Those need to be accounted for.
            char phoneNumberCharacter = phoneNumber.charAt(i);
            if(Character.isLetter(phoneNumberCharacter)) {
		phoneNumberCharacter = Character.toUpperCase(phoneNumberCharacter);
                numbersFromString += getNumber(phoneNumberCharacter);
            } else {
                numbersFromString += phoneNumberCharacter;
            }
        }
	System.out.printf("The phone number is: %s\n", numbersFromString);


    }

    public static int getNumber(char uppercaseLetter) {
        /* TODO: finish the method so that it receives a char that is a letter
        * and it returns the corresponding number. Dunno if switch or regular if.
         */
	if('A' <= uppercaseLetter && uppercaseLetter <= 'C')
		return 2;
	else if('D' <= uppercaseLetter && uppercaseLetter <= 'F')
		return 3;
	else if('G' <= uppercaseLetter && uppercaseLetter <= 'I')
		return 4;	
	else if('J' <= uppercaseLetter && uppercaseLetter <= 'L')
		return 5;
	else if('M' <= uppercaseLetter && uppercaseLetter <= 'O')
		return 6;
	else if('P' <= uppercaseLetter && uppercaseLetter <= 'S')
		return 7;
	else if('T' <= uppercaseLetter && uppercaseLetter <= 'V')
		return 8;
	else if('W' <= uppercaseLetter && uppercaseLetter <= 'Z')
		return 9;
	else
		return 0;
    }
}
