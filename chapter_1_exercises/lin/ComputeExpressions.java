//import java.util.Math;

public class ComputeExpressions {
	public static void main (String[] args) {
		int numbers = 10;
		for (int i = 1; i < numbers; i++) {
			System.out.print("a^" + i + "\t");
		}
		System.out.print("\n");
		for (int i = 1; i < numbers; i++) {
			for (int j = 1; j < numbers; j++) {
				System.out.print(Math.pow(i,j));
				System.out.print("\t");
			}
		System.out.print("\n");	
		}
	}
}
