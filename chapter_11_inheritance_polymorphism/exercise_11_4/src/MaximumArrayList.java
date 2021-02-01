import java.util.ArrayList;

/*
 * Write the following method that returns the
 * maximum value in an ArrayList of integers. The method returns null if the
 * list is null or the list size is 0 .
 * public static Integer max(ArrayList<Integer> list)
 * Write a test program that prompts the user to enter a sequence of numbers ending
 * with 0 and invokes this method to return the largest number in the input.
 *
 */
public class MaximumArrayList {

    public MaximumArrayList() {

        ArrayList<Integer> myList = getUserInput();

        public static Integer max(ArrayList<Integer> list) {
            return new Integer(1);
        }

        public static ArrayList<Integer> getUserInput() {
            java.util.Scanner input = new java.util.Scanner(System.in);
            ArrayList<Integer> myIntegerList = new ArrayList<>();
            System.out.print("Enter a list of numbers. 0 marks end of input.");
            int userInput;
            do {
                userInput = input.nextInt();
                myIntegerList.add(userInput);
            } while (userInput != 0);
            return myIntegerList;
        }
    }

    public static void main(String[] args) {
        new MaximumArrayList();
    }

}
