package exercises.exercise_13_1;

import java.util.Arrays;

public class UserInputValidator {

    public static final String DOUBLE_OR_INT_PATTERN = "\\d+\\.\\d+|\\d+";

    public static String[] validateTriangleLengths(final String userInput, final int desiredNumberOfLengths) {
        String[] lengths = userInput.split(" ");
        if (lengths.length != desiredNumberOfLengths) {
            return new String[]{};
        }
        if (Arrays.stream(lengths).allMatch(length -> length.matches(DOUBLE_OR_INT_PATTERN))) {
            return lengths;
        }
        return new String[]{};
    }

    public static boolean validateYesNo(final String userInput) {
        return userInput.equalsIgnoreCase("y");
    }

}
