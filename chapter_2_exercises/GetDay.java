public class GetDay {
	public static void main(String[] args) {
		String today = "Tuesday";
		byte todayNumber;
		switch (today.toLowerCase()) {
			case "monday":		todayNumber = 1;
						break;
			case "tuesday":		todayNumber = 2;
						break;
			case "wednesday":	todayNumber = 3;
						break;
			case "thursday":	todayNumber = 4;
						break;
			case "friday":		todayNumber = 5;
						break;
			case "saturday":	todayNumber = 6;
						break;
			case "sunday":		todayNumber = 7;
						break;
			default:		todayNumber = 0;
						break;
		}
		//System.out.println(todayNumber);
		System.out.println((todayNumber + 100) % 7);
	}
}

