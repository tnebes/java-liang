// write a program to display the popluation for each of the next five years
// birth every 7 seconds
// death every 13 seconds
// immigrant every 45 seconds

public class PopulationProjection {

	public static void main(String[] args) {

		int currentPopulation = 334500000;
		int secondsInAYear = 365 * 24 * 60 * 60;
		float annualBirth = secondsInAYear / 7.0f;
		float annualDeath = secondsInAYear / 13.0f;
		float annualImmigrant = secondsInAYear / 45.0f;

		int annualChange = (int) (annualBirth + annualDeath + annualImmigrant);
		//debug
		System.out.println(annualChange);

		for(int i = 1; i < 6; i++) {
			currentPopulation = currentPopulation + annualChange;
			System.out.println("Current population for year " + i + " is: " + currentPopulation);
		}
	}
}

