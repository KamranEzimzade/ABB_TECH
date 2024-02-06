package lesson2.homework.task7;

import java.util.Scanner;

public class TriangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the 1st side of the triangle: ");
        double side1 = scanner.nextDouble();

        System.out.print("Enter the length of the 2nd side of the triangle: ");
        double side2 = scanner.nextDouble();

        System.out.print("Enter the length of the 3rd side of the triangle: ");
        double side3 = scanner.nextDouble();

        if (isTriangleValid(side1, side2, side3)) {
            double perimeter = side1 + side2 + side3;
            double s = perimeter / 2;
            double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));

            System.out.println("Area of the triangle: " + area);
            System.out.println("Perimeter of the triangle: " + perimeter);
        } else {
            System.out.println("Cannot form a triangle with these side lengths.");
        }

        scanner.close();
    }

    private static boolean isTriangleValid(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}

