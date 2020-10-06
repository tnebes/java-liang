public class A {
	public static void main(String[] args) {
		/* The contents of the array below will be passed to another class in
		 * the same folder.
		 * That is to say, this class will invoke another class
		 * and pass the array as an argument.
		 */
		String[] strings = {"New York", "Boston", "Atlanta"};
		TestMain.main(strings);
	}
}
