package lesson9.homework;

class MastercardFactory implements AbstractFactory {
    public CreditCard createCreditCard() {
        return new MastercardCreditCard();
    }
}
