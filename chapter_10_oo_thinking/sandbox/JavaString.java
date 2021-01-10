/*
 * Chapter 10.10 The String Class
 */

public class JavaString {

	public static void main(String[] args) {
		
		String testString = "123456789";
		int sum = 0;
		for (int i = 0; i < testString.length(); i++) {
			sum += Character.getNumericValue(testString.charAt(i)); // extremely cursed
		}
		System.out.printf("%d\n", sum);
		
		
		
	}
	
}
