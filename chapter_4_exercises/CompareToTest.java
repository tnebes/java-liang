public class CompareToTest {
	public static void main(String[] args) {
		// testing compare to.
		// according to the documentation,
		// this method will only return the 
		// lexicographical differences.
		// This means that it will recursively
		// test the differences between
		// the letters. If a different letter is found
		// it will be displayed as an integer.
		// For example, assume that s1 has "a" and s2 has "b".
		// compareTo(s2) will return +1 since a > b by one
		// and compareto(s1) will return -1 since a < b by one.
		// If s2 is z, the int will be bigger.
		
		String s1 = "abc", s2 = "abd";
		System.out.println(s1.compareTo(s2)); // -1 because b is a + 1

	}
}
