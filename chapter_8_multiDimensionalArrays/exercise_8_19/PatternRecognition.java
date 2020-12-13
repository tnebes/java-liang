/* Write a method that tests whether a 2d array has four consecutive
 * numbers of the same value, either horizontally, vertically or diagonally.
 * Write a test program that prompts the user to enter the number of rows
 * and columns of a 2d array and then the values in the array
 * and displays true if the array contains four consecutive numbers
 * with the same value. Otherwise, the program displays false.
 */

public class PatternRecognition {
	public static void main(String[] args) {
		boolean randomNumberGeneration = false;
      @SuppressWarnings("resource")
		java.util.Scanner input = new java.util.Scanner(System.in);
      int consecutive = 4;

		while (true) {
	      System.out.print("How many rows? ");
	      int arrayRows = input.nextInt();
	      System.out.print("How many columns? ");
	      int arrayColumns = input.nextInt();
			int[][] array = new int[arrayColumns][arrayRows];
	
			if (!randomNumberGeneration) {
		      for (int i = 0; i < array.length; i++) {
		         System.out.printf("Enter %d values for column %d\n",
						arrayRows, i);
		         for (int j = 0; j < array[i].length; j++) {
		            System.out.printf("Value %d: ", j);
		            array[i][j] = input.nextInt();
		         }
		         System.out.print("\n");
		      }
			} else {
				java.util.Random rng = new java.util.Random();
				for (int i = 0; i < array.length; i++) {
					for (int j = 0; j < array[i].length; j++) {
						array[i][j] = rng.nextInt(3);
					}
				}			
			}
	     	for (int i = 0; i < array.length; i++) {
	         for (int j = 0; j < array[i].length; j++) {
	            System.out.printf("%d\t", array[i][j]);
	         }
	         System.out.print("\n");
	      }
	      System.out.print(isConsecutive(array, consecutive));
			System.out.print("Continue? y/n");
			if (input.next().toLowerCase().equals("n"))
				break;
		}
	}


	public static boolean isConsecutive(int[][] array, int number) {
	   return (array.length >= 4 || array[0].length >= 4) &&
         (checkRow(array, number) || checkColumn(array, number) ||
         checkDiagonals(array, number));
	}

   public static boolean checkRow(int[][] array, int number) {
   	for (int i = 0; i < array.length; i++) {
   		 for (int j = 0; j < array[i].length; j++) {
   			 int counter = 0;
   			 for (int k = j + 1; k < array[i].length; k++) {
   				 if (array[i][j] == array[i][k]) {
   					 counter++;
   					 if (counter == number)
   						 return true;   					 
   				 } else {
   					 counter = 0;
   					 break;
   				 }
   			 }
   		 }
   	}
      return false;
   }

   public static boolean checkColumn(int[][] array, int number) {
	  for (int i = 0; i < array.length; i++) {
		  for (int j = 0; j < array[i].length; j++) {
			  int counter = 0;
			  for (int k = j + 1; k < array[i].length; k++) {
				  if (array[j][i] == array[k][i]) {
					  counter++;
					  if (counter == number)
						  return true;
				  } else {
					  counter = 0;
					  break;
				  }
			  }
		  }
	  }
	  return false;
   }

   public static boolean checkDiagonals(int[][] array, int number) {
   	return checkMainDiagonal(array, number) || checkAntidiagonal(array, number);
   }
   
   public static boolean checkMainDiagonal(int[][] array, int number) {
   	for (int i = 0; i <= array.length - number; i++) { // there is no use comparing if the number of remaining values is smaller than the desired number of consecutives
   		for (int j = 0; j <= array[i].length - number; j++) {
   			int counter = 0;
   			for (int k = j + 1; k < array.length; k++) {
   				if (array[i][j] == array[i + k][j + k]) {
   					counter++;
   					if (counter == number)
   						return true;
   				} else {
   					counter = 0;
   					break;
   				}
   			}
   		}
   	}
   	return false;
   }
   
   public static boolean checkAntidiagonal(int[][] array, int number) {
   	for (int i = array.length - 1; i >= number; i--) { // no use comparing if we get false
   		for (int j = array.length - 1; j >= number; j--) {
   			int counter = 0;
   			for (int k = 1; k < array[i].length; k++) {
   				if (array[i][j] == array[i - k][j - k]) {
						counter++;
						if (counter == number)
							return true;
					} else {
						counter = 0;
						break;
					}
   			}
   		}
   	}
   	return false;
   }
}
