//Write the method that returns true if
//a list is already sorted in decreasing order
//Write a test program that prompts the user
//to enter a list and displays whether the list
//is sorted or not.
//The first number in the input denotes the number of elements in the list
//The first number is not part of the list.

import java.util.Scanner;

public class Sorted {
	public static void main(String[] args) {

		java.util.Scanner input = new java.util.Scanner(System.in);

		System.out.print("Please enter size of list and the elements separated by space. Please, use integers.\n");
		String userInput = input.nextLine();

		int numberOfElements = Integer.parseInt(
				(userInput.substring(0, userInput.indexOf(" "))));

		int[] myList = new int[numberOfElements];
		// removing the first integer from the string.
		// also adding white space at the end so that the
		// for loop below can work.
		userInput = userInput.substring(userInput.indexOf(" ") + 1) + " ";

		for (int i = 0; i < myList.length; i++) {
		
			myList[i] = Integer.parseInt(
							userInput.substring(0, userInput.indexOf(" ")));
			if (userInput.indexOf(" ") != -1) {
				userInput = userInput.substring(
								userInput.indexOf(" ") + 1);
			} else {
				userInput = userInput.substring(
								userInput.indexOf(" "));
			}
		}

		if (isSorted(myList))
			System.out.println("The list is sorted.");
		else
			System.out.println("The list is not sorted.");

	}

	public static boolean isSorted(int[] list) {
		
		for (int i = 0; i < list.length - 1; i++) {
		
			if (list[i] < list[i + 1])
				return false;
		}

		return true;
		
	}
}
