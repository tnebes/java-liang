import java.math.BigInteger;
import java.util.ArrayList;

public class MemoryTest {

	public static void main(String[] args) {
		ArrayList<BigInteger> myList = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			myList.add(BigInteger.valueOf(123));
		}
		
		for (BigInteger myInteger : myList) {
			System.out.printf("%s\n", System.identityHashCode(myInteger));
		}
		
		
	}

}
