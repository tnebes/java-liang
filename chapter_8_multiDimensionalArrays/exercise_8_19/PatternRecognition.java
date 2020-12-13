/* Write a method that tests whether a 2d array has four consecutive
 * numbers of the same value, either horizontally, vertically or diagonally.
 * Write a test program that prompts the user to enter the number of rows
 * and columns of a 2d array and then the values in the array
 * and displays true if the array contains four consecutive numbers
 * with the same value. Otherwise, the program displays false.
 */

public class PatternRecognition {
	public static void main(String[] args) {
      java.util.Scanner input = new java.util.Scanner(System.in);

      System.out.print("How many rows? ");
      int arrayRows = input.nextInt();
      System.out.print("How many columns? ");
      int arrayColumns = input.nextInt();

	  int[][] array = new int[arrayColumns][arrayRows];
      for (int i = 0; i < array.length; i++) {
         System.out.printf("Enter %d values for column %d\n", arrayRows, i);
         for (int j = 0; j < array[i].length; j++) {
            System.out.printf("Value %d: ", j);
            array[i][j] = input.nextInt();
         }
         System.out.print("\n");
      }
      input.close();
      for (int i = 0; i < array.length; i++) {
         for (int j = 0; j < array[i].length; j++) {
            System.out.printf("%d\t", array[i][j]);
         }
         System.out.print("\n");
      }
      System.out.print(isConsecutiveFour(array));
   }


	public static boolean isConsecutiveFour(int[][] array) {
	   return (array.length >= 4 || array[0].length >= 4) &&
         (checkRow(array) || checkColumn(array) ||
         checkDiagonals(array));
	}

   public static boolean checkRow(int[][] array) {
      for (int i = 0; i < array.length; i++) {
         int counter = 0;
         int comparisonNumber = array[i][0];
         for (int j = 1; j < array[i].length; j++) {
            if (comparisonNumber == array[i][j]) {
               counter++;
               if (counter == 4) {
                  return true;
               }
            } else {
               counter = 0;
               comparisonNumber = array[i][j];
            }
         }
      }
      return false;
   }

   public static boolean checkColumn(int[][] array) {
      for (int i = 0; i < array.length; i++) {
         int counter = 0;
         int currentNumber = array[0][i];
         for (int j = 1; j < array[i].length; j++) {
            if (array[j][i] == currentNumber) {
               counter++;
               if (counter == 4) {
                  return true;
               }
            } else {
               counter = 0;
               currentNumber = array[j][i];
            }   
         }
      }
      return false;
   }

   public static boolean checkDiagonals(int[][] array) {
      return false;
   }
}
