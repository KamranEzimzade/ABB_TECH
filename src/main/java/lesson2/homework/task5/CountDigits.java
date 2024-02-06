package lesson2.homework.task5;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int digitCount = 0;

        while (number != 0) {
            number /= 10;
            digitCount++;
        }

        System.out.println("Number of digits: " + digitCount);

        scanner.close();
    }
}
