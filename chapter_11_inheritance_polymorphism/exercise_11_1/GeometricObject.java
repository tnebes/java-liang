public class GeometricObject {
	private String colour;
	private boolean filled;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	public GeometricObject() {
		this("white", false);
	}

	/**
	 * Construct a geometric object with the specified color and filled value
	 */
	public GeometricObject(String color, boolean filled) {
		this.colour = color;
		this.filled = filled;
		this.dateCreated = new java.util.Date();
	}

	/** Return color */
	public String getColour() {
		return colour;
	}

	/** Set a new color */
	public void setColour(String color) {
		this.colour = color;
	}

	/**
	 * Return filled. Since filled is boolean, its getter method is named isFilled
	 */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	/** Return a string representation of this object */
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + colour + " and filled: " + filled;
	}
}
