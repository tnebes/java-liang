/*
 * Write a method that returns the maximum value in an ArrayList of integers.
 * The method returns null if the list is null or the list size is 0
 */

import java.util.ArrayList;

public class MaximumArrayList {

	public MaximumArrayList() {
		
		ArrayList<Integer> myList = new ArrayList<>();
		java.util.Scanner input = new java.util.Scanner(System.in);
		System.out.print("Enter numbers. Input ends with 0.\n");
		while(true) {
			int myInput = input.nextInt();
			if (myInput == 0) {
				break;
			} else {
				myList.add(myInput);
			}
		}
		System.out.printf("Maximum value is %d\n", max(myList));

		
	}
	
	public static Integer max(ArrayList<Integer> list) {
		int max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (max < list.get(i)) {
				max = list.get(i);
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		new MaximumArrayList();
	}
	
}
