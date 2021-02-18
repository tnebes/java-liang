package sandbox;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Long> list = new ArrayList<>();
		Long myLong = Long.valueOf(3);
		list.add(myLong);
		myLong++;
		System.out.printf("Long: %d\n", myLong);
		System.out.printf("List long: %d\n", list.get(0));
		long myLong1 = list.get(0);
		myLong1++;
		System.out.printf("Extracted list long: %d\n", myLong1);
		System.out.printf("List long: %d\n", list.get(0));
	}
	
}
