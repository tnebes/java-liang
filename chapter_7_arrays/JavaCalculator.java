/* 
 * 7.13.2 Case Study: Calculator
 * Page 297
 */

public class JavaCalculator {
	public static void main(String[] args) {
		
		if (args.length != 3) {
			System.out.println("Usage: java JavaCalculator operand1 operator operand2");
			System.exit(1);
		}

		int result = 0;

		// is using a switch faster than an if/else?

		switch (args[1].charAt(0)) {
			case '+': result = Integer.parseInt(args[0]) +
					Integer.parseInt(args[2]);
				  break;
			case '-': result = Integer.parseInt(args[0]) -
					Integer.parseInt(args[2]);
				  break;
			case '.': result = Integer.parseInt(args[0]) *
					Integer.parseInt(args[2]);
				  break;
			case '/': result = Integer.parseInt(args[0]) /
					Integer.parseInt(args[2]);
		}

		//Displaying the results.

		System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);

	}
}
