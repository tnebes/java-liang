// Prompt the user to enter
// the number of students
// their names
// their scores
// and print the students names
// in decreasing order of their scores.
//
// assume the name is a string without spaces
// use Scanner.next() to read a name.

public class SortStudents {
		public static void main(String[] args) {
		
				java.util.Scanner input = new java.util.Scanner(System.in);

				// enter the number of students

				System.out.print("Enter the number of students: ")
				int[] students = new int[input.nextInt()];

				// enter students names

				String[] studentNames = new String[students];
				System.out.println("Enter student's name: ");
				for (int i = 0; i < students.length; i++) {
					studentNames[i] = input.next(); 
				}
				
				byte[] studentScores = new byte[students.length];
				System.out.println("Enter the student's score: ")
				
		}
}
