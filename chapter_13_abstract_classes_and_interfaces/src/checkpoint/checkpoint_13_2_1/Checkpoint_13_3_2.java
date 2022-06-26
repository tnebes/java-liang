package checkpoint.checkpoint_13_2_1;

import java.util.Arrays;

public class Checkpoint_13_3_2 {

    public static void main(String[] args) {
        new Checkpoint_13_3_2();
    }

    public Checkpoint_13_3_2() {
        try {
            Number[] numberArray = new Integer[2];
            numberArray[0] = Double.valueOf(1.5);
            // exception is thrown as the numberArray has been declared to be a list of integers.
        }
        catch (final ArrayStoreException e) {
            e.printStackTrace();
        }
        finally {
            Number[] numberArray = new Double[2];
            numberArray[0] = Double.valueOf(1.5);
            Arrays.stream(numberArray).forEach(System.out::println);
        }
    }

}
