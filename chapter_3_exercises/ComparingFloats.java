public class ComparingFloats {
	public static void main(String[] args) {
		/* this should not be done
		 * double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
		 * double y = 0.5;
		 * if (x == y)
		 * 	System.out.println("They are the same")
		 * else
		 * 	System.out.println("They are not the same");
		 */

		//this should be done instead
		final double EPSILON = 1e-14; //-14 for doubles, -7 for floats
		double x = 1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1;
		System.out.println(x);
		double y = 0.5;
		if (Math.abs(x - y) < EPSILON) // this is the same as testing x==y but with some EPSILON
			System.out.println("X is Y");
		else
			System.out.println("X is not Y");
		}
}


