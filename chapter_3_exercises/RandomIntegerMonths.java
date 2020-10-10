import java.util.Scanner;

public class RandomIntegerMonths {
	public static void main(String[] args) {
		byte randomMonth;
		String randomMonthString;
		byte numberOfMonths = 12;
		Scanner input = new Scanner(System.in);

		do {
			randomMonth = (byte) (Math.random() * numberOfMonths);
			System.out.println(randomMonth);
			switch (randomMonth) {
				case 0: randomMonthString = "January";
					break;
				case 1: randomMonthString = "February";
					break;
				case 2: randomMonthString = "March";
					break;
				case 3: randomMonthString = "April";
					break;
				case 4: randomMonthString = "May";
					break;
				case 5: randomMonthString = "June";
					break;
				case 6: randomMonthString = "July";
					break;
				case 7: randomMonthString = "August";
					break;
				case 8: randomMonthString = "September";
					break;
				case 9: randomMonthString = "October";
					break;
				case 10: randomMonthString = "November";
					break;
				case 11: randomMonthString = "December";
					 break;
				default: randomMonthString = "error";
					 break;
			}
			System.out.println("The randomly chosen month is... " + randomMonthString + "!");
			System.out.print("Do you wish to get another random month? y/n " );
			//the following below can never never work because ternary operators
			//are expressions, not statements. This is why
			//input.next().toLowerCase().equals("n") ? break : continue;
			if (input.next().toLowerCase().equals("n"))
				break;
			else
				continue;

		}
		while(true);

	}
}
