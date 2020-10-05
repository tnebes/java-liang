public class Exercise445 {
	public static void main(String[] args) {
		String s1 = " Welcome ", s2 = " welcome ";

		System.out.println("Check whether s1 and s2 are equal.");
		System.out.println(s1.equals(s2));

		System.out.println("Check whether s1 and s2 are equal - ignore case");
		System.out.println(s1.equalsIgnoreCase(s2));

		int x = s1.compareTo(s2);
		System.out.println("Compare the two strings");
		System.out.println(x);

		x = s1.compareToIgnoreCase(s2);
		System.out.println("Compare the two strings - ignore case");
		System.out.println(x);

		boolean b = s1.startsWith("AAA");
		System.out.println("Check if string begins with \"AAA\"");
		System.out.println(b);

		b = s1.endsWith("AAA");
		System.out.println("Check if string ends with \"AAA\"");
		System.out.println(b);
		
		x = s1.length();
		System.out.println("The length of s1 is...");
		System.out.println(x);

		char y = s1.charAt(0);
		System.out.println("The character at index 0 is...");
		System.out.println(y);
		// I could have used substring but charAt is much better.

		String s3 = s1 + s2;
		System.out.println("Concatenating the two strings");
		System.out.println(s3);

		System.out.println("Creating a substring from index 1.");
		System.out.println(s1.substring(1));

		System.out.println("Creating a substring from index 1 to 4.");
		System.out.println(s1.substring(1,4));

		s3 = s1.toLowerCase();
		System.out.println("Converting s1 to lowercase...");
		System.out.println(s3);

		s3 = s1.toUpperCase();
		System.out.println("Converting s1 to uppercase...");
		System.out.println(s3);

		s3 = s1.trim();
		System.out.println("Trimming s1...");
		System.out.println(s3);
		
	}
}
