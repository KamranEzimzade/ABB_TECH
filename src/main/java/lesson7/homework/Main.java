package lesson7.homework;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Object> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("Arif", 3, 50000));
        employees.add(new FullTimeEmployee("Gunel", 1, 45000));
        employees.add(new PartTimeEmployee("Cavid", 4, 20, 30.0));
        employees.add(new PartTimeEmployee("Aysel", 2, 15, 25.0));

        Map<String, Double> salaryMap = new HashMap<>();
        List<Object> filteredEmployees = employees.stream()
                .filter(emp -> {
                    if (emp instanceof FullTimeEmployee) {
                        return ((FullTimeEmployee) emp).getExperience() > 2;
                    } else if (emp instanceof PartTimeEmployee) {
                        return ((PartTimeEmployee) emp).getExperience() > 2;
                    }
                    return false;
                })
                .sorted(Comparator.comparingInt(emp -> {
                    if (emp instanceof FullTimeEmployee) {
                        return ((FullTimeEmployee) emp).getExperience();
                    } else if (emp instanceof PartTimeEmployee) {
                        return ((PartTimeEmployee) emp).getExperience();
                    }
                    return 0;
                }))
                .collect(Collectors.toList());

        if (!filteredEmployees.isEmpty()) {
            Object maxSalaryEmp = filteredEmployees.get(filteredEmployees.size() - 1);
            Object minSalaryEmp = filteredEmployees.get(0);
            if (maxSalaryEmp instanceof FullTimeEmployee) {
                salaryMap.put("MaxSalaryEmployee", ((FullTimeEmployee) maxSalaryEmp).getSalary());
            } else if (maxSalaryEmp instanceof PartTimeEmployee) {
                salaryMap.put("MaxSalaryEmployee", ((PartTimeEmployee) maxSalaryEmp).getHourlySalary() * ((PartTimeEmployee) maxSalaryEmp).getHours());
            }
            if (minSalaryEmp instanceof FullTimeEmployee) {
                salaryMap.put("MinSalaryEmployee", ((FullTimeEmployee) minSalaryEmp).getSalary());
            } else if (minSalaryEmp instanceof PartTimeEmployee) {
                salaryMap.put("MinSalaryEmployee", ((PartTimeEmployee) minSalaryEmp).getHourlySalary() * ((PartTimeEmployee) minSalaryEmp).getHours());
            }
        }

        System.out.println("Employees with experience greater than 2 sorted by experience:");
        for (Object emp : filteredEmployees) {
            if (emp instanceof FullTimeEmployee) {
                System.out.println("Full Time Employee: " + ((FullTimeEmployee) emp).getExperience());
            } else if (emp instanceof PartTimeEmployee) {
                System.out.println("Part Time Employee: " + ((PartTimeEmployee) emp).getExperience());
            }
        }

        System.out.println("\nMax and Min Salary Employees:");
        for (Map.Entry<String, Double> entry : salaryMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
