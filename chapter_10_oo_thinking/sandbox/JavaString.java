/*
 * Chapter 10.10 The String Class
 */

public class JavaString {

	public static void main(String[] args) {
		
		// testing cursed stuff
		String testString = "123456789";
		int sum = 0;
		for (int i = 0; i < testString.length(); i++) {
			sum += Character.getNumericValue(testString.charAt(i)); // extremely cursed
		}
		System.out.printf("%d\n", sum);
		
		// testing replace
		testString.replace('1', '9');
		System.out.printf("%s\n", testString);
		System.out.printf("%s\n", testString.replace('9', '1'));
		testString = testString.replace('5', '4');
		System.out.printf("%s\n", testString);
		
		testString = "hello#my#dear#friends";
		System.out.print(testString.split("#") + "\n");
		String[] tokens = testString.split("#");
		for (int i = 0; i < tokens.length; i++) {
			System.out.printf("%s\t", tokens[i]);
		}
		
		// are both equal?
		String str = String.valueOf(new char[]{'J', 'a', 'v', 'a'});
		str = new String(new char[]{'J', 'a', 'v', 'a'});
		//
		System.out.printf("%s\n", str);
	}
	
}
