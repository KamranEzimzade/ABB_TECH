package lesson4;

public class ObjectConstructor {

    public static void main(String[] args) {

        Person person = new Person("Name", 30);
        Person person2 = new Person("Name2", 40);

        System.out.println(person.age);
        System.out.println(person2.age);


    }
}
