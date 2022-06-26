package checkpoints.checkpoint_13_7_1;

public class Checkpoint_13_7_1 implements Cloneable {

    private final Checkpoint_13_7_1 checkpoint;

    public Checkpoint_13_7_1() throws CloneNotSupportedException {
        this.checkpoint = (Checkpoint_13_7_1) super.clone();
        System.out.println(this.checkpoint);
        assert (this.checkpoint != null);
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        new Checkpoint_13_7_1();
    }

}