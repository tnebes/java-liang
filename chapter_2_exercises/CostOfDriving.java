import java.util.Scanner;

public class CostOfDriving {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter the distance: ");
		float distance = input.nextFloat();
		System.out.print("Enter the fuel economy in kilometers per liter: ");
		float kilometersPerLiter = input.nextFloat();
		System.out.print("Enter the price of fuel per liter: ");
		float pricePerLiter = input.nextFloat();
		float costOfDriving = (distance / kilometersPerLiter) * (pricePerLiter * 100.0f);
		System.out.println("The price for driving " + distance + " is: hrk" + costOfDriving / 100);
	}
}

		
