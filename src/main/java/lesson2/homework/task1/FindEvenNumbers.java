package lesson2.homework.task1;

import java.util.Scanner;

public class FindEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Even numbers between 0 and " + number + ":");

        for (int i = 0; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
