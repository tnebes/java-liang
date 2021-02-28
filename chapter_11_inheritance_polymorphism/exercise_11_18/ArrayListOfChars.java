/*
 * Write a method that returns an array list of Characters from a string
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author tnebes
 */
public class ArrayListOfChars {

    ArrayListOfChars() {
        ArrayList<Character> chars = toCharacterArray(getStringInput("Enter a string: "));
        System.out.println(chars.toString());
    }

    public static String getStringInput(String message) {
        System.out.print(message);
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    public static ArrayList<Character> toCharacterArray(String s) {
        ArrayList<Character> charList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            charList.add(s.charAt(i));
        }
        return charList;
    }

    public static void main(String[] args) {
        new ArrayListOfChars();
    }

}
