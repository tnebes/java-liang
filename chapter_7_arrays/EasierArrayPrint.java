import java.util.Random;
import java.util.Arrays;

public class EasierArrayPrint {
	public static void main(String[] args) {
		int[] myList = new int[100];
		Random RNG = new Random();

		for (int i = 0; i < myList.length; i++) {
			myList[i] = RNG.nextInt(1024);
		}

		System.out.printf("%s", Arrays.toString(myList));

	}
}
