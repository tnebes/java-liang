package checkpoint.checkpoint_13_5_3;

public class Checkpoint_13_5_3 {

    interface A {
//        cannot have a body
//        void print() {}
    }

    abstract interface B {
//        cannot have a body
//        abstract void print() {};
    }

    abstract interface C {
//        return type required
//        print();
    }

    interface D {
        void print();
    }

    interface E {
        default void print() {

        }
    }

    interface F {
        static int get() {
            return 0;
        }
    }

}
