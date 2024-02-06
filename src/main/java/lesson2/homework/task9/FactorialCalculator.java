package lesson2.homework.task9;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();

        long factorial = calculateFactorial(number);

        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }

    private static long calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers.");
            return -1;
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }
}
