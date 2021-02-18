/*
 * Define a new stack class that extends ArrayList.
 * Write a test program that prompts the user to enter five strings and displays them in reverse order.
 */

import java.util.Scanner;

public class Main {

    public Main() {
        final int NUMBER_OF_STRINGS = 5;
        MyStack stack = new MyStack();
        System.out.print("Please enter five strings:\n");
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < NUMBER_OF_STRINGS; i++) {
            stack.add(input.next());
        }
        System.out.println(stack.toString());

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    public static void main(String[] args) {
        new Main();
    }

}
