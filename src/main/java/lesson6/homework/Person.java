package lesson6.homework;


class Person {
    private static int idCounter = 1;
    protected int id;
    protected String name;
    protected int age;

    public Person(String name, int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age must be a positive integer.");
        }
        this.id = idCounter++;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}










