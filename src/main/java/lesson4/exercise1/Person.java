package lesson4.exercise1;

public class Person {

    String name;
    int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public static void main(String[] args) {
        Person kamran = new Person("Kamran", 30);
        System.out.println(kamran.name + " " + kamran.age);

    }
}
