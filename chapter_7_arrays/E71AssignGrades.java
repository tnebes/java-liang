import java.util.Arrays;

public class E71AssignGrades {
	public static void main(String[] args) {
		/* The user enters the number of students and their grades.
		 * The program prints their grades. The grades
		 * Are calculatated according to the highest achiever.
		 */

		// Note. Solution differs from the exercise text
		// as I am using exclusively command-line arguments.
		// Sue me.

		if (args.length < 2) {
			System.out.println("Usage: Java 71AssignGrades" +
					"numberOfStudents, grade0, grade1" +
					", grade2 ... gradeN");
			System.exit(1);
		}

		// Note(tnebes) Creating an array of the grades.
		int[] studentScores = new int[Integer.parseInt(args[0])];
		for (int i = 0; i < studentScores.length; i++) {
			studentScores[i] = Integer.parseInt(args[i+1]);
		}
		System.out.printf("%s\n", Arrays.toString(studentScores));

		// Note(tnebes) Finding the highest score
		int highestScore = 0;
		for (int score : studentScores) {
			if (score > highestScore)
				highestScore = score;
		}
		System.out.printf("Highest score is %d\n", highestScore);

		// Calculating the grades for each index.

		for (int i = 0; i < studentScores.length; i++) {
			if (studentScores[i] >= highestScore - 5) {
				printScore(i, studentScores[i], 'A');
			}
			else if (studentScores[i] >= highestScore - 10) {
				printScore(i, studentScores[i], 'B');
			}
			else if (studentScores[i] >= highestScore - 15) {
				printScore(i, studentScores[i], 'C');
			}
			else if (studentScores[i] >= highestScore - 20) {
				printScore(i, studentScores[i], 'D');
			}
			else {
				printScore(i, studentScores[i], 'F');
			}
		}
	}

	public static void printScore(int index, int score, char grade) {
		System.out.printf("Student %d score is %d and grade is %c\n", index, score, grade);
	}
}
