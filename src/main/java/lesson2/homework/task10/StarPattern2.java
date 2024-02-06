package lesson2.homework.task10;

import java.util.Scanner;


public class StarPattern2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the tree: ");
        int height = scanner.nextInt();

        for (int i = 1; i <= height; i++) {
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}

