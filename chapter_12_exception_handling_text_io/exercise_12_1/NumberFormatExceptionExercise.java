/*
 * Write a program with an exception handler that deals with nonnumeric operands;
 * then write another program without using an exception handler to achieve the
 * same objective. Your program should display a message that informs the user of
 * the wrong operand type before exiting
 */

/**
 * @author tnebes
 */
public class NumberFormatExceptionExercise {

    NumberFormatExceptionExercise(String[] args) {

        if (args.length != 3) {
            System.out.println("Usage: java NumberFormatExceptionExercise op1 operator op2");
            System.exit(1);
        }
        try {
            checkIfDigit(args[0]);
            checkIfDigit(args[2]);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            e.getMessage();
            System.exit(1);
        }

        double result = 0;

        switch(args[1].charAt(0)) {
            case '+': result = Double.parseDouble(args[0]) + Double.parseDouble(args[2]);
                break;
            case '-': result = Double.parseDouble(args[0]) - Double.parseDouble(args[2]);
                break;
            case '.': result = Double.parseDouble(args[0]) * Double.parseDouble(args[2]);
                break;
            case '/': result = Double.parseDouble(args[0]) / Double.parseDouble(args[2]);
                break;
        }
        System.out.printf("%s %s %s = %f", args[0], args[1], args[2], result);

    }

    private void checkIfDigit(String arg) throws NumberFormatException {
        for (int i = 0; i < arg.length(); i++) {
            if (!Character.isDigit(arg.charAt(i)))
                throw new NumberFormatException("Input must be a double.");
        }
    }


    public static void main(String[] args) {
        new NumberFormatExceptionExercise(args);
    }
}
