package lesson4.exercise1;

public class Car {

    String model;
    int year;


    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.startEngine();
    }

    void startEngine() {
        System.out.println("Engine started");
    }
}
