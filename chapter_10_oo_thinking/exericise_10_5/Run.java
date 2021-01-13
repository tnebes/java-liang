/*
 * Write a program that prompts the user to enter a positive integer
 * and displays all its smallest factors in decreasing order.
 * Use the StackOfIntegers class to store the factors and retrieve and display them
 * in reverse order.
 */
public class Run {

	public static void main(String[] args) {
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter an integer ");
		int myInt = input.nextInt();
		StackOfIntegers stack = getSmallestFactors(myInt);
		while (!stack.empty()) {
			System.out.printf("%d\n", stack.pop());
		}
		
	}
	
	static StackOfIntegers getSmallestFactors(int myInt) {
		StackOfIntegers stack = new StackOfIntegers(myInt);
		while (myInt > 2) {
			for (int i = 2; i <= myInt; i++) {
				if (myInt % i == 0) {
					stack.push(i);
					myInt /= i;
					break;
				}
			}
		}
		return stack;
	}

}
