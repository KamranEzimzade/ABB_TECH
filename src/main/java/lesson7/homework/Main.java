package lesson7.homework;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Arif", 3, 50000));
        employees.add(new FullTimeEmployee("Gunel", 1, 45000));
        employees.add(new PartTimeEmployee("Cavid", 4, 20, 30.0));
        employees.add(new PartTimeEmployee("Aysel", 2, 15, 25.0));

        Map<String, Double> salaryMap = new HashMap<>();
        List<Employee> filteredEmployees = employees.stream()
                .filter(emp -> emp.getExperience() > 2)
                .sorted(Comparator.comparingInt(Employee::getExperience))
                .collect(Collectors.toList());

        if (!filteredEmployees.isEmpty()) {
            Employee minSalaryEmp = filteredEmployees.get(filteredEmployees.size() - 1);
            Employee maxSalaryEmp = filteredEmployees.get(0);
            salaryMap.put("MinSalaryEmployee", minSalaryEmp.calculateSalary());
            salaryMap.put("MaxSalaryEmployee", maxSalaryEmp.calculateSalary());
        }

        System.out.println("Employees with experience greater than 2 sorted by experience:");
        for (Employee emp : filteredEmployees) {
            System.out.println("Employee: " + emp.getExperience());
        }

        System.out.println("\nMax and Min Salary Employees:");
        for (Map.Entry<String, Double> entry : salaryMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

