//import java.util.Math;

public class ComputeExpressions {
	public static void main (String[] args) {
		System.out.print("a\ta^2\ta^3\ta^4\n");
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				System.out.print(Math.pow(i,j));
				System.out.print("\t");
			}
		System.out.print("\n");	
		}
	}
}
