package lesson4.homework.task1;


import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the product: ");
        String productName = scanner.nextLine();

        Product product = new Product(productName);

        System.out.println("Company Name: " + Product.getCompanyName());
        System.out.println("Product ID: " + product.getProductID());
        System.out.println("Product Name: " + product.getProductName());

        scanner.close();
    }
}
