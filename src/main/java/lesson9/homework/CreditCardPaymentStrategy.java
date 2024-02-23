package lesson9.homework;

class CreditCardPaymentStrategy implements PaymentStrategy {
    private CreditCard creditCard;

    public CreditCardPaymentStrategy(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public void pay(int amount) {
        System.out.print("Paying with credit card: ");
        creditCard.getInfo();
        System.out.println("Amount paid: $" + amount);
    }
}
