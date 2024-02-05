package lesson4.homework.task1;

public class Product {

    private static String companyName;
    private int productID;
    private String productName;


    static {
        companyName = "MyCompany";
    }


    {
        productID = 1000;
    }

    public Product(String productName) {
        this.productName = productName;
        productID++;
    }

    public static String getCompanyName() {
        return companyName;
    }

    public int getProductID() {
        return productID;
    }

    public String getProductName() {
        return productName;
    }
}


