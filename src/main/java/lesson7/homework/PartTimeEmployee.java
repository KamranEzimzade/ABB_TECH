package lesson7.homework;

class PartTimeEmployee extends Employee {
    private int hours;
    private double hourlySalary;

    public PartTimeEmployee(String name, int experience, int hours, double hourlySalary) {
        super(name, experience);
        this.hours = hours;
        this.hourlySalary = hourlySalary;
    }

    @Override
    public double calculateSalary() {
        return hours * hourlySalary;
    }
}
