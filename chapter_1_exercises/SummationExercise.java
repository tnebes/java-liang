public class SummationExercise {
	public static void main(String[] args){
		int howManyNumbers = 10;
		int calculationResult = 0;
		for(int i = 1; i < howManyNumbers; i++) {
			calculationResult += i;
		}
		System.out.print(calculationResult + "\n");
	}
}
