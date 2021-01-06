public class Circle {

	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	// should no arguments be provided to the constructor
	public Circle() {
		this(1.0);
	}

	public double getRadius() {
		return this.radius;
	}
}
