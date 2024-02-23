package lesson9.homework;

class VisaFactory implements AbstractFactory {
    public CreditCard createCreditCard() {
        return new VisaCreditCard();
    }
}
