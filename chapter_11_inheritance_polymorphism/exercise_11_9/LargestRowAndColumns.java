/*
 * Write a program that randomly fills 0s and 1s into an
 * n-by-n matrix.
 * Prints the matrix
 * Find the rows and columns with the most 1s
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class LargestRowAndColumns {

    int matrixSize;

    LargestRowAndColumns() {
        System.out.print("Enter size of matrix: ");
        matrixSize = Math.abs(getUserInput());
        ArrayList<ArrayList<Boolean>> matrix = new ArrayList<>();
        populateList(matrix);
        printList(matrix);
        int row = getRowWithMostOnes(matrix);
        int column = getColumnWithMostOnes(matrix);
        System.out.printf("The largest row index: %d\n" +
                "The largest column index: %d\n",
                row + 1, column + 1);
    }

    private int getColumnWithMostOnes(ArrayList<ArrayList<Boolean>> matrix) {
        int currentCounter, largestCounter = 0, largestColumnIndex = -1;
        for (int i = 0; i < matrix.get(0).size(); i++) {
            currentCounter = 0;
            for (int j = 0; j < matrix.size(); j++) {
                if (matrix.get(j).get(i)) {
                    currentCounter++;
                }
            }
            if (currentCounter > largestCounter) {
                largestCounter = currentCounter;
                largestColumnIndex = i;
            }
        }
        return largestColumnIndex;
    }

    private int getRowWithMostOnes(ArrayList<ArrayList<Boolean>> matrix) {
        int currentCounter, largestCounter = 0, largestRowIndex = -1;
        int iteration = 0;
        for (ArrayList<Boolean> list : matrix) {
            currentCounter = 0;
            for (Boolean bool : list) {
                if (bool) {
                    currentCounter++;
                }
            }
            if (currentCounter > largestCounter) {
                largestCounter = currentCounter;
                largestRowIndex = iteration;
            }
            iteration++;
        }
        return largestRowIndex;
    }

    private int getUserInput() {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                return input.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Enter a valid number.\n");
            }
        }
    }

    private void populateList(ArrayList<ArrayList<Boolean>> matrix) {
        Random rng = new Random();
        for (int i = 0; i < matrixSize; i++) {
            matrix.add(new ArrayList<>());
            for (int j = 0; j < matrixSize; j++) {
                matrix.get(matrix.size() - 1).add(rng.nextBoolean());
            }
        }
    }

    private void printList(ArrayList<ArrayList<Boolean>> matrix) {
        for (ArrayList<Boolean> list : matrix ) {
            for (Boolean bool : list) {
                System.out.printf("%d ", bool ? 1 : 0);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        new LargestRowAndColumns();
    }

}
