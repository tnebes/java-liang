/* School has 100 lockers and students
 * Lockers are closed on the first day.
 * The first student opens every locker
 * The second student closes every second locker
 * The third student inverts every third locker
 * The fourth student inverts every fourth locker
 * continues until the 100th student changes the 100th lock
 * Which lockers are open at the end?
 */

public class LockerPuzzle {
	public static void main(String[] args) {
		
		boolean[] lockerStatus = new boolean[100];
		
		// first student opens every locker
		for (int i = 0; i < lockerStatus.length; i++)
			lockerStatus[i] = true;

		//all the remaining students invert all the other lockers.
		for (int i = 0; i < lockerStatus.length; i++) {
			for (int j = 2; j < lockerStatus.length; j++) {
				if (i % j == 0) {
					if (lockerStatus[i])
						lockerStatus[i] = false;
					else
						lockerStatus[i] = true;
				}
			}
		}
		//which lockers are open?
		for (int i = 0; i < lockerStatus.length; i++) {
			if (lockerStatus[i])
				System.out.printf("%d ", i);
		}
		System.out.print("\n");
	}
}
