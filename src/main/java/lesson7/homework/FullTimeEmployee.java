package lesson7.homework;


class FullTimeEmployee extends Employee {

    private double salary;

    public FullTimeEmployee(String name, int experience, double salary) {
        super(name, experience);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}






