/*
 * n-sided regular polygon has sides of the same length and anles of the same degree
 * private int data field n defines the number of sides
 * 	default 3
 * private double data field named side stores the length
 * 	default 1
 * double data field named x defines the x-coordinate of the centre
 * 	default 0
 * double data field named y defines the y-coordinate of the centre
 * 	default 0
 * no arg constructor create the regular polygon with default values
 * constructor creates a regular polygon with number of sides and length of the sides
 * constructor creates a regular polygon with number of sides and length of the sides on x and y coordinates
 * accessor and mutator method for all data fields
 * getPerimeter() method
 * getArea() method
 * 
 * Write a test program that creates three objects,
 * 	RegularPolygon()
 * 	RegularPolygon(6, 4)
 * 	RegularPolygon(10, 4, 5.6, 7.8)
 * Display their perimeter and area
 */


public class Run {

	public static void main(String[] args) {
		RegularPolygon[] polygonArray = new RegularPolygon[3];
		polygonArray[0] = new RegularPolygon();
		polygonArray[1] = new RegularPolygon(6, 4);
		polygonArray[2] = new RegularPolygon(10, 4, 5.6, 7.8);
		
		for (int i = 0; i < polygonArray.length; i++) {
			System.out.printf("Regular polygon #%d\n\tPerimeter: %.3f\n\tArea: %.3f\n", i, polygonArray[i].getPerimeter(), polygonArray[i].getArea());
		}

	}

}
