public class GetTime {
	public static void main(String[] args) {
		long totalMilliseconds = System.currentTimeMillis();
		// debug
		// System.out.println(totalMilliseconds);
		long totalSeconds = totalMilliseconds / 1000;
		byte currentSecond = (byte) (totalSeconds % 60);
		long totalMinutes = totalSeconds / 60;
		byte currentMinute = (byte) (totalMinutes % 60);
		long totalHours = totalMinutes / 60;
		byte currentHour = (byte) (totalHours % 24);

		System.out.println("The time is:" + currentHour + ":" + currentMinute + ":" +
				currentSecond + " GMT");		
	}
}

