package exercises.exercise_13_13;

import java.util.Arrays;
import java.util.Objects;

public class Course implements Cloneable {

    private static final int CLASS_SIZE = 100;

    private final String courseName;
    private Student[] students = new Student[CLASS_SIZE];
    private int numberOfStudents;

    public Course(final String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(final Student student) {
        this.students[this.numberOfStudents] = student;
        this.numberOfStudents++;
    }

    public Student[] getStudents() {
        return this.students;
    }

    public int getNumberOfStudents() {
        return this.numberOfStudents;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public void dropStudent(final Student student) {
        this.students = Arrays.stream(this.students).filter(s -> s.equals(student)).toArray(Student[]::new);
        this.numberOfStudents--;
    }

    @Override
    public Course clone() {
        try {
            Course clone = (Course) super.clone();
            clone.students = Arrays.stream(this.students)
                    .filter(Objects::nonNull)
                    .map(Student::clone)
                    .toArray(clonedStudents -> new Student[CLASS_SIZE]);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public boolean equals(final Object object) {
        if (object == null) {
            return false;
        }
        if (this.getClass() != object.getClass()) {
            return false;
        }
        final Course other = (Course) object;
        return Objects.equals(this.courseName, other.courseName) && Arrays.equals(this.students, other.students);
    }
}
