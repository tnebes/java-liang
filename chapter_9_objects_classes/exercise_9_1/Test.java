/*
 * Design a class named Rectangle.
 * The class contains:
 * 	two double width and height, default 1
 * 	no-arg constructor
 * 	constructor that creates a rectnagle of width and height
 * 	method named getArea()
 * 	method named getPerimeter()
 * 	Write a test program that creates two Rectangle objects: 4, 40 and 3.5, 35.9.
 * 	Display width, height, area and perimeter.
 */

public class Test {
    public static void main(String[] args) {
        Rectangle r0 = new Rectangle(4, 40);
        Rectangle r1 = new Rectangle(3.5, 35.9);
        Rectangle[] rectangleArray = { r0, r1 };

        for (int i = 0; i < rectangleArray.length; i++) {
            System.out.printf("r%d:\n", i);
            System.out.printf("\tWidth: %f\n", rectangleArray[i].getWidth());
            System.out.printf("\tHeight: %f\n", rectangleArray[i].getHeight());
            System.out.printf("\tArea: %f\n", rectangleArray[i].getArea());
            System.out.printf("\tPerimeter: %f\n", rectangleArray[i].getPerimeter());
        }
    }
}
