package exercises.exercise_13_9;

import exercises.exercise_13_9.geometry.NewCircle;

public class Main {

    private Main() {
        final NewCircle circle1 = NewCircle.generateCircle(10.0d, "red", true);
        final NewCircle circle2 = NewCircle.generateCircle(10.0d, "blue", false);
        assert (circle1.equals(circle2));
    }

    public static void main(final String[] args) {
        new Main();
    }

}