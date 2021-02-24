/*
 * Write a program that prompts the user to enter
 * a number of points in a convex polygon, enter the points
 * clockwise, then displays the area of the polygon.
 */

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author tnebes 24 February 2021
 */
public class AreaOfConvexPolygon {

    class Point {
        private final Double x;
        private final Double y;

        public Point(Double x, Double y) {
            this.x = x;
            this.y = y;
        }

        public Double getX() {
            return x;
        }

        public Double getY() {
            return y;
        }
    }

    AreaOfConvexPolygon() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points: ");
        Integer numberOfPoints = input.nextInt();
        System.out.print("Enter the coordinates of the points:\n");
        ArrayList<Point> coordinates = getUserCoordinates(numberOfPoints, input);
        Double area = getAreaFromCoordinates(coordinates);
        System.out.print("The total area is ");
        System.out.print(area);
    }

    private Double getAreaFromCoordinates(ArrayList<Point> coordinates) {
        ArrayList<Point> reversedCoordinates = reverseCoordinates(coordinates);
        Double leftSum = 0.0;
        for (int i = 0; i < reversedCoordinates.size() - 1; i++) {
            leftSum += reversedCoordinates.get(i).getX() * reversedCoordinates.get(i + 1).getY();
        }
        leftSum += reversedCoordinates.get(reversedCoordinates.size() - 1).getX() * reversedCoordinates.get(0).getY();

        Double rightSum = 0.0;
        for (int i = 0; i < reversedCoordinates.size() - 1; i++) {
            rightSum += reversedCoordinates.get(i).getY() * reversedCoordinates.get(i + 1).getX();
        }
        rightSum += reversedCoordinates.get(reversedCoordinates.size() - 1).getY() * reversedCoordinates.get(0).getX();

        return ((leftSum - rightSum) / 2);
    }

    private ArrayList<Point> reverseCoordinates(ArrayList<Point> coordinates) {
        ArrayList<Point> reversedCoordinates = new ArrayList<>();
        for (int i = coordinates.size() - 1; i >= 0; i--) {
            reversedCoordinates.add(coordinates.get(i));
        }
        return reversedCoordinates;
    }

    private ArrayList<Point> getUserCoordinates(Integer numberOfPoints, Scanner input) {
        ArrayList<Point> myPoints = new ArrayList<>();
        for (int i = 0; i < numberOfPoints; i++) {
            System.out.print(i + 1 + ": ");
            myPoints.add(new Point(input.nextDouble(), input.nextDouble()));
        }
        return myPoints;
    }

    public static void main(String[] args) {
        new AreaOfConvexPolygon();
    }
}
