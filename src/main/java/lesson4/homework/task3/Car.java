package lesson4.homework.task3;

public class Car {

    private String brand;
    private String model;
    private int yearOfProduction;
    private String fuelType;
    private double speed;


    public Car(String brand, String model, int yearOfProduction, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.fuelType = fuelType;
        speed = 0;
    }

    void speed(double amount) {
        speed += amount;
    }

    public void slow(double amount) {
        if (speed - amount >= 0) {
            speed -= amount;
        } else {
            speed = 0;
        }
    }

    void stop() {
        speed = 0;
    }

    public void checkSpeed(double speedLimit) {
        if (speed > speedLimit) {
            System.out.println("Warning: Speeding! Please slow down.");
        } else {
            System.out.println("Speed is within the limit.");
        }
    }


    public double getSpeed() {
        return speed;
    }

    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022, "Gasoline");
        myCar.speed(80.0);
        System.out.println("Current Speed: " + myCar.getSpeed());
        myCar.checkSpeed(90.0);
        myCar.slow(40.0);
        System.out.println("Current Speed: " + myCar.getSpeed());
        myCar.stop();
        System.out.println("Current Speed: " + myCar.getSpeed());
    }


}
