/*
 * Define a new stack class that extends ArrayList.
 * Write a test program that prompts the user to enter five strings and displays them in reverse order.
 */

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyStack extends ArrayList {

    public int getSize() {
        return this.size();
    }

    public Object peek() {
        if (this.getSize() == 0) {
            return null;
        }
        return this.get(this.size() - 1);
    }

    public Object pop() {
        Object returnObject = this.peek();
        this.remove(this.size() - 1);
        return returnObject;
    }

    public void push(Object o) {
        this.add(o);
    }

    @Override
    public String toString() {
        return "stack: " + super.toString();
    }
}
