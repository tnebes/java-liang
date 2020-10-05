public class ParsingTest {
	public static void main(String[] args) {
		// there are two ways how to parse strings into integers
		// (could it be better to say that there are two ways
		// to convert strings into ints/doubles?
		String someInt = "123";
		int myInt = Integer.parseInt(someInt);
		System.out.println(myInt);

		// the same can be done doubles. Double.parseDouble(string)
		// alternatively:
		int anotherInt = 456;
		String anotherString = anotherInt + "";
		System.out.println(anotherInt);
	}
}
