package lesson5.homework.task1;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new FullTimeEmployee("Elvin Babayev", 11, 2000));
        employees.add(new FullTimeEmployee("Ceyhun Soltanov", 55, 1500));

        employees.add(new PartTimeEmployee("Yusif Alizade", 48, 2.5, 30));
        employees.add(new PartTimeEmployee("Arif Ağayev", 76, 3, 25));

        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("------------------------------");
        }
    }
}
