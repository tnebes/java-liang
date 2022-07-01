/*
 * Rewrite the Course class and add a clone method to perform a deep copy on the students field.
 */

package exercises.exercise_13_13;

public class Main {

    private Course course;
    private Course clonedCourse;

    public static void main(final String[] args) {
        new Main();
    }

    private Main() {
        this.course = generateCourse();
        this.clonedCourse = this.course.clone();
        System.out.println(course.equals(clonedCourse));
        System.out.println(course == clonedCourse);
    }

    private static Course generateCourse() {
        //generate a course and assign 10 random students to it.
        Course course = new Course("Java");
        for (int i = 0; i < 10; i++) {
            course.addStudent(new Student("Student " + i, "Last Name " + i));
        }
        return course;
    }

}
