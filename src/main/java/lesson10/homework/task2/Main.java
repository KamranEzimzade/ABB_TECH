package lesson10.homework.task2;

import java.util.Scanner;

public class Main {
    public static void validateInput(int age) throws InvalidInputException {
        int minAge = 0;
        int maxAge = 120;

        if (age < minAge || age > maxAge) {
            throw new InvalidInputException("Age must be between " + minAge + " and " + maxAge + ".");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");

        try {
            int age = Integer.parseInt(scanner.nextLine());

            validateInput(age);

            System.out.println("Valid age entered: " + age);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer for age.");
        } catch (InvalidInputException e) {
            System.out.println("Invalid input: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
