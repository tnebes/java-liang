public class TypeConversion {
	public static void main(String[] args) {
		boolean b = true;
		int i = (int)b;
		System.out.println(i);

		i = 1;
		b = (boolean)i;
		System.out.println(b);
	}
}

