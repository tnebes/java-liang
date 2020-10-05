public class StringNote {
	public static void main(String[] args) {
		// exercise caution when concatenating strings with numbers
		// which have mathematical operators.
		int i = 1;
		int j = 1;
		System.out.println("Test " + i + j);
		System.out.println("Compare with...");
		System.out.println("Test " + (i + j));
	}
}
