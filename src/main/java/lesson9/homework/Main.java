package lesson9.homework;

public class Main {
    public static void main(String[] args) {
        AbstractFactory visaFactory = new VisaFactory();
        CreditCard visaCard = visaFactory.createCreditCard();

        AbstractFactory mastercardFactory = new MastercardFactory();
        CreditCard mastercard = mastercardFactory.createCreditCard();

        visaCard.getInfo();
        mastercard.getInfo();

        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPaymentStrategy(visaCard));
        cart.checkout(100);

        cart.setPaymentStrategy(new CreditCardPaymentStrategy(mastercard));
        cart.checkout(200);
    }
}
