package lesson7.homework;

public abstract class Employee {
    protected String name;
    protected int experience;

    public Employee(String name, int experience) {
        this.name = name;
        this.experience = experience;
    }

    public int getExperience() {
        return experience;
    }

    public abstract double calculateSalary();

}
