package exercises.exercise_13_13;

import java.util.Objects;

public class Student implements Cloneable {

    private String firstName;
    private String lastName;

    public Student(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(final String firstName) {
        if (firstName == null) {
            return;
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(final String lastName) {
        if (lastName == null) {
            return;
        }
        this.lastName = lastName;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
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
        final Student other = (Student) object;
        if (this.firstName.equals(other.firstName) && this.lastName.equals(other.lastName)) {
            return true;
        }
        return true;
    }
}
