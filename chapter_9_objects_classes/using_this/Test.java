public class Test {
	public static void main(String[] args) {
		Circle c1 = new Circle(5.0);
		System.out.printf("c1 radius is %f\n", c1.getRadius());
		Circle c2 = new Circle();
		System.out.printf("c2 radius is %f\n", c2.getRadius());
	}
}
