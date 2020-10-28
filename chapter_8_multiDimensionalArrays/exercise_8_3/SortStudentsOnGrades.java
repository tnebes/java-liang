/* rewrite Listing 8.2
  * GradeExam.java
  * There are eight students and ten questions,
  * the answers are stored in a two-dimensional array
  * Each row records a student's answers to the questions
  * The key is stored in a one-dimensional array
  * Your program grades the test and displays the result.
  * It compares each student's answers with the key, counts
  * the number of correct answers and displays it.
  *
 * display students in decreasing order of the number of correct answers.
 */

import java.util.Arrays;

public class SortStudentsOnGrades {
	public static void main(String[] args) {
		
		char[][] answers = {
			{'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
			{'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
			{'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
			{'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
			{'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};

		char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

		int[] studentResults = new int[answers.length];
		for (int i = 0; i < studentResults.length; i++) {
			studentResults[i] = calculateResult(answers[i], key);
		}
		
		// adding identity for students.
		int[] studentIDs = new int[answers.length];
		for (int i = 0; i < studentIDs.length; i++) {
			studentIDs[i] = i;
		}

		sortStudentResults(studentResults, studentIDs);


	}

	public static int calculateResult(char[] answers, char[] key) {
		int result = 0;
		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == key[i])
				result++;
		}

		return result;
	}

	public static void sortStudentResults(int[] results, int[] IDs) {
		//lets use bubblesort
	}
}

