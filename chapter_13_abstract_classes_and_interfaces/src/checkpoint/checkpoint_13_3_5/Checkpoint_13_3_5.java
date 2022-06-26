package checkpoint.checkpoint_13_3_5;

public class Checkpoint_13_3_5 {

    public static void main(String[] args) {
        Number x = Integer.valueOf(3);
        System.out.println(x.intValue());
        // System.out.println((Integer)x.compareTo(4));
        // The Number class does not have the compareTo method defined.
        // Workaround:
        System.out.println(((Integer)x).compareTo(4));
    }
}
