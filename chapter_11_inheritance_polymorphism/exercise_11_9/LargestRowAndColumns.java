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
        ArrayList<Integer> row = getRowWithMostOnes(matrix);
        ArrayList<Integer> column = getColumnWithMostOnes(matrix);
        printResult(row, column);
    }

    private void printResult(ArrayList<Integer> row, ArrayList<Integer> column) {
        StringBuilder sb = new StringBuilder();
        sb.append("The largest row index: ");
        for (int i = 0; i < row.size() - 1; i++) {
            sb.append(row.get(i)).append(", ");
        }
        sb.append(row.get(row.size() - 1));
        sb.append("\nThe largest column index: ");
        for (int i = 0; i < column.size() - 1; i++) {
            sb.append(column.get(i)).append(", ");
        }
        sb.append(column.get(column.size() - 1));
        sb.append("\n");
        System.out.print(sb.toString());
    }

    private ArrayList<Integer> getColumnWithMostOnes(ArrayList<ArrayList<Boolean>> matrix) {
        ArrayList<Integer> returnList = new ArrayList<>();
        int currentCounter, largestCounter = 0;
        for (int i = 0; i < matrix.get(0).size(); i++) {
            currentCounter = 0;
            for (int j = 0; j < matrix.size(); j++) {
                if (matrix.get(j).get(i)) {
                    currentCounter++;
                }
            }
            if (currentCounter > largestCounter) {
                largestCounter = currentCounter;
                returnList = new ArrayList<Integer>();
                returnList.add(i);
            } else if (currentCounter == largestCounter) {
                returnList.add(i);
            }
        }
        return returnList;
    }

    private ArrayList<Integer> getRowWithMostOnes(ArrayList<ArrayList<Boolean>> matrix) {
        ArrayList<Integer> returnList = new ArrayList<>();
        int currentCounter, largestCounter = 0;
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
                returnList = new ArrayList<>();
                returnList.add(iteration);
            } else if (currentCounter == largestCounter) {
                returnList.add(iteration);
            }
            iteration++;
        }
        return returnList;
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
