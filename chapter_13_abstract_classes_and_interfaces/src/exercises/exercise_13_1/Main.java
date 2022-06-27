package exercises.exercise_13_1;

import exercises.exercise_13_1.geometry.Triangle;

import java.util.Scanner;

/**
 * Design a Triangle Class that Extends the Abstract GeometricObject class.
 * Implement the Triangle Class
 * Write a test program that prompts the user to enter:
 *      three sides of the triangle
 *      a color
 *      Boolean to indicate whether the triangle is filled
 */
public class Main {

    private static final String PROMPT = "> ";

    public Main() {
        System.out.println("Enter the sides of a triangle separated by whitespace.\nExample: 2 3 1\n" + PROMPT);
        try (final Scanner scanner = new Scanner(System.in)) {
            String userInputLengths = scanner.nextLine();
            final String[] triangleLengths = UserInputValidator.validateTriangleLengths(userInputLengths, 3);

            System.out.println("Enter the colour of the triangle.\n" + PROMPT);
            String userInputColour = scanner.nextLine();

            System.out.println("Is the triangle filled? y/n?\n" + PROMPT);
            String userInputFilled = scanner.nextLine();
            final boolean filled = UserInputValidator.validateYesNo(userInputFilled);

            final Triangle triangle = Triangle.generateTriangle(
                    Double.parseDouble(triangleLengths[0]),
                    Double.parseDouble(triangleLengths[1]),
                    Double.parseDouble(triangleLengths[2]),
                    userInputColour,
                    filled);

            if (triangle != null) {
                System.out.println(triangle.getDescription());
            }
            else {
                System.out.println("Invalid triangle.");
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }

}
