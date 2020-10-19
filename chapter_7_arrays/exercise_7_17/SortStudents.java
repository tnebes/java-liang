// Prompt the user to enter
// the number of students
// their names
// their scores
// and print the students names
// in decreasing order of their scores.
//
// assume the name is a string without spaces
// use Scanner.next() to read a name.

import java.util.Arrays;

public class SortStudents {
		public static void main(String[] args) {
		
				java.util.Scanner input = new java.util.Scanner(System.in);

				// enter the number of students

				System.out.print("Enter the number of students: ");
				int students = input.nextInt();

				// enter students names

				String[] studentNames = new String[students];
				byte[] studentScores = new byte[students];

				// getting student info
				for (int i = 0; i < students; i++) {
					System.out.print("Enter student's name: ");
					studentNames[i] = input.next(); 		
					System.out.print("Enter the student's score: ");
					studentScores[i] = input.nextByte();
				
				}

				// selection sort
				
				for (byte i = 0; i < students - 1; i++) {

					byte currentMin = studentScores[i];
					byte currentMinIndex = i;
					String tempStudent = "";

					for (byte j = (byte) (i + 1); j < students; j++) {
					
						if (currentMin < studentScores[j]) {
						
							currentMin = studentScores[j];
							currentMinIndex = j;
						
						}					
					}

					if (currentMinIndex != i) {
					
						studentScores[currentMinIndex] = studentScores[i];
						studentScores[i] = currentMin;
						tempStudent = studentNames[i];
						studentNames[i] = studentNames[currentMinIndex];
						studentNames[currentMinIndex] = tempStudent;
					
					}

				}
				
				System.out.printf("Students: %s\nScores: %s\n", Arrays.toString(studentNames), Arrays.toString(studentScores));

				for (int i = 0; i < students; i++) {
					System.out.printf("%s: %d\n", studentNames[i], studentScores[i]);
				}

		}
}
